import router from './router';
import store from './store';
import { getToken } from '@/utils/auth';
import NProgress from 'nprogress';
import 'nprogress/nprogress.css';

NProgress.configure({ showSpinner: false });

router.beforeEach(async(to, from, next) => {
  NProgress.start();
  const hasToken = getToken();
  if (hasToken) {
    if (to.path === '/login') {
      next({ path: '/' });
      NProgress.done();
    } else {
      const hasRoles = store.getters.roles && store.getters.roles.length > 0;
      if (hasRoles) {
        next();
      } else {
        try {
          const { roles } = await store.dispatch('user/getInfo');
          const accessRoutes = await store.dispatch('permission/generateRoutes', roles);

          router.addRoutes(accessRoutes);
          next({ ...to, replace: true});
        } catch (error) {
          await store.dispatch('user/resetToken');
          NProgress.done();
        }
      }
      
      NProgress.done();
    }
  } else {
    // has no token
    try {
      await store.dispatch('user/login');
      next({ path: '/' });
    } catch (error) {
      NProgress.done();
    }    
  }
});

router.afterEach(() => {
  NProgress.done();
});
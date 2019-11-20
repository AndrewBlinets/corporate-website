import Vue from 'vue';
import VueRouter from 'vue-router';

import Layout from '@/layout';

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'layout',
    component: Layout,
    redirect: '/login',
    children: [
      {
        path: 'login',
        name: 'login',
        component: () => import('@/views/login')
      },
      {
        path: 'reminder',
        name: 'reminder',
        component: () => import('@/views/reminder')
      },
      {
        path: 'registration',
        name: 'registration',
        redirect: '/login',
        component: () => import('@/views/registration')
      }
    ]
  },
  {
    path: '*',
    redirect: '/login'
  }
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
});

export default router;

import Vue from 'vue';
import Router from 'vue-router';

Vue.use(Router);

import Layout from '@/layout';

export const constantRoutes = [
  {
    path: '/',
    name: 'layout',
    component: Layout,
    children: [
      {
        path: '',
        name: 'home',
        component: () => import('@/views/home')
      },
      {
        path: 'contacts',
        name: 'contacts',
        component: () => import('@/views/contacts')
      },
      {
        path: 'news',
        name: 'news',
        component: () => import('@/views/news')
      },
      {
        path: 'news/:id',
        name: 'article',
        component: () => import('@/views/article')
      },
      {
        path: 'projects',
        name: 'projects',
        component: () => import('@/views/projects')
      },
      {
        path: 'projects/:id',
        name: 'projects',
        component: () => import('@/views/projects/Project.vue')
      },
      {
        path: 'eastern-partnership',
        name: 'eastern-partnership',
        component: () => import('@/views/eastern-partnership')
      },
      {
        path: 'technical-committee',
        name: 'technical-committee',
        component: () => import('@/views/technical-committee')
      },
      {
        path: 'about-us',
        name: 'about-us',
        component: () => import('@/views/about-us')
      }
    ]
  }
];

const createRouter = () => new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
});

const router = createRouter();

export default router;

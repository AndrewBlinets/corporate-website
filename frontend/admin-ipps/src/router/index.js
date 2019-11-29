import Vue from 'vue';
import VueRouter from 'vue-router';

import Layout from '@/layout';

Vue.use(VueRouter);

export const constantRoutes = [
  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    meta: {
      title: 'Dashboard'
    },
    children: [
      {
        path: 'dashboard',
        name: 'dashboard',
        component: () => import('@/views/dashboard'),        
      },
    ]
  },
];

export const asyncRoutes = [
  {
    path: '/news',
    component: Layout,
    meta: {
      title: 'Новости',
      roles: ['super-admin']
    },
    children: [
      {
        path: '',
        name: 'news',
        component: () => import('@/views/news')
      }
    ]
  },
  {
    path: '/projects',
    component: Layout,
    meta: {
      title: 'Проекты',
      roles: ['super-admin', 'super-editor']
    },
    children: [
      {
        path: '',
        name: 'projects',
        component: () => import('@/views/news')
      }
    ]
  }
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: constantRoutes
});

export default router;

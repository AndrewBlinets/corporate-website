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
        component: () => import('@/views/dashboard')
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: () => import('@/views/login')
  }
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
        component: () => import('@/views/news'),
      },
      {
        path: 'create',
        name: 'create-news',
        component: () => import('@/views/news/Article')
      },
      {
        path: ':id',
        name: 'news-id',
        component: () => import('@/views/news/Article')
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
  },
  {
    path: '/department',
    component: Layout,
    meta: {
      title: 'Отделы',
      roles: ['super-admin', 'super-editor']
    },
    children: [
      {
        path: '',
        name: 'department',
        component: () => import('@/views/department')
      },
      {
        path: ':id',
        name: 'department-id',
        component: () => import('@/views/department')
      },
      {
        path: 'create',
        name: 'department-create',
        component: () => import('@/views/department')
      }
    ]
  },
  {
    path: '/contact',
    component: Layout,
    meta: {
      title: 'Контакты',
      roles: ['super-admin', 'super-editor']
    },
    children: [
      {
        path: '',
        name: 'contact',
        component: () => import('@/views/contact')
      },
      {
        path: ':id',
        name: 'contact-id',
        component: () => import('@/views/contact')
      },
      {
        path: 'create',
        name: 'contact-create',
        component: () => import('@/views/contact')
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

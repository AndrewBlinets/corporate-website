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
    path: '/pages',
    component: Layout,
    meta: {
      title: 'Страницы',
      roles: ['super-admin', 'editor-department']
    },
    children: [
      {
        path: '',
        name: 'pages',
        component: () => import('@/views/pages'),
        meta: {
          title: 'Страницы'
        }
      },
    ]
  },
  {
    path: '/pages/:id',
    component: Layout,
    meta: {
      title: 'Страницa',
      roles: ['editor-department']
    },
    children: [
      {
        path: '',
        name: 'page-id',
        component: () => import('@/views/pages/Page'),
      },
      {
        path: 'create-section',
        name: 'create-section',
        component: () => import('@/views/pages/Section')
      },
      {
        path: ':sectionId',
        name: 'section-id',
        component: () => import('@/views/pages/Section')
      }
    ]
  },
  {
    path: '/news',
    component: Layout,
    meta: {
      title: 'Новости',
      roles: ['super-admin', 'editor-department']
    },
    children: [
      {
        path: '',
        name: 'news',
        component: () => import('@/views/news'),
        meta: {
          title: 'Новости'
        }
      },
      {
        path: 'create',
        name: 'create-news',
        component: () => import('@/views/news/Article'),
        meta: {
          title: 'Создать новость'
        }
      },
      {
        path: ':id',
        name: 'news-id',
        component: () => import('@/views/news/Article'),
        props: true
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
        component: () => import('@/views/projects')
      },
      {
        path: 'create',
        name: 'create-project',
        component: () => import('@/views/projects/Project')
      },
      {
        path: ':id',
        name: 'project-id',
        component: () => import('@/views/projects/Project'),
        props: true
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
      roles: ['super-admin', 'super-editor', 'editor']
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
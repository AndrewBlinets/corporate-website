import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

import MainLayout from '@/layouts/main-layout'
import AdminLayout from '@/layouts/admin-layout'

export const constantRoutes = [
  {
    path: '/',
    name: 'Layout',
    component: MainLayout,
    children: [
      {
        path: '',
        name: 'home',
        component: () => import('@/views/home')
      },
      {
        path: 'article',
        name: 'article',
        component: () => import('@/views/article')
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
        path: 'projects',
        name: 'projects',
        component: () => import('@/views/projects')
      }
    ]
  },
  {
    path: '/dashboard',
    name: 'AdminLayout',
    component: AdminLayout,
    children: [
      {
        path: 'news',
        name: 'News',
        component: () => import('@/views/admin-dashboard/news')
      },
      {
        path: 'create',
        name: 'CreateArticle',
        component: () => import('@/views/admin-dashboard/news/components/CreateArticle')
      }
    ]
  }
]

const createRouter = () => new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()

export default router

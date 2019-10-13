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
        name: 'Home',
        component: () => import('@/views/home')
      },
      {
        path: 'article',
        name: 'Article',
        component: () => import('@/views/article')
      }
    ]
  },
  {
    path: '/dashboard',
    name: 'AdminLayout',
    component: AdminLayout
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

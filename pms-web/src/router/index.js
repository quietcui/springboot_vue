import VueRouter from "vue-router"
import login from '../components/AppLogin.vue'
import index from '../components/AppIndex.vue'

const routes = [
  {
    path: '/',
    name: 'login',
    component: login
  },
  {
    path: '/index',
    name: 'index',
    component: index
  }
]

const router = new VueRouter({
  mode:'history',
  routes
})

export default router

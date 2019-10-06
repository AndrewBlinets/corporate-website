import Vue from 'vue'

import App from './App.vue'
import router from '@/router'
import store from '@/store'

import { library } from '@fortawesome/fontawesome-svg-core'
import { faCommentAlt } from '@fortawesome/free-solid-svg-icons'
import { faFacebookF, faVk, faTwitter, faYoutube } from '@fortawesome/free-brands-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'

import '@/styles/index.styl'

library.add(faCommentAlt, faFacebookF, faVk, faTwitter, faYoutube)

Vue.component('font-awesome-icon', FontAwesomeIcon)

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')

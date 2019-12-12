import Vue from 'vue';

import ElementUI from 'element-ui';
import locale from 'element-ui/lib/locale/lang/ru-RU';
import 'element-ui/lib/theme-chalk/index.css';

import App from './App.vue';

import router from '@/router';
import store from '@/store';
import * as filters from '@/filters';

import { library } from '@fortawesome/fontawesome-svg-core';
import { faCommentAlt, faUserTie, faBriefcase, faClock } from '@fortawesome/free-solid-svg-icons';
import { faFacebookF, faVk, faTwitter, faYoutube } from '@fortawesome/free-brands-svg-icons';
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome';

import '@/styles/index.styl';
import '@fortawesome/fontawesome-free/css/all.css';
import '@fortawesome/fontawesome-free/js/all.js';

library.add(faCommentAlt, faFacebookF, faVk, faTwitter, faYoutube, faUserTie, faBriefcase, faClock);

Vue.component('font-awesome-icon', FontAwesomeIcon);

Vue.config.productionTip = false;

Vue.use(ElementUI, { locale });

Object.keys(filters).forEach((key) => {
  Vue.filter(key, filters[key]);
});

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app');

import Vue from 'vue';
import Vuex from 'vuex';

import permission from './modules/permission';
import user from './modules/user';

Vue.use(Vuex);

const store = new Vuex.Store({
  state: {
  },
  mutations: {
  },
  getters: {
    permissionRoutes: state => state.permission.routes,
    roles: state => state.user.roles,
    token: state => state.user.token
  },
  actions: {
  },
  modules: {
    permission,
    user
  }
});

export default store;

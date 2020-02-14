import Vue from 'vue';
import Vuex from 'vuex';

import getters from './getters';

const requireModules = require.context('./modules', true, /\.js$/);

const modules = requireModules.keys().reduce((modules, modulePath) => {
  const moduleName = modulePath.replace(/^\.\/(.*)\.\w+$/, '$1');
  const value = requireModules(modulePath);
  modules[moduleName] = value.default;
  return modules;
}, {});

Vue.use(Vuex);

const store = new Vuex.Store({
  modules,
  getters
});

export default store;

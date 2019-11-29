import { login, logout, getInfo } from '@/api/user';
import { getToken, setToken, removeToken } from '@/utils/auth';

const state = {
  token: getToken(),
  name: '',
  roles: []
};

const mutations = {
  SET_TOKEN: (state, token) => {
    state.token = token;
  },
  SET_NAME: (state, name) => {
    state.name = name;
  },
  SET_ROLES: (state, roles) => {
    state.roles = roles;
  }
};

const actions = {
  login({ commit }, userInfo = { username: 'javainuse', password: 'password' }) {
    const { username, password } = userInfo;    
    return new Promise((resolve, reject) => {
      login({ username, password }).then(data => {
        commit('SET_TOKEN', data.token);
        setToken(data.token);        
        resolve();
      }).catch(error => {
        reject(error);
      });
    });
  },

  getInfo({ commit, state }) {
    return new Promise((resolve, reject) => {
      getInfo(state.token).then(data => {
        const { name, roles } = data;

        commit('SET_NAME', name);
        commit('SET_ROLES', roles);
        resolve(data);
      }).catch(error => {
        reject(error);
      });
    });
  },

  logout({ commit, state }) {
    return new Promise((resolve, reject) => {
      logout(state.token).then(() => {
        commit('SET_TOKEN', '');
        commit('SET_ROLES', []);
        removeToken();
        resolve();
      }).catch(error => {
        reject(error);
      });
    });
  },

  resetToken({ commit }) {
    return new Promise(resolve => {
      commit('SET_TOKEN', '');
      commit('SET_ROLES', []);
      removeToken();
      resolve();
    });
  }
};

export default {
  namespaced: true,
  state,
  mutations,
  actions
};
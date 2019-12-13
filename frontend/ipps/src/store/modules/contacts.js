import { getContacts } from '@/api/contacts';

const state = {
  contactsList: []
};

const mutations = {
  SET_CONTACTS_LIST: (state, list) => {
    state.contactsList = list;
  }
};

const actions = {
  getContacts({ commit }) {
    return new Promise((resolve, reject) => {
      getContacts().then(data => {
        commit('SET_CONTACTS_LIST', data);
        resolve();
      }).catch(error => {
        reject(error);
      });
    });
  }
};

export default {
  namespaced: true,
  state,
  mutations,
  actions
};
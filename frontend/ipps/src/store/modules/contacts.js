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
    return new Promise(resolve => {
      getContacts().then(data => {
        commit('SET_CONTACTS_LIST', data);
        resolve();
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
import { getPartners } from '@/api/partners';

const state = {
  partnersList: []
};

const mutations = {
  SET_PRTNERS_LIST: (state, list) => {
    state.partnersList = list;
  }
};

const actions = {
  getPartners({ commit }) {
    return new Promise((resolve, reject) => {
      getPartners().then(data => {
        commit('SET_PRTNERS_LIST', data);
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
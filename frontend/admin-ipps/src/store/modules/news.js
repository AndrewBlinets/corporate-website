import { getNews } from '@/api/news';

const state = {
  newsList: []
};

const mutations = {
  SET_NEWS_LIST: (state, newsList) => {
    state.newsList = newsList;
  }
};

const actions = {
  getNews({ commit }) {
    return new Promise((resolve, reject) => {
      getNews().then(data => {
        const { content } = data;
        commit('SET_NEWS_LIST', content);
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
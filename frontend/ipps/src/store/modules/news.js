import { getNewsList, getNewsById } from '@/api/news';

const state = {
  article: {},
  newsList: []
};

const mutations = {
  SET_ARTICLE: (state, article) => {
    state.article = article;
  },
  SET_NEWS_LIST: (state, list) => {
    state.newsList = list;
  }
};

const actions = {
  getArticle({ commit }, id) {
    getNewsById(id).then(data => {
      commit('SET_ARTICLE', data);
    }).catch(error => {
      // eslint-disable-next-line no-console
      console.log(error);
    });
  },
  getNews({ commit }, params) {
    getNewsList(params).then(data => {
      const { content } = data;
      commit('SET_NEWS_LIST', content.slice(0, params.size));
    }).catch(error => {
      // eslint-disable-next-line no-console
      console.log(error);
    });
  }
};

export default {
  namespaced: true,
  state,
  mutations,
  actions
};
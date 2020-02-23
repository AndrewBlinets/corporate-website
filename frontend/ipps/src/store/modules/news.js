import { getNewsList, getNewsById } from '@/api/news';

const state = {
  newsList: [],
  hasNewsFull: false,
  params: {
    size: 9,
    page: 0
  },
  article: {}
};

const mutations = {
  SET_NEWS_LIST: (state, list) => {
    if (state.params.page) {
      state.newsList = state.newsList.concat(list);
    } else {
      state.newsList = list;
    }
  },
  SET_HAS_NEWS_FULL: (state, value) => {
    state.hasNewsFull = value;
  },
  SET_PARAMS: (state, params) => {
    state.params = params;
  },
  ADD_PARAMS: (state, params) => {
    Object.assign(state.params, params);
  },
  SET_ARTICLE: (state, article) => {
    state.article = article;
  }
};

const getters = {
  page: state => state.params.page
};

const actions = {
  getNews({ commit }, params = {}) {
    commit('ADD_PARAMS', params);
    return new Promise(resolve => {
      getNewsList(state.params).then(data => {
        const { content, number, totalPages } = data;
        
        if ((number + 1) === totalPages) commit('SET_HAS_NEWS_FULL', true);
        commit('SET_NEWS_LIST', content);
        resolve();
      });
    });
  },
  getArticle({ commit }, id) {
    return new Promise(resolve => {
      getNewsById(id).then(data => {
        commit('SET_ARTICLE', data);
        resolve();
      });
    });
  },
  resetNews({ commit }) {
    commit('SET_NEWS_LIST', []);
    commit('SET_HAS_NEWS_FULL', false);
    commit('SET_PARAMS', { size: 9, page: 0 });
    return Promise.resolve();
  },
  resetArticle({ commit }) {
    commit('SET_ARTICLE', {});
    return Promise.resolve();
  }
};

export default {
  namespaced: true,
  state,
  mutations,
  getters,
  actions
};
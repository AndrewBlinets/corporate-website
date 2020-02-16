import { 
  getNewsList,
  getNews,
  createNews,
  updateNews,
  deleteNews
} from '@/api/news';

const state = {
  newsList: {},
  totalPages: null,
  params: {
    size: 10
  },
  news: {}
};

const mutations = {
  SET_NEWS_LIST: (state, newsList) => {
    state.newsList = newsList;
  },
  ADD_PARAMS: (state, params) => {
    Object.assign(state.params, params);
  },
  SET_PARAMS_LIST: (state, params) => {
    const { size, page} = params;
    state.size = size;
    state.page = page;
  },
  SET_NEWS: (state, news) => {
    state.news = news;
  }
};

const getters = {
  newsListData: state => state.newsList.content,
  newsListTotal: state => state.newsList.totalElements
};

const actions = {
  getNewsList({ state, commit }, params = {}) {
    commit('ADD_PARAMS', params);
    return new Promise((resolve) => {
      getNewsList(state.params).then(data => {
        commit('SET_NEWS_LIST', data);
        resolve();
      });
    });
  },
  getNews({ commit }, id) {
    return new Promise((resolve) => {
      getNews(id).then(data => {
        commit('SET_NEWS', data);
        resolve();
      });
    });
  },
  createNews({ commit }, department) {
    return new Promise((resolve) => {
      createNews(department).then((data) => {
        commit('', data);
        resolve();
      });
    });
  },
  updateNews({ commit, getters }, department) {
    return new Promise((resolve) => {
      updateNews(department).then((data) => {
        const { id } = data;
        const index = getters.getIndex(id);
        commit('', { index, department });
        resolve();
      });
    });
  },
  deleteNews({ commit }, id) {
    return new Promise((resolve) => {
      deleteNews(id).then(() => {
        commit('', id);
        resolve();
      });
    });
  },

};

export default {
  namespaced: true,
  state,
  mutations,
  getters,
  actions
};
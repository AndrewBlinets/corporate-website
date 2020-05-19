const state = {
  mobile: false,
  sidebar: false,
};

const mutations = {
  SET_MOBILE: (state, value) => {
    state.mobile = value;
  },
  SET_SIDEBAR: (state, value) => {
    state.sidebar = value;
  },
};

const actions = {
  openSidebar({ commit }) {
    commit('SET_SIDEBAR', true);
    return Promise.resolve();
  },
  closeSidebar({ commit }) {
    commit('SET_SIDEBAR', false);
    return Promise.resolve();
  },
  hasMobileDevice({ commit }, value) {
    commit('SET_MOBILE', value);
    return Promise.resolve();
  },
};

export default {
  namespaced: true,
  state,
  mutations,
  actions,
};

import {
  getProjectsList,
  getProject,
  createProject,
  updateProject,
  deleteProject
} from '@/api/project';

const state = {
  projectsList: {},
  params: {
    size: 10,
    page: 0
  },
  project: {}
};

const mutations = {
  SET_PROJECTS_LIST: (state, list) => {
    state.projectsList = list;
  },
  ADD_PARAMS: (state, params) => {
    Object.assign(state.params, params);
  },
  REMOVE_PARAMS: (state, name) => {
    delete state.params[name];
  },
  SET_PARAMS_LIST: (state, params) => {
    const { size, page} = params;
    state.size = size;
    state.page = page;
  },
  SET_PROJECT: (state, project) => {
    state.project = project;
  }
};

const getters = {
  projectsListData: state => state.projectsList.content,
  projectsListTotal: state => state.projectsList.totalElements
};

const actions = {
  getProjectsList({ state, commit }, params = {}) {
    commit('ADD_PARAMS', params);
    return new Promise(resolve => {
      getProjectsList(state.params).then(data => {
        commit('SET_PROJECTS_LIST', data);
        resolve();
      });
    });
  },
  getProject({ commit }, id) {
    return new Promise(resolve => {
      getProject(id).then(data => {
        commit('SET_PROJECT', data);
        resolve();
      });
    });
  },
  createProject({ commit }, project) {
    return new Promise(resolve => {
      createProject(project).then(data => {
        commit('SET_PROJECT', data);
        resolve(data.id);
      });
    });
  },
  updateProject({ commit }, project) {
    return new Promise((resolve) => {
      updateProject(project).then(data => {
        commit('SET_PROJECT', data);
        resolve();
      });
    });
  },
  deleteProject({ dispatch }, id) {
    return new Promise(resolve => {
      deleteProject(id).then(() => {
        dispatch('getProjectsList');
        resolve();
      });
    });
  },
  resetProject({ commit }) {
    commit('SET_PROJECT', {});
    return Promise.resolve();
  }
};

export default {
  namespaced: true,
  state,
  mutations,
  getters,
  actions,
};
import { getProjectsList, getProjectById } from '@/api/project';

const state = {
  projectsList: [],
  project: {}
};

const mutations = {
  SET_PROJECTS_LIST: (state, list) => {
    state.projectsList = list;
  },
  SET_PROJECT: (state, project) => {
    state.project = project;
  }
};

const actions = {
  getProjectsList({ commit }) {
    return new Promise((resolve, reject) => {
      getProjectsList().then((data) => {
        commit('SET_PROJECTS_LIST', data);
        resolve();
      }).catch(error => {
        reject(error);
      });
    });
  },
  getProject({ commit }, id) {
    return new Promise((resolve, reject) => {
      getProjectById(id).then((data) => {
        commit('SET_PROJECT', data);
        resolve();
      }).reject(error => {
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

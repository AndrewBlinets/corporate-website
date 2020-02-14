import {
  getProjectsList,
  getProject,
  createProject,
  updateProject,
  deleteProject
} from '@/api/project';

const state = {
  departmentsList: [],
  department: {}
};

const mutations = {
  SET_PROJECTS_LIST: (state, list) => {
    state.departmentsList = list;
  },
  SET_PROJECT: (state, department) => {
    state.department = department;
  }
};

const getters = {};

const actions = {
  getProjectsList({ commit }) {
    return new Promise((resolve) => {
      getProjectsList().then(data => {
        commit('SET_PROJECTS_LIST', data);
        resolve();
      });
    });
  },
  getProjectById({ commit }, id) {
    return new Promise((resolve) => {
      getProject(id).then(data => {
        commit('SET_PROJECT', data);
        resolve();
      });
    });
  },
  createProject() {
    return new Promise((resolve) => {
      createProject().then(() => {
        resolve();
      });
    });
  },
  updateProject() {
    return new Promise((resolve) => {
      updateProject().then(() => {
        resolve();
      });
    });
  },
  deleteProjectById(id) {
    return new Promise((resolve) => {
      deleteProject(id).then(() => {
        resolve();
      });
    });
  }
};

export default {
  namespaced: true,
  state,
  mutations,
  getters,
  actions,
};
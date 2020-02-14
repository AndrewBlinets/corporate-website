import axios from 'axios';
import store from '@/store';
import { Message } from 'element-ui';

const service = axios.create({
  baseURL: 'http://www.ipps.by:5454/admin-api',
  timeout: 5000
});

service.interceptors.request.use(
  config => {

    if (store.getters.token) {
      config.headers['Authorization'] = `Bearer ${store.getters.token}`;
    }
    return config;
  },
  error => {
    return Promise.reject(error);
  }
);

service.interceptors.response.use(
  response => {
    const { data } = response;
    
    return data;
  },
  error => {
    Message({
      message: error.message,
      type: 'error',
      duration: 5000
    });
    return Promise.reject(error);
  }
);

export default service;
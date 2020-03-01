import axios from 'axios';
import router from '@/router';

const service = axios.create({
  baseURL: 'http://www.ipps.by:5454/client-api/', // global server
  // baseURL: 'http://192.168.1.125:8080/client-api/', // local server
  timeout: 5000
});

service.interceptors.request.use(
  config => config,
  error => {
    // eslint-disable-next-line no-console
    console.log(1, { error });
    return Promise.reject(error);
  }
);

service.interceptors.response.use(
  response => {
    // eslint-disable-next-line no-console
    const { data } = response;
    return data;
  },
  error => {
    // eslint-disable-next-line no-console
    console.log(2, { error });
    if (error.response.status === 404) {
      router.push({ name: '404' });
    } else if (typeof error.response === 'undefined') {
      router.push({ name: 'network-issue' });
    }
    return Promise.reject(error);
  }
);

export default service;
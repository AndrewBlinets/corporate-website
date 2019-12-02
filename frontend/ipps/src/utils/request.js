import axios from 'axios';

const service = axios.create({
  baseURL: '',
  timeout: 5000
});

service.interceptors.request.use(
  config => config,
  error => {
    // eslint-disable-next-line no-console
    console.log(error);
    return Promise.reject(error);
  }
);

service.interceptors.response.use(
  response => {
    const { data } = response;
    return data;
  },
  error => {
    // eslint-disable-next-line no-console
    console.log('err' + error);
    return Promise.reject(error);
  }
);

export default service;
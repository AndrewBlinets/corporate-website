import axios from 'axios';

const service = axios.create({
  // baseURL: 'http://www.ipps.by:5454', // global server
  baseURL: 'http://192.168.1.125:8080/client-api/', // local server
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
    // eslint-disable-next-line no-console
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
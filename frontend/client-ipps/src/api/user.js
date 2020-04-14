import request from '@/utils/request';

export function login(data) {
  return request({
    url: '/authenticate',
    method: 'POST',
    data,
  });
}

export function logout() {
  return request({
    url: '/logout',
    method: 'POST',
  });
}

export function getInfo() {
  return request({
    url: '/getInfoAboutCustomer',
    method: 'GET',
  });
}

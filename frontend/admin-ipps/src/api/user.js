import request from '@/utils/request';

export function login(data) {
  return request({
    url: '/authenticate',
    method: 'post',
    data
  });
}

export function logout() {
  return request({
    url: '/logout',
    method: 'post'
  });
}

export function getInfo() {
  return request({
    url: '/getInfo',
    method: 'get'
  });
}
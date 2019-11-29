import request from '@/utils/request';

export function login(data) {
  return request({
    url: '/authorization/authenticate',
    method: 'post',
    data
  });
}

export function logout() {
  return request({
    url: '',
    method: 'post'
  });
}

export function getInfo() {
  return request({
    url: '/authorization/getInfo',
    method: 'get'
  });
}
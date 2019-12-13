import request from '@/utils/request';

export function getAboutCompony(params) {
  return request({
    url: '/aboutCompony',
    method: 'get',
    params: params
  });
}

export function getContact(params) {
  return request({
    url: '/contact',
    method: 'get',
    params: params
  });
}

export function getImage(id) {
  return `${request.defaults.baseURL}image/${id}`;
  // return request({
  //   url: `/image/${id}`,
  //   method: 'get'
  // });
}

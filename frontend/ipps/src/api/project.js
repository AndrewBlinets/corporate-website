import request from '@/utils/request';

export function getProjectsList(params) {
  return request({
    url: '/poject',
    method: 'get',
    params: params
  });
}

export function getProjectById(id, params) {
  return request({
    url: `/project/${id}`,
    method: 'get',
    params: params
  });
}

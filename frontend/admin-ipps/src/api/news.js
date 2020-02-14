import request from '@/utils/request';

export function getNews() {
  return request({
    url: '/admin-api/news',
    method: 'get'
  });
}
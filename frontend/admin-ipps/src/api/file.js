import request from '@/utils/request';

const { baseURL } = request.defaults;

export function getFile(id) {
  return `${baseURL}/admin-api/file/${id}`;
}

export function uploadFile() {
  return `${baseURL}/admin-api/file`;
}
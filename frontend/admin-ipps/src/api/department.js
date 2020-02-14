import request from '@/utils/request';

export function getDepartmentsList() {
  return request({
    url: '/department',
    method: 'GET'
  });
}

export function getDepartment(id) {
  return request({
    url: `/department/${id}`,
    method: 'GET'
  });
}

export function createDepartment(data) {
  return request({
    url: '/department',
    method: 'POST',
    data
  });
}

export function updateDepartment(data) {
  return request({
    url: '/department',
    method: 'UPDATE',
    data
  });
}

export function deleteDepartment(id) {
  return request({
    url: `/department/${id}`,
    method: 'DELETE'
  });
}
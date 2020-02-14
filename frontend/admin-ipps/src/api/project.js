import request from '@/utils/request';

export function getProjectsList() {
  return request({
    url: 'admin-api/project',
    method: 'GET'
  });
}

export function getProject(id) {
  return request({
    url: `admin-api/project/${id}`,
    method: 'GET'
  });
}

export function createProject() {
  return request({
    url: 'admin-api/project',
    method: 'POST'
  });
}

export function updateProject() {
  return request({
    url: 'admin-api/project',
    method: 'UPDATE'
  });
}

export function deleteProject(id) {
  return request({
    url: `admin-api/project/${id}`,
    method: 'DELETE'
  });
}
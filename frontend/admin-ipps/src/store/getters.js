const getters = {
  permissionRoutes: state => state.permission.routes,
  roles: state => state.user.roles,
  token: state => state.user.token
};

export default getters;
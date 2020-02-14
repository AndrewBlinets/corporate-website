const getters = {
  permissionRoutes: state => state.permission.routes,
  roles: state => state.user.roles,
  token: state => state.user.token,

  news: state => state.news.newsList
};

export default getters;
const getters = {
  partners: state => state.main.partnersList,
  contacts: state => state.contacts.contactsList,
  news: state => state.news.newsList,
  article: state => state.news.article,
  projects: state => state.project.projectsList,
  project: state => state.project.project
};
export default getters;

<template>
  <div>
    <header-page
      :name="namePage"
      :imageId="imagePageId"
    />
    <div class="body-page">
      <div class="app-container">
        <div class="row mx-n2 mb-5">
          <div class="col-lg-4 col-sm-6 px-2 mb-3">
            <project-card-item />
          </div>
          <div class="col-lg-4 col-sm-6 px-2 mb-3">
            <project-card-item />
          </div>
          <div class="col-lg-4 col-sm-6 px-2 mb-3">
            <project-card-item />
          </div>
          <div class="col-lg-4 col-sm-6 px-2 mb-3">
            <project-card-item />
          </div>
          <div class="col-lg-4 col-sm-6 px-2 mb-3">
            <project-card-item />
          </div>
          <div class="col-lg-4 col-sm-6 px-2 mb-3">
            <project-card-item />
          </div>
          <div class="col-lg-4 col-sm-6 px-2 mb-3">
            <project-card-item />
          </div>
          <div class="col-lg-4 col-sm-6 px-2 mb-3">
            <project-card-item />
          </div>
          <div class="col-lg-4 col-sm-6 px-2 mb-3">
            <project-card-item />
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import HeaderPage from '@/components/HeaderPage';
import ProjectCardItem from '@/components/ProjectCard/ProjectCardItem';

export default {
  name: 'Projects',
  components: {
    HeaderPage,
    ProjectCardItem
  },
  data() {
    return {
      namePage: 'Проекты',
      imagePageId: 17
    };
  }
};
</script>

<style lang="stylus" scoped>
.body-page
  margin-top: 100px
  margin-bottom: 100px
</style>
<template>
  <section id="projects" class="bgr-grey">
    <div class="grid-area">
      <div class="section-header">
        <div class="app-container">
          <h2>Проекты</h2>
        </div>
      </div>
      <div class="section-body">
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
          </div>
          <div class="button-container">
            <div class="button-item">
              <router-link
                :to="{ name: 'projects' }"
                class="btn btn-main"
              >Все Проекты</router-link>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
import ProjectCardItem from '@/components/ProjectCard/ProjectCardItem';

export default {
  name: 'Projects',
  components: {
    ProjectCardItem
  }
};
</script>

<style lang="stylus" scoped>
.projects-container
  margin-bottom: 3rem
</style>

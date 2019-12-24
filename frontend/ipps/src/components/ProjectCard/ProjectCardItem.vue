<template>
  <div class="card project-item">
    <div class="project-img">
      <app-image
        :id="project.imageMain"
        :name="project.name"
      />
    </div>
    <div class="item-overlay">
      <div class="overlay-info">
        <p>{{ project.name }}</p>
      </div>
    </div>
  </div>
</template>

<script>
import AppImage from '@/components/AppImage';

export default {
  name: 'ProjectCardItem',
  components: {
    AppImage
  },
  data() {
    return {
      project: {
        id: 1,
        imageMain: 17,
        name: 'Единое информационное пространство отрасли на базе программных средств автоматизированной информационной системы (АИС) госоргана (ведомства)'
      }
    };
  }
};
</script>

<style lang="stylus" scoped>
.project-item
  position: relative
  width: 100%
  height: 406px
  overflow: hidden
  .project-img
    width: 100%
    height: 100%
  .item-overlay
    position: absolute
    top: 15px
    left: 15px
    right: 15px
    bottom: 15px
    padding: 15px
    background: rgba(255,255,255, 0.8)
    opacity: 0
    visibility: hidden
    -webkit-transition: all .5s
    transition: all .5s
    .overlay-info h5
      font-weight: 300
  &:hover .item-overlay
    visibility: visible
    opacity: 1
</style>
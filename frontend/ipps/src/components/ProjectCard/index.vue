<template>
  <router-link
    :to="{ path: `/projects/${id}` }"
    :style="{ height: height + 'px' }"
    class="project-card"
    tag="div"
  >
    <div class="image">
      <app-image :id="image" :name="title" />
    </div>
    <div class="project-title">
      <h5 class="title">{{ title }}</h5>
    </div>
  </router-link>
</template>

<script>
import AppImage from '@/components/AppImage';

export default {
  name: 'ProjectCard',
  components: {
    AppImage
  },
  props: {
    id: {
      type: Number,
      default: 1
    },
    height: {
      type: Number,
      default: 250
    },
    image: {
      type: Number,
      default: 15
    },
    title: {
      type: String,
      default: ''
    }
  }
};
</script>

<style lang="stylus" scoped>
.project-card
  position: relative
  overflow: hidden
  z-index: 3
  &:hover
    cursor: pointer
    .image
      z-index: 2000
      background: #000;
    .project-title
      opacity: 1
  .image
    width: 100%
    height: 100%
  .project-title
    width: 100%;
    height: 100%;
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    background: #00000050;
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 20px
    text-align: center
    opacity: 0
    -webkit-transition: opacity .2s
    transition: opacity .2s
    .title
      color: #fff
</style>
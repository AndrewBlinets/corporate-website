<template>
  <router-link
    :to="{ path: `/projects/${id}` }"
    :style="{ height: height }"
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
    AppImage,
  },
  props: {
    id: Number,
    title: String,
    height: {
      type: String,
      default: '250px',
    },
    image: {
      type: Number,
      default: 15,
    },
  },
};
</script>

<style lang="stylus" scoped>
.project-card {
  position: relative;
  overflow: hidden;
  z-index: 3;

  &:hover {
    cursor: pointer;

    .image {
      z-index: 2000;
      background: #000;
    }

    .project-title {
      background: #00000050;
    }
  }

  .image {
    width: 100%;
    height: 100%;
  }

  .project-title {
    display: flex;
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    padding: 20px;
    -webkit-transition: 0.2s;
    transition: 0.2s;

    .title {
      color: #fff;
      text-shadow: 1px 1px 1px rgba(0, 0, 0, 0.5);
      margin: auto;
      text-align: center;
    }
  }
}
</style>

<template>
  <img
    :src="urlSmallImg"
    :data-src="url"
    :datasrcset="`${url} 2x`"
    :alt="name"
    class="app-image"
    :class="{ 'blur-image': loading }"
  >
</template>

<script>
import lozad from 'lozad';
import { getImage, getImageSmall } from '@/api/index';

export default {
  name: 'AppImage',
  props: {
    id: {
      type: Number,
      default: null
    },
    name: {
      type: String,
      default: ''
    },
    backgroundColor: {
      type: String,
      default: '#ffffff00'
    },
    height: {
      type: Number,
      default: null
    },
    width: {
      typr: Number,
      default: null
    }
  },
  data() {
    return {
      url: getImage(this.id),
      urlSmallImg: getImageSmall(this.id),
      loading: true
    };
  },
  computed: {
    aspectRatio() {
      if (this.width || !this.height) return null;

      return (this.height / this.width) * 100;
    },
    style() {
      const style = { backgroundColor: this.backgroundColor };

      if (this.width) style.width = `${this.width}px`;

      const applyAspectRatio = this.loading && this.aspectRatio;
      if (applyAspectRatio) {
        style.height = 0;
        style.paddingTop = `${this.aspectRatio}%`;
      }

      return style;
    }
  },
  mounted() {
    const observer = lozad(this.$el, {
      load: (el) => {
        el.src = el.dataset.src;
        el.onload = () => {
          this.loading = false;
        };
      }
    });
    observer.observe();
  }  
};
</script>

<style lang="stylus" scoped>
.app-image
  width: 100%
  height: auto
  transform: scale(1.1)
  transition : .5s

.blur-image
  filter: blur(20px)  
</style>


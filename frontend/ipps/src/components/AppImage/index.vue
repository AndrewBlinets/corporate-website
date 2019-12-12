<template>
  <img
    :data-src="url"
    :datasrcset="`${url} 2x`"
    :style="style"
    :alt="name"
    class="app-image"
  >
</template>

<script>
import lozad from 'lozad';
import { getImage } from '@/api/index';

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
    const setLoadingState = () => {
      this.loading = false;
    };
    this.$el.addEventListener('load', setLoadingState);
    this.$once('hook:destroyed', () => {
      this.$el.removeEventListener('load', setLoadingState);
    });

    const observer = lozad(this.$el);
    observer.observe();
  }  
};
</script>

<style lang="stylus" scoped>
.app-image
  max-width: 100%
  max-height: 100%
  width: auto
  height: auto
  vertical-align: middle
</style>


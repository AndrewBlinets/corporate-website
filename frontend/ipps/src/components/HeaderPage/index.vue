<template>
  <div class="header-page">
    <div class="img-container">
      <app-image
        :id="imageId"
      />
    </div>
    <div class="app-container">
      <div class="title">
        <h1>{{ name }}</h1>
      </div>
    </div>
  </div>
</template>

<script>
import AppImage from '@/components/AppImage';

export default {
  name: 'HeaderPage',
  props: {
    name: {
      type: String,
      default: ''
    },
    imageId: {
      type: Number,
      default: 16
    }
  },
  components: {
    AppImage
  }
};
</script>

<style lang="stylus" scoped>
.header-page
  position: relative
  z-index: 0
  .img-container
    position: absolute
    top: 0
    left: 0
    bottom: 0
    right: 0
    overflow: hidden
    z-index: -1
    &:before
      content: ""
      position: absolute
      z-index: 1
      width: 100%
      height: 100%
      background: -webkit-linear-gradient(-45deg,rgba(88, 195, 255,.7) 0,rgba(0, 77, 230,.7) 40%,rgba(0, 59, 177,.7) 100%)
  .title
    display: flex
    padding-top: 150px
    align-items: flex-end
    h1
      color: #fff
      margin-bottom: 4rem
</style>
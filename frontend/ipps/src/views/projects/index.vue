<template>
  <div>
    <div class="header-page">
      <div class="app-container">
        <div class="title">
          <h1>Проекты</h1>
        </div>
      </div>
    </div>
    <div class="body-page">
      <div class="app-container">
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Projects'
};
</script>

<style lang="stylus" scoped>
.header-page
  position: relative
  background-image: url(../../images/projects.jpg)
  background-size: cover
  background-position: center 60%
  z-index: 1
  .title
    display: flex
    height: 300px
    align-items: flex-end
    h1
      color: #fff
      margin-bottom: 4rem
  &:before
    content: ""
    position: absolute
    right: 0
    bottom: 0
    width: 100%
    height: 100%
    z-index: -1;
    background: -webkit-linear-gradient(-45deg,rgba(88, 195, 255,.7) 0,rgba(0, 77, 230,.7) 40%,rgba(0, 59, 177,.7) 100%)

.body-page
  margin-top: 100px
  margin-bottom: 100px
</style>
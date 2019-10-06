<template>
  <div class="app-wraper">
    <navbar />
    <app-main></app-main>
    <footer>
      <div class="container">
        <div class="footer-container"></div>
      </div>
    </footer>
  </div>
</template>

<script>
import AppMain from './components/AppMain';
import Navbar from './components/Navbar';

export default {
  name: 'Layout',
  components: {
    AppMain,
    Navbar
  }
}
</script>

<style lang="stylus" scoped>
.app-wraper
  display flex
  flex-direction column
  .header
    width 100%
    height 80px
    background #000
  footer
    margin: auto 0 0
    background: rgb(0,59,177)
    .footer-container
      height: 600px
</style>
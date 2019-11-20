<template>
  <div class="app-wraper">
    <navbar />
    <app-main />
    <app-footer />
  </div>
</template>

<script>
import AppMain from './components/AppMain';
import Footer from './components/Footer';
import Navbar from './components/Navbar';

export default {
  name: 'Layout',
  components: {
    AppMain,
    Navbar,
    AppFooter: Footer
  }
};
</script>

<style lang="stylus" scoped>
.app-wraper
  display flex
  flex-direction column
  min-height: 100vh
  .header
    width 100%
    height 80px
    background #000  
</style>
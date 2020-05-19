<template>
  <div class="app-wraper">
    <navbar />
    <sidebar />
    <app-main />
    <app-footer />
  </div>
</template>

<script>
import AppMain from './components/AppMain';
import Footer from './components/Footer';
import Navbar from './components/Navbar/index';
import Sidebar from './components/Sidebar';

export default {
  name: 'Layout',
  components: {
    AppMain,
    Navbar,
    Sidebar,
    AppFooter: Footer,
  },
};
</script>

<style lang="stylus" scoped>
.app-wraper {
  display: flex;
  flex-direction: column;
  min-height: 100vh;

  .header {
    width: 100%;
    height: 80px;
    background: #000;
  }
}
</style>

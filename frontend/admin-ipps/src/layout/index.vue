<template>
  <div class="layout">
    <div class="sidebar">
      <sidebar />
    </div>    
    <navbar />
    <app-main />
  </div>
</template>

<script>
import AppMain from './components/AppMain';
import Navbar from './components/Navbar';
import Sidebar from './components/Sidebar/index';

export default {
  name: 'Layout',
  components: {
    AppMain,
    Navbar,
    Sidebar
  }
};
</script>

<style scoped>
.layout {
  display: grid;
  grid-template-columns: 210px calc(100vw - 210px);
  grid-template-rows: 50px calc(100vh - 50px);
  grid-template-areas:
    "sidebar navbar"
    "sidebar main";
}

.sidebar {
  grid-area: sidebar;
}

main {
  grid-area: main;
}
</style>
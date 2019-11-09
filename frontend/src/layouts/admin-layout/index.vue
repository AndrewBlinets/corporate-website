<template>
  <div class="admin-wrapper">
    <sidebar class="sidebar-container"/>
    <navbar class="navbar-container"/>
    <div class="main-container">
      <app-main />
    </div>
  </div>
</template>

<script>
import AppMain from './components/AppMain'
import Navbar from './components/Navbar'
import Sidebar from './components/Sidebar'

export default {
  name: 'AdminLayout',
  components: {
    AppMain,
    Navbar,
    Sidebar
  }
}
</script>

<style scoped>
.admin-wrapper {
  display: grid;
  grid-template-columns: 210px calc(100vw - 210px);
  grid-template-rows: 50px calc(100vh - 50px);
  grid-template-areas:
    "sidebar navbar"
    "sidebar main";
}

.navbar-container {
  grid-area: navbar;
}

.sidebar-container {
  grid-area: sidebar;
}

.main-container {
  grid-area: main;
  padding: 20px;
  background-color: #f0f2f5;
}
</style>

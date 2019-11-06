<template>
  <el-container class="admin-wrapper">
    <el-aside>
      <sidebar class="sidebar-container"/>
    </el-aside>
    <el-container>
      <el-header></el-header>
      <el-main>
        
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
import Sidebar from './components/Sidebar'

export default {
  name: 'AdminLayout',
  components: {
    Sidebar
  }
}
</script>

<style lang="stylus" scoped>
.admin-wrapper
  width: 100vw
  height: 100vh
  position: relative
</style>

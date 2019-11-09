<template>
  <div class="nav">
    <!-- <el-breadcrumb separator-class="el-icon-arrow-right">
      <el-breadcrumb-item :to="{ path: '/' }">homepage</el-breadcrumb-item>
      <el-breadcrumb-item>promotion management</el-breadcrumb-item>
      <el-breadcrumb-item>promotion list</el-breadcrumb-item>
      <el-breadcrumb-item>promotion detail</el-breadcrumb-item>
    </el-breadcrumb> -->
  </div>
</template>

<script>
export default {
  name: 'Navbar',
}
</script>

<style lang="stylus" scoped>
.nav
  height: 50px
  overflow: hidden
  position: relative
  background: #fff
  box-shadow: 0 1px 4px rgba(0, 21, 41, .08)
</style>
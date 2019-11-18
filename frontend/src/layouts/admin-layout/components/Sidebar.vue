<template>
  <el-menu
    background-color="#304156"
    text-color="#bfcbd9"
  >
    <router-link :to="{ path: '/dashboard/news' }">
      <el-menu-item index="1">
        <i class="el-icon-news"></i>
        <span>Новоси</span>
      </el-menu-item>
    </router-link>
    <el-menu-item index="2">
      <i class="el-icon-tickets"></i>
      <span>Проекты</span>
    </el-menu-item>
    <el-menu-item index="3">
      <i class="el-icon-s-cooperation"></i>
      <span>Партнёры</span>
    </el-menu-item>
    <el-menu-item index="4">
      <i class="el-icon-s-custom"></i>
      <span>Вакансии</span>
    </el-menu-item>
    <el-menu-item index="5">
      <i class="fab fa-google-drive icon"></i>
      <el-link class="link-menu" target="_blank" href="https://docs.google.com/presentation/d/1WNnmVUKoe8WZ2rTh1xuwkjghVYVDRh_StFHiSVSkPr0/edit?usp=sharing">Google Drive</el-link>
    </el-menu-item>    
  </el-menu>
</template>

<script>
export default {
  name: 'Sidebar'
}
</script>

<style lang="stylus" scoped>
.icon
  margin-right: 5px
  width: 24px
  text-align: center
  font-size: 18px
  vertical-align: middle
  color: #909399

.link-menu
  color: rgb(191, 203, 217)
</style>
<template>
  <el-menu
    background-color="#304156"
    text-color="#bfcbd9"
    mode="vertical"
    router
  >
    <sidebar-item
      v-for="(route, i) in permissionRoutes"
      :key="route.path"
      :i="i"
      :item="route"
      :base-path="route.path"
    />
    <el-menu-item index="5">
      <i class="fab fa-google-drive icon"></i>
      <el-link class="link-menu" target="_blank" href="https://docs.google.com/presentation/d/1WNnmVUKoe8WZ2rTh1xuwkjghVYVDRh_StFHiSVSkPr0/edit?usp=sharing">Google Drive</el-link>
    </el-menu-item>    
  </el-menu>
</template>

<script>
import { mapGetters } from 'vuex';
import SidebarItem from './SidebarItem';

export default {
  name: 'Sidebar',
  components: {
    SidebarItem
  },
  computed: {
    ...mapGetters([
      'permissionRoutes'
    ])
  }
};
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
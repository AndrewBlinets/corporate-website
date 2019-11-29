<template>
  <el-menu-item :index="i" :route="{ path: basePath }">
    <i class="el-icon-news"></i>
    <span>{{ item.meta.title }}</span>
  </el-menu-item>
</template>

<script>
export default {
  name: 'SidebarItem',
  props: {
    i: {
      type: Number,
      default: 1
    },
    item: {
      type: Object,
      required: true
    },
    basePath: {
      type: String,
      default: ''
    }
  }
};
</script>
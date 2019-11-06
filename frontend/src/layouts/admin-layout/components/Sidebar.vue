<template>
  <el-menu>
    <el-menu-item index="1">
      <i class="el-icon-menu"></i>
      <span>Новоси</span>
    </el-menu-item>
    <el-menu-item index="2">
      <i class="el-icon-menu"></i>
      <span>Navigator Two</span>
    </el-menu-item>
    <el-menu-item index="3" disabled>
      <i class="el-icon-document"></i>
      <span>Navigator Three</span>
    </el-menu-item>
  </el-menu>
</template>

<script>
export default {
  name: 'Sidebar'
}
</script>
<template>
  <div class="layout">
    <main>
      <router-view />
    </main>
  </div>
</template>

<script>
export default {
  name: 'Layout'
};
</script>

<style lang="stylus" scoped>
main
  max-width: 460px
  margin: 0 auto
  margin-top: 80px
</style>

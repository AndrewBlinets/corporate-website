<template>
  <div class="contact__note">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: 'ContactNote',
};
</script>

<style lang="stylus" scoped>
.contact__note {
  padding-top: 0.5rem;
  border-top: 1px solid #ddd;

  .list:not(:last-child) {
    margin-bottom: 1rem;
  }
}
</style>

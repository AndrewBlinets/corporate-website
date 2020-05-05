<template>
  <a :href="url" target="_blank" class="social-link">
    <font-awesome-icon :icon="icon" />
  </a>
</template>

<script>
export default {
  name: 'SocialLinkItem',
  props: {
    url: String,
    icon: Object,
  },
};
</script>

<style lang="stylus" scoped>
.social-link {
  margin-right: 15px;
  color: #fff;
  border: 1px solid #fff;
  width: 40px;
  height: 40px;
  line-height: 40px;
  border-radius: 50%;
  text-align: center;
  display: inline-block;
  font-size: 14px;
  transition: 0.5s;

  &:hover {
    color: #1461ff;
    background: #fff;
  }
}
</style>

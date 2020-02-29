<template>
  <a :href="url" target="_blank" class="social-link">
    <font-awesome-icon :icon="fortAwesomeIcon" />
  </a>
</template>

<script>
export default {
  name: 'SocialLinkItem',
  props: {
    url: {
      type: String,
      default: ''
    },
    fortAwesomeIcon: {
      type: Object,
      default: function() {
        return {};
      }
    }
  }
};
</script>

<style lang="stylus" scoped>
.social-link
  margin-right: 15px
  color: #fff
  border: 1px solid #fff
  width: 40px
  height: 40px
  line-height: 40px
  border-radius: 50%
  text-align: center
  display: inline-block
  font-size: 14px
  transition: .5s
  &:hover
    color: #1461ff
    background: #fff
</style>
<template>
  <footer>
    <div class="app-container">
      <div class="footer-container">
        <social-links />
      </div>
    </div>
  </footer>
</template>

<script>
import SocialLinks from '@/components/SocialLinks';

export default {
  name: 'Footer',
  components: {
    SocialLinks
  }
};
</script>

<style lang="stylus" scoped>
footer
  margin: auto 0 0
  background: rgb(0,59,177)
  .footer-container
    height: 600px
</style>
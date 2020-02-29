<template>
  <footer>
    <div class="footer-container">
      <div class="app-container d-flex flex-md-row flex-column justify-content-between align-items-center">
        <div class="content mb-md-0 mb-3">
          <div class="logo">
            <img src="../../images/logoIPPS.png" alt="ИППС">
          </div>
          <p>© НИРУП «Институт прикладных программных систем»</p>
        </div>
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
  .links-item
    display: flex
    align-items: flex-start
    width: 100%
    height: 100%
  .links-item
    border-right: 1px solid #ffffff50
  .footer-container
    padding: 30px 0
    border-top: 1px solid #ffffff50
    .content
      display: flex
      align-items: center
      .logo
        margin-right: 15px
        img
          width: 50px
          height: 50px
      p
        color: #fff
</style>
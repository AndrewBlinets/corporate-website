<template>
  <footer>
    <div class="app-container">
      <div class="row my-5">
        <div class="col-4">
          <div class="links-item">
            <social-links />
          </div>
        </div>
        <div class="col-4">
          <div class="links-item">
          </div>
        </div>
        <div class="col-4">
          <div class="links-item">
          </div>
        </div>
      </div>
    </div>
    <div class="footer-container">
      <div class="app-container">
        <div class="content">
          <div class="logo">
            <img src="../../images/logoIPPS.png" alt="ИППС">
          </div>
          <p>© НИРУП «Институт прикладных программных систем»</p>
        </div>
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
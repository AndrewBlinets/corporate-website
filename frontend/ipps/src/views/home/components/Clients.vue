<template>
  <section id="partners">
    <div class="app-container grid-area">
      <div class="section-header">
        <h2>Клиенты</h2>
      </div>
      <div class="section-body">
        <div class="partners-container mx-n3">
          <div
            v-for="partner in partners"
            :key="partner.id"
            class="px-3 mb-4"
          >
            <div class="partner-item">
              <app-image
                :id="partner.image"
                :name="partner.name"
              />
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
import { mapGetters } from 'vuex';
import AppImage from '@/components/AppImage';

export default {
  name: 'Clients',
  components: {
    AppImage
  },
  computed: {
    ...mapGetters([
      'partners'
    ])
  },
  created() {
    this.$store.dispatch('main/getPartners');
  }
};
</script>

<style lang="stylus" scoped>
#partners
  position: relative
  background-image: url(../../../images/buisness.jpg)
  background-size: cover
  background-position: center center
  z-index: 0
  &:before
    content: ""
    position: absolute
    right: 0
    bottom: 0
    width: 100%
    height: 100%
    z-index: -1;
    background: linear-gradient(-45deg,rgba(88, 195, 255,.8) 0,rgba(0, 77, 230,.8) 40%,rgba(0, 59, 177,.8) 100%)
  .section-header
    color: #fff
    h2::after
      border-bottom-color: #fff
.partners-container
  display: flex
  flex-wrap: wrap
  justify-content: center
  .partner-item
    display: flex
    align-items: center
    width: 200px
    min-height: 80px
    img
      transform: none
</style>

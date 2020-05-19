<template>
  <section id="partners">
    <div class="partners-img">
      <app-image :id="21" name="партнёры"></app-image>
    </div>
    <div class="app-container grid-area">
      <div class="section-header">
        <h2>Партнеры</h2>
      </div>
      <div class="section-body">
        <div class="partners-container mx-n3">
          <div v-for="partner in partners" :key="partner.id" class="px-3 mb-4">
            <div class="partner-item">
              <app-image
                :id="partner.image"
                :name="partner.name"
                backgroundColor="#ffffff00"
              />
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
import { getPartners } from '@/api/partners';
import AppImage from '@/components/AppImage';

export default {
  name: 'Partners',
  components: {
    AppImage,
  },
  data: () => ({
    partners: [],
  }),
  mounted() {
    getPartners().then(partners => {
      this.partners = [...partners];
    });
  },
};
</script>

<style lang="stylus" scoped>
#partners {
  position: relative;
  min-height: 620px;
  overflow: hidden;
  z-index: 0;

  &:before {
    content: '';
    position: absolute;
    right: 0;
    bottom: 0;
    width: 100%;
    height: 100%;
    background: linear-gradient(-45deg, rgba(88, 195, 255, 0.8) 0, rgba(0, 77, 230, 0.8) 40%, rgba(0, 59, 177, 0.8) 100%);
    z-index: -1;
  }

  .partners-img {
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    z-index: -3;
  }

  .section-header {
    color: #fff;

    h2::after {
      border-bottom-color: #fff;
    }
  }
}

.partners-container {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;

  .partner-item {
    display: flex;
    align-items: center;
    width: 200px;
    min-height: 80px;

    img {
      transform: none;
    }
  }
}
</style>

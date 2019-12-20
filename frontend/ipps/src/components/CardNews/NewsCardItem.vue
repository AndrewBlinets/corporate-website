<template>
  <div
    v-resize="handleResize"
    class="card news-item-img"
    :class="{ 'compact': compact }"
  >
    <div class="news-img">
      <app-image
        :id="news.mainImage"
        :name="news.shortTitle"
      />
    </div>  
    <news-info-item v-bind="news" />
  </div>
</template>

<script>
import AppImage from '@/components/AppImage';
import NewsInfoItem from './NewsInfoItem';
import { Resize } from '@/directive/resize';

export default {
  name: 'CardNewsItem',
  components: {
    AppImage,
    NewsInfoItem
  },
  directives: {
    Resize
  },
  data() {
    return {
      news: {
        id: 1,
        datePublic: '2019-11-20T07:27:52.000+0000',
        shortTitle: '1С 4 по 30 октября 2019 года в Республике Беларусь пройдет перепись населения',
        mainImage: 15,
        countView: 123,
        entrySpeech: 'Целью подписания соглашения является взаимодействие и координация деятельности по интеграции автоматизированных систем и электронной торговой площадки «Грузовые перевозки».'
      },
      compact: false
    };
  },
  mounted() {
    this.compact = this.$el.clientWidth > 411 || this.$el.clientWidth < 308;
  },
  methods: {
    handleResize() {
      this.compact = this.$el.clientWidth > 411 || this.$el.clientWidth < 308;
    }
  }
};
</script>

<style lang="stylus" scoped>
.news-item-img
  position: relative
  overflow: hidden
  height: 100%
  .news-img
    display: flex
    overflow: hidden
    z-index: 0

.news-item-img.compact
  .news-img
    position: absolute
    width: 100%
</style>
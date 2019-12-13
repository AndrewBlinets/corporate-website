<template>
  <div class="card news-item-img">
    <div class="news-img">
      <img src="../../images/news1.jpg" alt="" srcset="">
    </div>  
    <news-info-item v-bind="news" />
  </div>
</template>

<script>
import NewsInfoItem from './components/NewsInfoItem';

export default {
  name: 'CardNewsItem',
  components: {
    NewsInfoItem
  },
  data() {
    return {
      news: {
        id: 1,
        datePublic: '2019-11-20T07:27:52.000+0000',
        shortTitle: '1С 4 по 30 октября 2019 года в Республике Беларусь пройдет перепись населения',          
        mainImage: 0,
        countView: 123,
        entrySpeech: 'Целью подписания соглашения является взаимодействие и координация деятельности по интеграции автоматизированных систем и электронной торговой площадки «Грузовые перевозки».'
      },
    };
  }
};
</script>

<style lang="stylus" scoped>
.news-item-img
  position: relative
  .news-img
    img
      display: block
      max-width: 100%
      height: auto
  .news-info
    padding: 20px
</style>
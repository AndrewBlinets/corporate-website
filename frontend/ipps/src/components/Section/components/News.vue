<template>
  <div class="row mx-md-n4">
    <div
      v-for="item in news"
      class="col-lg-4 col-sm-6 px-md-4 mb-5"
      :key="item.id"
    >
      <news-card
        :id="item.id"
        :heightTitle="250"
        :image="item.mainImage"
        :title="item.shortTitle"
        :views="item.countView"
        :datePublish="item.datePublic"
        :text="item.entrySpeech"
      />
    </div>
  </div>
  <!-- <div class="row">
    <div
      v-for="(item, index) in news"
      class="col-lg-4  px-2"
      :class="{ 'col-md-6 mb-lg-0 mb-3': lastIndex !== index }"
      :key="item.id"
    >
      <news-card-item v-bind="item"/>
    </div>
  </div> -->
</template>

<script>
import { mapGetters } from 'vuex';
import NewsCard from '@/components/CardNews/NewsCard';
// import NewsCardItem from '@/components/CardNews/NewsCardItem';

export default {
  name: 'News',
  components: {
    NewsCard
    // NewsCardItem
  },
  props: {
    pageId: {
      type: Number,
      default: null
    }
  },
  computed: {
    ...mapGetters(['news']),
    lastIndex() {
      return this.news.length - 1;
    }
  },
  created() {
    this.$store.dispatch('news/getNews', { pageId: this.pageId, size: 3 });
  }
};
</script>
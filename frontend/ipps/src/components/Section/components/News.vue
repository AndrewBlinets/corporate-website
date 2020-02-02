<template>
  <div class="row">
    <div
      v-for="(item, index) in news"
      class="col-lg-4  px-2"
      :class="{ 'col-md-6 mb-lg-0 mb-3': lastIndex !== index }"
      :key="item.id"
    >
      <news-card-item v-bind="item"/>
    </div>
  </div>
</template>

<script>
import { mapGetters } from 'vuex';
import NewsCardItem from '@/components/CardNews/NewsCardItem';

export default {
  name: 'News',
  components: {
    NewsCardItem
  },
  computed: {
    ...mapGetters(['news']),
    lastIndex() {
      return this.news.length - 1;
    }
  },
  created() {
    this.$store.dispatch('news/getNews', { size: 3 });
  }
};
</script>
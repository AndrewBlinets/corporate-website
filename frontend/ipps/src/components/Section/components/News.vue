<template>
  <div class="row">
    <div class="col-lg-4 col-md-6 mb-lg-0 mb-3 px-2">
      <news-card-item />
    </div>
    <div class="col-lg-4 col-md-6 mb-lg-0 mb-3 px-2">
      <news-card-item />
    </div>
    <div class="col-lg-4 px-2">
      <news-card-item />
    </div>
  </div>
</template>

<script>
import NewsCardItem from '@/components/CardNews/NewsCardItem';

export default {
  name: 'News',
  components: {
    NewsCardItem
  }
};
</script>
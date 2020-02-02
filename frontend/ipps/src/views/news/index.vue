<template>
  <div>
    <header-page
      :name="namePage"
      :imageId="imagePageId"
    />
    <div class="body-page">
      <div class="app-container">

        <div class="row mb-3 mx-n2">
          <div class="col-lg-4 col-md-12 px-2 mb-lg-0 mb-3">
            <news-card-item />
          </div>
          <div class="col-lg-8 px-2">
            <news-card-list />
          </div>
        </div>

        <div class="row mb-3">
          <div class="col-xl-9 col-sm-6 px-2 mb-sm-0 mb-3">
            <news-card-item />
          </div>
          <div class="col-xl-3 col-sm-6 px-2">
            <news-card-item />
          </div>
        </div>

        <div class="row">
          <div class="col-lg-6 mb-lg-0 mb-3 px-2">
            <news-card-list />
          </div>
          <div class="col-lg-6 px-2">
            <div class="row">
              <div class="col-lg-12 col-md-6 mb-3">
                <news-card-item />
              </div>
              <div class="col-lg-12 col-md-6 mb-3">
                <news-card-item />
              </div>
              <div class="col-lg-12">
                <news-card-item />
              </div>
            </div>
          </div>
        </div>

      </div>
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex';
import HeaderPage from '@/components/HeaderPage';
import NewsCardList from '@/components/CardNews/NewsCardList';
import NewsCardItem from '@/components/CardNews/NewsCardItem';

export default {
  name: 'News',
  components: {
    HeaderPage,
    NewsCardList,
    NewsCardItem
  },
  computed: {
    ...mapState([
      'news'
    ])
  },
  data() {
    return {
      namePage: 'Новости',
      imagePageId: 16
    };
  },
  created() {
    this.$store.dispatch('news/getNews');
  }
};
</script>

<style lang="stylus" scoped>
.body-page
  margin-top: 100px
  margin-bottom: 100px
</style>
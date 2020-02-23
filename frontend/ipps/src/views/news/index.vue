<template>
  <div>
    <header-page :image="imagePageId">
      <h1>{{ titlePage }}</h1>
    </header-page>
    <div class="body-page">
      <div class="app-container">
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
        
        <div class="button-container">
          <div v-if="!hasNewsFull" class="button-item">
            <div
              class="btn btn-main"
              @click="loadMore"
            >Загрузить ещё</div>
          </div>
        </div>
        <!-- <div class="row mb-3 mx-n2">
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
        </div> -->

      </div>
    </div>
  </div>
</template>

<script>
import store from '@/store';
import { mapState, mapGetters } from 'vuex';
import HeaderPage from '@/components/HeaderPage';
import NewsCard from '@/components/CardNews/NewsCard';

export default {
  name: 'News',
  components: {
    HeaderPage,
    NewsCard
  },
  computed: {
    ...mapState({
      news: state => state.news.newsList,
      hasNewsFull: state => state.news.hasNewsFull
    }),
    ...mapGetters({
      page: 'news/page'
    })
  },
  data() {
    return {
      titlePage: 'Новости',
      imagePageId: 16
    };
  },
  beforeRouteEnter (to, from, next) {
    store.dispatch('news/getNews', { size: 9, page: 0 }).then(() => {
      next();
    });
  },
  destroyed() {
    store.dispatch('news/resetNews');
  },
  methods: {
    loadMore() {
      store.dispatch('news/getNews', { page: this.page + 1 });
    }
  }
};
</script>

<style lang="stylus" scoped>
.body-page
  margin-top: 50px
  margin-bottom: 50px
</style>
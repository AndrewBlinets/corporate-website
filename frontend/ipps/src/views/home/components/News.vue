<template>
  <section id="news">
    <div class="app-container grid-area">
      <div class="section-header">
        <h2>Новости</h2>
      </div>
      <div class="section-body">
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
        <!-- <div class="row mx-n2 mb-5">
          <div class="col px-2 mb-3">
            <news-card-item />
          </div>
          <div class="col-xl-8 px-2 mb-3">
            <news-card-list />
          </div>
          <div class="col-xl-8 col-lg-8 d-flex">
            <div class="row">
              <div class="col-xl-12 col-lg-6 mb-3 px-2">
                <news-card-item />
              </div>
              <div class="col-xl-12 col-lg-6 mb-3 px-2">
                <news-card-item />
              </div>
            </div>
          </div>
          <div class="col-lg-4 mb-3 px-2">
            <news-card-item />
          </div>
        </div> -->
        <div class="button-container">
          <div class="button-item">
            <router-link
              :to="{ name: 'news' }"
              class="btn btn-main"
            >Все Новости</router-link>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
import { mapState } from 'vuex';
import NewsCard from '@/components/CardNews/NewsCard';

export default {
  name: 'News',
  components: {
    NewsCard
  },
  computed: {
    ...mapState({
      news: state => state.news.newsList
    })
  },
  created() {
    this.$store.dispatch('news/getNews', { size: 3, page: 0 });
  }
};
</script>

<template>
  <div>
    <header-page :image="article.mainImage">
      <h1 class="article-title">{{ article.title }}</h1>
      <news-details
        :views="article.countView"
        :date="article.datePublic"
      />
    </header-page>
    <div class="app-container py-5">
      <div class="row">
        <div class="col-lg-8 col-12 mb-lg-0 mb-5">
          <div class="article_entry-speech">
            <p>{{ article.entrySpeech }}</p>
          </div>
          <div class="article-body" v-html="article.content" />
        </div>
        <div class="col-lg-4 col-12">
          <last-news-list />
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import store from '@/store';
import { mapState } from 'vuex';
import HeaderPage from '@/components/HeaderPage';
import NewsDetails from '@/components/CardNews/NewsDetails';
import LastNewsList from './components/LastNewsList';

export default {
  name: 'Article',
  components: {
    HeaderPage,
    NewsDetails,
    LastNewsList
  },
  props: {
    id: {
      type: Number,
      default: 1
    }
  },
  computed: {
    ...mapState({
      article: state => state.news.article
    })
  },
  beforeRouteEnter (to, from, next) {
    const id = to.params.id;
    store.dispatch('news/getArticle', id).then(() => {
      next();
    });
  },
  beforeRouteUpdate (to, from, next) {
    const id = to.params.id;
    store.dispatch('news/getArticle', id).then(() => {
      next();
    });
  },
  destroyed() {
    store.dispatch('news/resetArticle');
  }
};
</script>

<style lang="stylus" scoped>
.body-page
  margin-top: 50px
  margin-bottom: 50px

.article-container
  padding: 40px 0
  color: #222
  max-width: 720px
  min-width: 290px
  margin: 0 auto

.article-title
  margin-bottom: 1.5rem
  line-height: 1.15

@media (max-width: 480px)
  .article-title
    font-size: 1.5rem

@media (min-width: 480px)
  .article-title
    font-size: 2.125rem

@media (min-width: 840px)
  .article-title
    font-size: 2.5rem

.article-details
  display: flex
  align-items: center
  .comments-counter
    margin-right: 10px
    span
      margin-left: 5px
.article_entry-speech
  max-width: 700px
  margin: 0 auto
  font-size: 18px
  font-weight: 700
  line-height: 1.612
  color: #777
  margin-bottom: 20px

.article-body
  max-width: 700px
  margin: 0 auto
  color: #333
</style>
<template>
  <div>
    <header-page :image="article.mainImage">
      <h1 class="article-title">{{ article.title }}</h1>
      <news-details :views="article.countView" :date="article.datePublic" />
    </header-page>
    <div class="app-container py-5">
      <div class="row">
        <div class="col-lg-8 col-12 mb-lg-0 mb-5">
          <div class="article__entry-speech">
            <p>{{ article.entrySpeech }}</p>
          </div>
          <div ref="content" class="article-body">
            <content-page
              v-if="contentWidth"
              v-resize="computeWidthContent"
              :html="article.content"
              :width="contentWidth"
            />
          </div>
        </div>
        <div class="col-lg-4 col-12">
          <last-news-list />
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { getNewsById } from '@/api/news';
import { Resize } from '@/directive/resize';
import HeaderPage from '@/components/HeaderPage';
import NewsDetails from '@/components/CardNews/NewsDetails';
import ContentPage from '@/components/ContentPage';
import LastNewsList from './components/LastNewsList';

export default {
  name: 'Article',
  components: {
    HeaderPage,
    NewsDetails,
    ContentPage,
    LastNewsList,
  },
  directives: {
    Resize,
  },
  data: () => ({
    article: {},
    contentWidth: null,
  }),
  beforeRouteEnter(to, from, next) {
    const id = to.params.id;
    getNewsById(id).then(data => {
      next(vm => (vm.$data.article = { ...data }));
    });
  },
  beforeRouteUpdate(to, from, next) {
    const id = to.params.id;
    getNewsById(id).then(data => {
      this.article = { ...data };
      next();
    });
  },
  mounted() {
    this.computeWidthContent();
  },
  methods: {
    computeWidthContent() {
      this.contentWidth = this.$refs.content.clientWidth;
    },
  },
};
</script>

<style lang="stylus" scoped>
.article-title {
  margin-bottom: 1.5rem;
  line-height: 1.15;
}

@media (max-width: 480px) {
  .article-title {
    font-size: 1.5rem;
  }
}

@media (min-width: 480px) {
  .article-title {
    font-size: 2.125rem;
  }
}

@media (min-width: 840px) {
  .article-title {
    font-size: 2.5rem;
  }
}

.article__entry-speech {
  max-width: 700px;
  margin: 0 auto;
  font-size: 18px;
  font-weight: 700;
  line-height: 1.612;
  color: #777;
  margin-bottom: 20px;
}

.article-body {
  max-width: 700px;
  margin: 0 auto;
  color: #333;
}
</style>

<template>
  <div>
    <div class="header-page">
      <div class="app-container">
        <div class="title">
          <h1>Новости</h1>
        </div>
      </div>
    </div>
    <div class="body-page">
      <div class="app-container">

        <div class="row mb-3">
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
import NewsCardList from '@/components/CardNews/NewsCardList';
import NewsCardItem from '@/components/CardNews/NewsCardItem';

export default {
  name: 'News',
  components: {
    NewsCardList,
    NewsCardItem
  }
};
</script>

<style lang="stylus" scoped>
.header-page
  position: relative
  background-image: url(../../images/news.jpg)
  background-size: cover
  background-position: center 60%
  z-index: 1
  .title
    display: flex
    height: 300px
    align-items: flex-end
    h1
      color: #fff
      margin-bottom: 4rem
  &:before
    content: ""
    position: absolute
    right: 0
    bottom: 0
    width: 100%
    height: 100%
    z-index: -1;
    background: -webkit-linear-gradient(-45deg,rgba(88, 195, 255,.7) 0,rgba(0, 77, 230,.7) 40%,rgba(0, 59, 177,.7) 100%)

.body-page
  margin-top: 100px
  margin-bottom: 100px
</style>
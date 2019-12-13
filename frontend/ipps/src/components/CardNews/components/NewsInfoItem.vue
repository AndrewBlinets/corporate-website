<template>
  <div
    v-resize="handleResize"
    class="news-info"
    :class="{ 'over-img': over }"
  >
    <h5>
      <router-link :to="{ path: `/news/${id}` }">{{ shortTitle }}</router-link>
    </h5>
    <div class="state">
      <div class="state-item state-comment">
        <font-awesome-icon :icon="['fas', 'comment-alt']" />
        <span>{{ countView }}</span>
      </div>
      <div class="state-item state-data">
        <span>{{ datePublic | formatDate }}</span>
      </div>
    </div>
    <p v-if="showSpeech">{{ entrySpeech }}</p>
  </div>
</template>

<script>
import { Resize } from '@/directive/resize';

export default {
  name: 'NewsInfoItem',
  directives: {
    Resize
  },
  props: {
    id: Number,
    datePublic: String,
    shortTitle: String,
    mainImage: Number,
    countView: Number,
    entrySpeech: String
  },
  data() {
    return {
      showSpeech: true,
      over: false
    };
  },
  mounted() {
    this.showSpeech = this.$el.clientWidth > 350;
    this.over = this.$el.clientWidth < 350 || this.$el.clientWidth > 500;
  },
  methods: {
    handleResize() {
      this.showSpeech = this.$el.clientWidth > 350;
      this.over = this.$el.clientWidth < 350 || this.$el.clientWidth > 500;
    }
  }
};
</script>

<style lang="stylus" scoped>
.news-info
  margin-bottom: 1.5rem
  &:last-child
    margin-bottom: 0
  h5
    a:hover
      text-decoration: underline
  .state
    display: flex
    width: 100%
    font-size: 14px
    .state-item
      padding-right: 10px
    .state-comment
      span
        margin-left: 5px
  p
    margin-top: 0.5rem

.news-item-img
  .news-info.over-img
    position: absolute
    top: 0
    left: 0
    h5 a,
    p,
    .state-item
      color: #fff
      background-color: rgba(0, 0, 0, 0.35)
</style>
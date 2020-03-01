<script>
import VueWithCompiler from 'vue/dist/vue.esm';
const AppImage = () => import('@/components/AppImage');
import { getIdFromURL } from 'vue-youtube-embed';

export default {
  name: 'ContentPage',
  components: {
    AppImage
  },
  props: {
    html: {
      type: String,
      default: ''
    },
    width: {
      type: Number,
      default: 900
    }
  },
  data: () => ({
    playerWidth: null,
    playerHeight: null,
    videoId: new Map(),
    content: '',
    templateRender: undefined
  }),
  watch: {
    html() {
      this.updateRender();
    },
    width() {
      this.setSize();
    }
  },
  created() {
    this.setSize();
    this.updateRender();
  },
  methods: {
    setSize() {
      this.playerWidth = this.width;
      this.playerHeight = Math.round(this.width / 1.78);
    },
    updateRender() {
      let content = this.html;
      content = this.replaceImgages(content);
      content = this.replaceYouTube(content);

      const compiled = VueWithCompiler.compile(`<div class="content-page">${content}</div>`);
			this.templateRender = compiled.render;
			this.$options.staticRenderFns = [];
			for (const staticRenderFunction of compiled.staticRenderFns) {
				this.$options.staticRenderFns.push(staticRenderFunction);
			}
    },
    replaceImgages(content) {
      const regexp = /<img src="http:\/\/www.ipps.by:5454\/client-api\/image\/(?<id>\d+)">/g;
      const replaceContent = content.replace(regexp, (...match) => {
        let groups = match.pop();
        
        return `<app-image :id="${groups.id}" />`;
      });

      return replaceContent;
    },
    replaceYouTube(content) {
      // eslint-disable-next-line no-useless-escape
      const regexp = /<oembed url="(?<url>(?:http(s)?:\/\/)?[\w.-]+(?:\.[\w\.-]+)+[\w\-\._~:/?#[\]@!\$&'\(\)\*\+,;=.]+)"><\/oembed>/g;
      const replaceContent = content.replace(regexp, (...match) => {
        let groups = match.pop();
        this.videoId.set(groups.url, getIdFromURL(groups.url));

        return `<youtube :video-id="videoId.get('${groups.url}')" :player-width="playerWidth" :player-height="playerHeight"></youtube>`;
      });

      return replaceContent;
    }
  },
  render() {
    return this.templateRender();
  }
};
</script>

<style lang="stylus" scoped>
.content-page
  color: #333
  h2
    font-weight: 800
    font-size: 1.75rem
  p, li
    line-height: 1.572
    text-align: left
  a
    color: #1461ff
    font-weight: 600
    &:hover
      text-decoration: underline
  ul,
  ol
    margin-left: 1.3rem
    margin-top: -1.2rem
  ul
    li:before
      content: "\2022"
      color: #1461ff
      font-weight: bold
      display: inline-block
      width: 1em
      margin-left: -1em
  .image
    width: 100%
    overflow: hidden
    img
      width: 100%
      height: 100%
      object-fit: cover
      object-position: center center
  .image, .media
    margin-top: 3rem
    margin-bottom: 3rem
  h2, p, ul, ol
    margin-bottom: 1.5rem

@media (max-width: 480px)
  .article-body
    h2
      font-size: 1.5rem
    p, li
      font-size: 14px
    ul, ol
      margin-top: -0.6rem
    h2, p, ul, ol
      margin-bottom: 0.75rem
    .image, .media
      margin-top: 1.5rem
      margin-bottom: 1.5rem
</style>
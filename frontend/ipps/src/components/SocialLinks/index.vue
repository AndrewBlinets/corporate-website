<template>
  <div class="social-links__container">
    <social-link-item 
      v-for="socialLink in socialLinks"
      v-bind="socialLink"
      :key="socialLink.id"
    />
  </div>
</template>

<script>
import { faFacebookF, faVk, faTwitter, faYoutube } from '@fortawesome/free-brands-svg-icons';
import SocialLinkItem from './SocialLinkItem';

export default {
  name: 'SocialLinks',
  components: {
    SocialLinkItem
  },
  data() {
    return {
      socialLinks: [
        {
          id: 1,
          url: '',
          fortAwesomeIcon: faFacebookF
        },
        {
          id: 2,
          url: '',
          fortAwesomeIcon: faVk
        },
        { 
          id: 3,
          url: '',
          fortAwesomeIcon: faTwitter
        },
        {
          id: 4,
          url: '',
          fortAwesomeIcon: faYoutube
        }
      ]
    };
  }
};
</script>

<style lang="stylus" scoped>
.social-links__container
  display: flex  
</style>
<template>
  <div>
    <header-page :image="page.imageId">
      <h1>{{ page.name }}</h1>
    </header-page>
    <div class="body-page">
      <div class="app-container">
        <category-contacts
          v-for="contact in contacts"
          v-bind="contact"
          :key="contact.id"
        />
      </div>
    </div>
  </div>
</template>

<script>
import store from '@/store';
import { mapGetters } from 'vuex';
import HeaderPage from '@/components/HeaderPage';
import CategoryContacts from './components/CategoryContacts';

export default {
  name: 'Contacts',
  components: {
    HeaderPage,
    CategoryContacts
  },
  computed: {
    ...mapGetters([
      'contacts'
    ])
  },
  data() {
    return {
      page: {
        name: 'Контакты',
        imageId: 22
      },
    };
  },
  beforeRouteEnter (to, from, next) {
    store.dispatch('contacts/getContacts').then(() => {
      next();
    });
  }
};
</script>

<style lang="stylus" scoped>
.body-page
  margin-top: 100px
  margin-bottom: 100px
</style>
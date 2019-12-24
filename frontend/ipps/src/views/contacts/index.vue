<template>
  <div>
    <header-page
      :name="page.name"
      :imageId="page.imageId"
    />
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
  created() {
    this.$store.dispatch('contacts/getContacts');
  }
};
</script>

<style lang="stylus" scoped>
.body-page
  margin-top: 100px
  margin-bottom: 100px
</style>
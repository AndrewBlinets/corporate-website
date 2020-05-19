<template>
  <div>
    <header-page :image="20">
      <h1>{{ page.name }}</h1>
    </header-page>
    <div class="body-page">
      <section-component
        v-for="section in page.sections"
        :key="section.id"
        :page="page.id"
        :section="section"
      />
    </div>
  </div>
</template>

<script>
import store from '@/store';
import { mapState } from 'vuex';
import HeaderPage from '@/components/HeaderPage';
import SectionComponent from '@/components/Section';

export default {
  name: 'TechnicalCommittee',
  components: {
    HeaderPage,
    SectionComponent,
  },
  computed: {
    ...mapState({
      page: state => state.page.page,
    }),
  },
  beforeRouteEnter(to, from, next) {
    store.dispatch('page/getPage', 3).then(() => {
      next();
    });
  },
};
</script>

<style lang="stylus" scoped>
.body-page {
  margin-top: 100px;
  margin-bottom: 100px;
}
</style>

<template>
  <div>
    <header-page :image="page.imageId">
      <h1>{{ page.name }}</h1>
    </header-page>
    <div class="body-page">
      <section-component :section="section" />
    </div>
  </div>
</template>

<script>
import HeaderPage from '@/components/HeaderPage';
import SectionComponent from '@/components/Section';

export default {
  name: 'TechnicalCommittee',
  components: {
    HeaderPage,
    SectionComponent
  },
  data() {
    return {
      page: {
        name: 'Национальный Технический Комитет',
        imageId: 20
      },
      section: {
        name: 'Новости',
        type: 2
      }
    };
  }
};
</script>

<style lang="stylus" scoped>
.body-page
  margin-top: 100px
  margin-bottom: 100px
</style>
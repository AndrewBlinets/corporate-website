<template>
  <div>
    <header-page
      :name="page.name"
      :imageId="page.imageId"
    />
    <div class="body-page">
      <section-component v-bind="section" />
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
        componentName: 'News'
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
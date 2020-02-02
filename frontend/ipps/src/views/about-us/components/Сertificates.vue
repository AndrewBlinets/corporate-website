<template>
  <section-component v-bind="section" />
</template>

<script>
import SectionComponent from '@/components/Section';

export default {
  name: 'Certificates',
  components: {
    SectionComponent
  },
  data: () => ({
    section: {
      name: 'Сертификаты',
      componentName: 'Images'
    }
  })
};
</script>

<style lang="stylus" scoped>

</style>
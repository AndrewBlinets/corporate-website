<template>
  <div>
    <header-page :image="imagePageId">
      <h1>{{ namePage }}</h1>
    </header-page>
    <certificates />
    <diplomas />
  </div>
</template>

<script>
import HeaderPage from '@/components/HeaderPage';
import Certificates from './components/Сertificates';
import Diplomas from './components/Diplomas';

export default {
  name: 'AboutUs',
  components: {
    HeaderPage,
    Certificates,
    Diplomas
  },
  data() {
    return {
      namePage: 'О нас',
      imagePageId: 17
    };
  }
};
</script>
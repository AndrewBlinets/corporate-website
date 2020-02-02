<template>
  <div>
    <header-page 
      :name="namePage"
      :imageId="imagePageId"
    />
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
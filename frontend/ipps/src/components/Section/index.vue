<template>
  <section>
    <div class="app-container grid-area">
      <div class="section-header">
        <h2>{{ name }}</h2>
      </div>
      <div class="section-body">
        <component :is="$options.components[componentName]" />
      </div>
    </div>
  </section>
</template>

<script>
import About from './components/About';
import Contact from './components/Contact';
import News from './components/News';
import Images from './components/Images';

export default {
  name: 'Section',
  props: {
    name: {
      type: String,
      default: ''
    },
    componentName: {
      type: String,
      default: 'About'
    }
  },
  components: {
    About,
    Contact,
    News,
    Images
  }
};
</script>
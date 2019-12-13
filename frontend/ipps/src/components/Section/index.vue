<template>
  <section>
    <section>
      <div class="app-container">
        <div class="section-header">
          <h2>{{ name }}</h2>
        </div>
        <div class="section-body">
          <component :is="$options.components[componentName]" />
        </div>
      </div>
    </section>
  </section>
</template>

<script>
import About from './components/About';
import Contact from './components/Contact';
import News from './components/News';

export default {
  name: 'Section',
  components: {
    About,
    Contact,
    News
  },
  data() {
    return {
      name: 'Test Section',
      componentName: 'News'
    };
  }
};
</script>
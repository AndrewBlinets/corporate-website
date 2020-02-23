<template>
  <header
    v-scroll="handleSroll"
    class="navbar navbar-default navbar-fixed menu-top"
    :class="{ 'menu-shrink': menuShrink }"
  >
    <div class="app-container">
      <div class="content">
        <div class="logo">
          <img src="@/images/logoIPPS.png" alt="ИППС" srcset="">
        </div>
        <app-menu />
      </div>
    </div>
  </header>
</template>

<script>
import { Scroll } from '@/directive/scroll';
import AppMenu from './Menu';

export default {
  name: 'Navbar',
  components: {
    AppMenu
  },
  directives: {
    Scroll
  },
  data() {
    return {
      menuShrink: false,
      boxNext: false,
      sections: ['company'],
      dimensions: {
        products: { width: 490, height: 280, x: 0 },
        developers: { width: 390, height: 266, x: 100 },
        company: { width: 260, height: 296, x: 200 }
      }
    };
  },
  created() {
    setInterval(() => {
      this.boxNext = !this.boxNext;
    }, 2000);
  },
  methods: {
    handleSroll() {
      this.menuShrink = window.scrollY > 50;
    }
  }
};
</script>

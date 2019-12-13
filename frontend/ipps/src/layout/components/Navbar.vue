<template>
  <header
    v-scroll="handleSroll"
    class="navbar navbar-default navbar-fixed menu-top"
    :class="{ 'menu-shrink': menuShrink }"
  >
    <div class="app-container">
      <div class="content">
        <div class="logo">
          <img src="../../images/logoIPPS.png" alt="ИППС" srcset="">
        </div>
        <div class="main-menu">
          <ul class="nav">
            <li data-nav="company">
              <router-link :to="{ name: 'home' }">Главная</router-link>
            </li>
            <li>
              <router-link :to="{ name: 'contacts' }">Контакты</router-link>
            </li>
            <li>
              <router-link :to="{ name: 'projects' }">Проекты</router-link>
            </li>
            <li>
              <router-link :to="{ name: 'eastern-partnership' }">Восточное Партнерство</router-link>
            </li>
            <li>
              <router-link :to="{ name: 'technical committee' }">Национальный Технический Комитет</router-link>
            </li>
          </ul>
          <!-- <div class="popover">
            <div class="content">
              <section class="section section-company">
                <ul class="navlist">
                  <li><i data-feather="info"></i>О нас</li>
                  <li><i data-feather="users"></i>Направления деятельности</li>
                  <li><i data-feather="server"></i>Клиенты</li>
                  <li><i data-feather="briefcase"></i>Проекты</li>
                  <li><i data-feather="image"></i>Новости</li>
                  <li><i data-feather="layout"></i>Контакты</li>
                </ul>
              </section>
            </div>
          </div>
          <div class="background"></div> -->
        </div>
      </div>
    </div>
  </header>
</template>

<script>
import { Scroll } from '@/directive/scroll';

export default {
  name: 'Navbar',
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
      this.menuShrink = window.scrollY > 100;
    },
  }
};
</script>

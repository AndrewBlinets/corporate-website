<template>
  <div
      v-resize="handleMenu"
      class="main-menu"
    > 

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
</template>

<script>
import { Resize } from '@/directive/resize';

export default {
  name: 'Menu',
  directives: {
    Resize
  },
  data() {
    return {
      mobile: false
    };
  },
  methods: {
    handleMenu() {
      this.mobile = this.$el.clientHeight > 24;
    }
  }
};
</script>
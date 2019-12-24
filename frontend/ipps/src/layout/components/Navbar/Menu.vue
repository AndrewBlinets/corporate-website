<template>
  <div
    v-resize="handleMenu"
    class="main-menu"
  > 

    <ul v-if="!mobile" class="nav">
      <li
        v-for="link in links"
        :key="link.path"
      >
        <router-link :to="{ name: link.path }">{{ link.name }}</router-link>
      </li>
    </ul>
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
      mobile: false,
      links: [
        {
          name: 'Главная',
          path: 'home'
        },
        {
          name: 'Контакты',
          path: 'contacts'
        },
        {
          name: 'Проекты',
          path: 'projects'
        },
        {
          name: 'Восточное Партнерство',
          path: 'eastern-partnership'
        },
        {
          name: 'Национальный Технический Комитет',
          path: 'technical-committee'
        }
      ]
    };
  },
  mounted() {
    this.mobile = document.documentElement.clientWidth <= 768;
  },
  methods: {
    handleMenu() {
      this.mobile = document.documentElement.clientWidth <= 768;
    }
  }
};
</script>
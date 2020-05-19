<template>
  <div
    v-resize="handleMenu"
    class="menu-container"
    :class="{ 'menu-mobile': mobile }"
  >
    <div class="menu" :class="{ 'dark-menu': dark }">
      <router-link
        v-for="(link, index) in links"
        :key="index"
        :to="{ name: link.path }"
        class="menu__link"
      >
        {{ link.name }}
      </router-link>
    </div>
  </div>
</template>

<script>
import { Resize } from '@/directive/resize';
import { mapState, mapActions } from 'vuex';

export default {
  name: 'Menu',
  directives: {
    Resize,
  },
  props: {
    dark: {
      type: Boolean,
      default: false,
    },
  },
  data: () => ({
    links: [
      {
        name: 'Главная',
        path: 'home',
      },
      {
        name: 'О нас',
        path: 'about-us',
      },
      {
        name: 'Новости',
        path: 'news',
      },
      {
        name: 'Проекты',
        path: 'projects',
      },
      {
        name: 'Контакты',
        path: 'contacts',
      },

      {
        name: 'Восточное Партнерство',
        path: 'eastern-partnership',
      },
      {
        name: 'Национальный Технический Комитет',
        path: 'technical-committee',
      },
    ],
  }),
  computed: {
    ...mapState('app', ['mobile', 'sidebar']),
  },
  watch: {
    $route: 'closeSidebar',
  },
  mounted() {
    this.handleMenu();
  },
  methods: {
    ...mapActions('app', ['closeSidebar', 'hasMobileDevice']),
    handleMenu() {
      this.hasMobileDevice(window.innerWidth < 1178);
    },
  },
};
</script>

<style lang="stylus" scoped>
.menu-container {
  position: relative;

  &.menu-mobile {
    .menu {
      flex-direction: column;
      align-items: flex-start;

      .menu__link {
        justify-content: flex-start;
        width: 100%;
        margin: 10px 0;
      }
    }
  }
}

.menu {
  display: flex;

  .menu__link {
    position: relative;
    display: flex;
    align-items: center;
    justify-content: center;
    font-weight: 400;
    color: #fff;
    min-width: 48px;
    min-height: 36px;
    padding: 4px 16px;
    border-radius: 4px;

    &::before {
      content: '';
      position: absolute;
      top: 0;
      bottom: 0;
      left: 0;
      right: 0;
      border-radius: inherit;
      opacity: 0;
      transition: opacity 0.2s cubic-bezier(0.4, 0, 0.6, 1);
      background-color: currentColor;
    }

    &:hover::before {
      opacity: 0.08;
    }
  }

  &.dark-menu {
    .menu__link {
      color: #222;
    }
  }
}
</style>

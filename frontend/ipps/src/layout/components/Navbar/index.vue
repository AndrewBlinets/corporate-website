<template>
  <header
    v-scroll="handleSroll"
    class="navbar navbar-default navbar-fixed menu-top"
    :class="{ 'menu-shrink': menuShrink }"
  >
    <div class="app-container">
      <div class="content">
        <div class="logo">
          <app-image :id="142" name="ИППС" backgroundColor="#ffffff00" />
        </div>

        <button-menu
          v-if="mobile"
          :dark="!menuShrink"
          @click="openSidebar"
        ></button-menu>
        <app-menu v-else :dark="menuShrink" />
      </div>
    </div>
  </header>
</template>

<script>
import { mapState, mapActions } from 'vuex';
import { Scroll } from '@/directive/scroll';
import AppMenu from './components/Menu.vue';
import AppImage from '@/components/AppImage/index.vue';
import ButtonMenu from './components/ButtonMenu.vue';

export default {
  name: 'Navbar',
  components: {
    AppMenu,
    AppImage,
    ButtonMenu,
  },
  directives: {
    Scroll,
  },
  data: () => ({
    menuShrink: false,
  }),
  computed: {
    ...mapState('app', ['mobile', 'sidebar']),
  },
  methods: {
    ...mapActions('app', ['openSidebar']),
    handleSroll() {
      this.menuShrink = window.scrollY > 50;
    },
  },
};
</script>

<style lang="stylus" scoped>
.logo {
  width: 50px;
  height: 50px;
}
</style>

<template>
  <transition name="slide-fade">
    <div class="visually-panel__container">
      <div ref="sdfsdf" class="mb-3">
        <div class="subheader">Размер шрифта</div>
        <div class="content">
          <div class="row mx-n1">
            <div class="col px-1">
              <v-button @click="setFontSize('default')">A</v-button>
            </div>
            <div class="col px-1">
              <v-button fontSize="medium" @click="setFontSize('medium')">
                A
              </v-button>
            </div>
            <div class="col px-1">
              <v-button fontSize="large" @click="setFontSize('large')">
                A
              </v-button>
            </div>
          </div>
        </div>
      </div>

      <div>
        <div class="subheader">Цветовая схема</div>
        <div class="content">
          <div class="row mx-n2 mb-2">
            <div class="col px-2">
              <v-button color="#1461ff" @click="setThemeApp('default')" />
            </div>
            <div class="col px-2">
              <v-button color="#fff" @click="setThemeApp('white')" />
            </div>
            <div class="col px-2">
              <v-button color="#000" @click="setThemeApp('black')" />
            </div>
            <div class="col px-2">
              <v-button color="#9dd1ff" @click="setThemeApp('blue')" />
            </div>
          </div>

          <div class="row mx-n2">
            <div class="col px-2">
              <v-button color="#f7f3d6" @click="setThemeApp('beige')" />
            </div>
            <div class="col px-2">
              <v-button color="#3b2716" @click="setThemeApp('brown')" />
            </div>
          </div>
        </div>
      </div>
    </div>
  </transition>
</template>

<script>
import { mapActions } from 'vuex';
import VButton from '@/components/UI/VButton';

export default {
  name: 'SettingsPanel',
  components: {
    VButton,
  },
  methods: {
    ...mapActions('app', ['setThemeApp', 'setFontSize']),
  },
};
</script>

<style lang="stylus" scoped>
.visually-panel__container {
  position: absolute;
  min-width: 240px;
  padding: 8px 0;
  background: #fff;
  overflow-y: auto;
  overflow-x: hidden;
  box-shadow: 0 5px 5px -3px rgba(0, 0, 0, 0.2), 0 8px 10px 1px rgba(0, 0, 0, 0.14), 0 3px 14px 2px rgba(0, 0, 0, 0.12);
  border-radius: 4px;

  .subheader {
    display: flex;
    align-items: center;
    height: 48px;
    font-size: 0.875rem;
    padding: 0 16px;
    color: rgba(0, 0, 0, 0.6);
  }

  .content {
    display: flex;
    flex-wrap: wrap;
    padding: 0 16px;
  }
}

.btn {
  width: 40px;
  height: 40px;
  margin: 0 5px;
  border: 1px solid black;
}

.btn-color-default {
  background-color: $themes.theme-default.$secondary--dark--color;
}

.btn-color-white {
  background-color: $themes.theme-white.$secondary--light--color;
}

.btn-color-black {
  background-color: $themes.theme-black.$secondary--light--color;
}

.btn-color-blue {
  background-color: $themes.theme-blue.$secondary--light--color;
}

.btn-color-beige {
  background-color: $themes.theme-beige.$secondary--light--color;
}

.btn-color-brown {
  background-color: $themes.theme-brown.$secondary--light--color;
}

.slide-fade-enter-active, .slide-fade-leave-active {
  transition: all 0.4s cubic-bezier(0.694, 0, 0.335, 1);
  transform: translateY(-10%);
}

.slide-fade-enter, .slide-fade-leave-to {
  transform: translate(10%);
  opacity: 0;
}

.fade-enter-active, .fade-leave-active {
  transition: opacity 0.4s cubic-bezier(0.694, 0, 0.335, 1);
}

.fade-enter, .fade-leave-to {
  opacity: 0;
}
</style>

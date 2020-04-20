<template>
  <v-row align="stretch" class="settings-container">
    <v-col cols="3">
      <settings-menu></settings-menu>
    </v-col>
    <v-col cols="5"></v-col>
    <v-col cols="2"></v-col>
  </v-row>
</template>

<script>
import SettingsMenu from './components/SettingsMenu';

export default {
  name: 'Settings',
  components: {
    SettingsMenu,
  },
};
</script>

<style lang="scss" scoped>
.settings-container {
  height: 100%;
}
</style>

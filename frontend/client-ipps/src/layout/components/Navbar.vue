<template>
  <v-app-bar color="#fff" elevation="1" app clipped-left>
    <v-toolbar-title>IPPS</v-toolbar-title>

    <v-spacer></v-spacer>

    <v-avatar color="#1461ff" class="mr-2">
      <span class="white--text">{{ shortNameAvatar }}</span>
    </v-avatar>

    <span>{{ fullName }}</span>
  </v-app-bar>
</template>

<script>
import { mapGetters } from 'vuex';

export default {
  name: 'Navbar',
  computed: {
    ...mapGetters('user', ['fullName', 'shortNameAvatar']),
  },
};
</script>

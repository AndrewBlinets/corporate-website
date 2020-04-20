<template>
  <v-navigation-drawer app clipped>
    <v-list nav>
      <v-list-item-group color="primary">
        <v-list-item :to="{ name: 'dashboard' }">
          <v-list-item-icon>
            <v-icon>mdi-view-dashboard</v-icon>
          </v-list-item-icon>

          <v-list-item-content>Dashboard</v-list-item-content>
        </v-list-item>

        <v-list-item :to="{ name: 'settings' }">
          <v-list-item-icon>
            <v-icon>mdi-cogs</v-icon>
          </v-list-item-icon>

          <v-list-item-content>Настройки</v-list-item-content>
        </v-list-item>

        <v-list-item color="#F44336" @click="logout">
          <v-list-item-icon></v-list-item-icon>
          <v-list-item-content>
            <v-list-item-title>Выход</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list-item-group>
    </v-list>
  </v-navigation-drawer>
</template>

<script>
export default {
  name: 'Sidebar',
  methods: {
    logout() {
      this.$store.dispatch('user/logout');
      this.$router.push({ name: 'login' });
    },
  },
};
</script>

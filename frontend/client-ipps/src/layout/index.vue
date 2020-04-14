<template>
  <div>
    <v-app-bar color="primary" app dark>
      <v-toolbar-title>IPPS</v-toolbar-title>

      <v-spacer></v-spacer>

      <v-avatar color="white">
        <span class="black--text headline">CJ</span>
      </v-avatar>

      <v-menu left bottom>
        <template v-slot:activator="{ on }">
          <v-btn icon v-on="on">
            <v-icon>mdi-dots-vertical</v-icon>
          </v-btn>
        </template>

        <v-list>
          <v-list-item>
            <v-list-item-title>Настройки</v-list-item-title>
          </v-list-item>
          <v-list-item>
            <v-list-item-title>Выход</v-list-item-title>
          </v-list-item>
        </v-list>
      </v-menu>
    </v-app-bar>

    <v-content>
      <v-container>
        <router-view></router-view>
      </v-container>
    </v-content>
  </div>
</template>

<script>
export default {
  name: 'Layout',
};
</script>

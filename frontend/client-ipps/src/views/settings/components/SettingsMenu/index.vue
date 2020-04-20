<template>
  <v-sheet color="#e3f2fd" class="settings-menu">
    <v-list color="#E3F2FD" width="250px">
      <v-subheader>НАСТРОЙКИ ПОЛЬЗОВАТЕЛЯ</v-subheader>
      <v-list-item-group color="primary">
        <v-list-item>
          <v-list-item-content>
            <v-list-item-title>Моя учётная запись</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list-item-group>
    </v-list>
  </v-sheet>
</template>

<script>
export default {
  name: 'SettingsMenu',
};
</script>

<style lang="scss" scoped>
.settings-menu {
  height: 100%;
  display: flex;
  justify-content: flex-end;
}
</style>

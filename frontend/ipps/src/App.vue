<template>
  <div id="app">
    <router-view />
  </div>
</template>

<script>
import { mapActions } from 'vuex';

export default {
  name: 'App',
  computed: {
    isMobile() {
      return (
        /Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(
          navigator.userAgent,
        ) || window.innerWidth < 1178
      );
    },
  },
  created() {
    this.hasMobileDevice(this.isMobile);
  },
  methods: {
    ...mapActions('app', ['hasMobileDevice']),
  },
};
</script>

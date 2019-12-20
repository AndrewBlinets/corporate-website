<template>
  <div>
    <div class="main-banner banner">
      <div class="app-container grid grid-header">
        <div class="banner-content">
          <h4>НИРУП</h4>
          <h1>Институт прикладных программных систем</h1>
          <p>Современная, динамично развиввающаяся компания в области научно-методического обеспечения процессов развития информатизации, бизнес-анализа, создания информационных систем электронного правительства и предоставления услуг в области IT.</p>
          <social-links />
        </div>
        <!-- <div class="banner-img-content">
          <div class="main-img">
            <img src="../../images/logoIPPS.png" alt="">
          </div>
        </div> -->
      </div>
    </div>

    <about-us />
    <activities />
    <counter-area />
    <news />
    <projects />
    <clients />
    <contacts />
  </div>
</template>

<script>
import AboutUs from './components/AboutUs';
import Activities from './components/Activities';
import Contacts from './components/Contacts';
import CounterArea from './components/CounterArea';
import News from './components/News';
import Clients from './components/Clients';
import Projects from './components/Projects';
import SocialLinks from '@/components/SocialLinks';

export default {
  name: 'Home',
  components: {
    AboutUs,
    Activities,
    Contacts,
    CounterArea,
    News,
    Clients,
    Projects,
    SocialLinks
  }
};
</script>

<style lang="stylus" scoped>
.banner-img-content
  display: flex
  justify-content: center
  align-items: center
  .main-img img
    max-width: 300px
</style>
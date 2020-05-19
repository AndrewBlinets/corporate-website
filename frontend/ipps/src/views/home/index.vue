<template>
  <div>
    <div class="main-banner">
      <div class="banner-image">
        <app-image :id="18"></app-image>
      </div>
      <div class="app-container grid grid-header">
        <div class="banner-content">
          <h4>НИРУП</h4>
          <h1>Институт прикладных программных систем</h1>
          <p>
            Современная, динамично развиввающаяся компания в области
            научно-методического обеспечения процессов развития информатизации,
            бизнес-анализа, создания информационных систем электронного
            правительства и предоставления услуг в области IT.
          </p>
          <social-links />
        </div>
      </div>
    </div>

    <about-us></about-us>
    <activities></activities>
    <counter-area></counter-area>
    <news></news>
    <projects></projects>
    <partners></partners>
    <contacts></contacts>
  </div>
</template>

<script>
import AppImage from '@/components/AppImage';
import AboutUs from './components/AboutUs';
import Activities from './components/Activities';
import Contacts from './components/Contacts';
import CounterArea from './components/CounterArea';
import News from './components/News';
import Partners from './components/Partners';
import Projects from './components/Projects';
import SocialLinks from '@/components/SocialLinks';

export default {
  name: 'Home',
  components: {
    AppImage,
    AboutUs,
    Activities,
    Contacts,
    CounterArea,
    News,
    Partners,
    Projects,
    SocialLinks,
  },
};
</script>

<style lang="stylus" scoped>
.main-banner {
  position: relative;
  height: 700px;
  overflow: hidden;

  &:before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: -webkit-linear-gradient(-45deg, rgba(88, 195, 255, 0.7) 0, rgba(0, 77, 230, 0.7) 40%, rgba(0, 59, 177, 0.7) 100%);
    z-index: -1;
  }

  &:after {
    position: absolute;
    content: '';
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: rgba(0, 0, 0, 0.6);
    z-index: -2;
  }

  .banner-image {
    position: absolute;
    width: 100%;
    height: 100%;
    z-index: -3;
  }

  .banner-content {
    display: flex;
    flex-direction: column;
    align-items: baseline;
    justify-content: center;
    height: 100%;

    h1 {
      margin-bottom: 3rem;
      color: #fff;
    }

    h4 {
      color: #1461ff;
      background: #fff;
      padding: 4px 18px;
      border-radius: 5px;
      margin-bottom: 1.5rem;
    }

    p {
      color: #fff;
    }

    .banner__social-link {
      display: flex;

      .social-link {
        margin-right: 15px;
        color: #fff;
        border: 1px solid #fff;
        width: 40px;
        height: 40px;
        line-height: 40px;
        border-radius: 50%;
        text-align: center;
        display: inline-block;
        font-size: 14px;
        transition: 0.5s;
      }

      .social-link:hover {
        color: #1461ff;
        background: #fff;
      }
    }
  }
}
</style>

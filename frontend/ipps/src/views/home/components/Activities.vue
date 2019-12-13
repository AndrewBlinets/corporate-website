<template>
  <section id="activities" class="bgr-grey">
    <div class="app-container grid-area">
      <div class="section-header">
        <h2>Направления Деятельности</h2>
      </div>
      <div class="section-body">
        <div class="services-container">
          <div class="service-item">
            <h5>Программный инжиниринг</h5>
          </div>
          <div class="service-item">
            <h5>Создание инфраструктуры электронного правительства</h5>
          </div>
          <div class="service-item">
            <h5>Развитие государственных и комерерческих электронных услуг</h5>
          </div>
          <div class="service-item">
            <h5>Деятельность по технической защите информациии</h5>
          </div>
          <div class="service-item">
            <h5>Сопровождение ранее разработанных информационных систем</h5>
          </div>
          <div class="service-item">
            <h5>Государстенная регистрация информационных систем и информационных ресурсов</h5>
          </div>
          <div class="service-item">
            <h5>Разработка информационных систем расчёта и анализа показателей состояния информатизации в Республике Беларусь</h5>
          </div>
          <div class="service-item">
            <h5>Аутсорсинг государственных информационных систем</h5>
          </div>
          <div class="service-item">
            <h5>Создание программного обеспечения для систем организационно-экономическог управления</h5>
          </div>
          <div class="service-item">
            <h5>Комплексная автоматизация бухгалтерского учёта бюджетной сферы</h5>
          </div>
          <div class="service-item">
            <h5>Координация проектов по эл. торговле, эл. логистике в восточном портнёрстве и цифровых транспортных коридорах</h5>
          </div>          
          <div class="service-item">
            <h5>Стандартизация в сфере цифровой трансформации</h5>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  name: 'Activities'  
};
</script>

<style lang="stylus" scoped>
.services-container
  display: flex
  flex-wrap: wrap
  position: relative
  background-image: url(../../../images/activities.jpg)
  background-size: cover
  background-position: center center
  z-index: 0
  &:before
    content: ""
    position: absolute
    right: 0
    bottom: 0
    width: 100%
    height: 100%
    z-index: -1;
    background: -webkit-linear-gradient(-45deg,rgba(88, 195, 255,.8) 0,rgba(0, 77, 230,.8) 40%,rgba(0, 59, 177,.8) 100%)
  .service-item
    display: flex
    width: calc(100% / 4)
    height: 200px
    padding: 20px
    align-items: center
    transition: all 0.4s ease
    border-right: 2px solid #ffffff9e
    border-bottom: 2px solid #ffffff9e
    h5
      color: #fff
      transition: all 0.4s ease
    &:hover
      background-color: #1461FF
      border-right-color: #fff
      border-bottom-color: #fff
      h5        
        transform: translateY(-7px);
</style>

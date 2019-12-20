<template>
  <section id="activities" class="bgr-grey">
    <div class="app-container grid-area">
      <div class="section-header">
        <h2>Направления Деятельности</h2>
      </div>
      <div class="section-body">
        <div class="services-container">
          <div class="row no-gutters">
            <div
              v-for="servise in servises"
              :key="servise.id"
              class="col"
            >
              <div class="service-item">
                <h5>{{ servise.title }}</h5>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  name: 'Activities',
  data() {
    return {
      servises: [{
          id: 1,
          title: 'Программный инжиниринг'
        }, {
          id: 2,
          title: 'Создание инфраструктуры электронного правительства'
        }, {
          id: 3,
          title: 'Развитие государственных и комерерческих электронных услуг'
        }, {
          id: 4,
          title: 'Деятельность по технической защите информациии'
        }, {
          id: 5,
          title: 'Сопровождение ранее разработанных информационных систем'
        }, {
          id: 6,
          title: 'Государстенная регистрация информационных систем и информационных ресурсов'
        }, {
          id: 7,
          title: 'Разработка информационных систем расчёта и анализа показателей состояния информатизации в Республике Беларусь'
        }, {
          id: 8,
          title: 'Аутсорсинг государственных информационных систем'
        }, {
          id: 9,
          title: 'Создание программного обеспечения для систем организационно-экономическог управления'
        }, {
          id: 10,
          title: 'Комплексная автоматизация бухгалтерского учёта бюджетной сферы'
        }, {
          id: 11,
          title: 'Координация проектов по эл. торговле, эл. логистике в восточном портнёрстве и цифровых транспортных коридорах'
        }, {
          id: 12,
          title: 'Стандартизация в сфере цифровой трансформации'
        }
      ]
    };
  }
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
  min-width: 310px
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
      transform: translateY(-7px)
</style>

<template>
  <section id="counter-area" class="section-padding">
    <div class="app-container">
      <div class="row">
        <div class="col">
          <div class="single-counter">
            <div class="icon">
              <font-awesome-icon :icon="['fas', 'user-tie']" size="2x" />
            </div>
            <span class="counter">300+</span>
            <h5>Клиентов</h5>
          </div>
        </div>
        <div class="col">
          <div class="single-counter">
            <div class="icon">
              <font-awesome-icon :icon="['fas', 'briefcase']" size="2x" />
            </div>
            <span class="counter">100+</span>
            <h5>Проектов</h5>
          </div>
        </div>
        <div class="col">
          <div class="single-counter">
            <div class="icon">
              <font-awesome-icon :icon="['fas', 'clock']" size="2x" />
            </div>
            <span class="counter">40+</span>
            <h5>Лет на рынке</h5>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  name: 'CounterArea'
};
</script>

<style lang="stylus" scoped>
#counter-area
  position: relative
  background-image: url(../../../images/banner.jpg)
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
    background: linear-gradient(-45deg,rgba(88, 195, 255,.8) 0,rgba(0, 77, 230,.8) 40%,rgba(0, 59, 177,.8) 100%)

.section-padding
  padding: 100px 0

.single-counter
  text-align: center
  color: #fff
  .icon
    margin-bottom: 25px
  .counter
    font-size: 36px
    font-style: italic
    font-weight: 300
    margin-bottom: 10px
  h5
    margin-top: 10px
</style>

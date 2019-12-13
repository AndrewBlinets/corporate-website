<template>
  <section id="projects" class="bgr-grey">
    <div class="app-container grid-area">
      <div class="section-header">
        <h2>Проекты</h2>
      </div>
      <div class="section-body">
        <div class="projects-container">
          <div class="project-item">
            <img src="../../../images/project1.jpg" alt="" srcset="">
            <div class="item-overlay">
              <div class="overlay-info">
                <p>Единое информационное пространство отрасли на базе программных средств автоматизированной информационной системы (АИС) госоргана (ведомства)</p>
              </div>
            </div>
          </div>
          <div class="project-item">
            <img src="../../../images/project2.jpg" alt="" srcset="">
            <div class="item-overlay">
              <div class="overlay-info">
                <p>Единое информационное пространство отрасли на базе программных средств автоматизированной информационной системы (АИС) госоргана (ведомства)</p>
              </div>
            </div>
          </div>
          <div class="project-item">
            <img src="../../../images/project3.jpg" alt="" srcset="">
            <div class="item-overlay">
              <div class="overlay-info">
                <p>Единое информационное пространство отрасли на базе программных средств автоматизированной информационной системы (АИС) госоргана (ведомства)</p>
              </div>
            </div>
          </div>
          <div class="project-item">
            <img src="../../../images/project4.jpg" alt="" srcset="">
            <div class="item-overlay">
              <div class="overlay-info">
                <p>Единое информационное пространство отрасли на базе программных средств автоматизированной информационной системы (АИС) госоргана (ведомства)</p>
              </div>
            </div>
          </div>
          <div class="project-item">
            <img src="../../../images/project5.jpg" alt="" srcset="">
            <div class="item-overlay">
              <div class="overlay-info">
                <p>Единое информационное пространство отрасли на базе программных средств автоматизированной информационной системы (АИС) госоргана (ведомства)</p>
              </div>
            </div>
          </div>
          <div class="project-item">
            <img src="../../../images/project6.jpg" alt="" srcset="">
            <div class="item-overlay">
              <div class="overlay-info">
                <p>Единое информационное пространство отрасли на базе программных средств автоматизированной информационной системы (АИС) госоргана (ведомства)</p>
              </div>
            </div>
          </div>
        </div>
        <div class="button-container">
          <div class="button-item">
            <router-link
              :to="{ name: 'projects' }"
              class="btn btn-main"
            >Все Проекты</router-link>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  name: 'Projects'
};
</script>

<style lang="stylus" scoped>
.projects-container
  margin-bottom: 3rem
.project-item
  position: relative
  box-shadow: 0 1px 30px rgba(0, 0, 0, 0.1)
  overflow: hidden
  .item-overlay
    position: absolute
    top: 20px
    left: 20px
    right: 20px
    bottom: 20px
    padding: 30px
    background: rgba(255,255,255, 0.95)
    opacity: 0
    visibility: hidden
    -webkit-transition: all .5s
    transition: all .5s
    .overlay-info h5
      font-weight: 300
  &:hover
    .item-overlay
      visibility: visible
      opacity: 1
</style>

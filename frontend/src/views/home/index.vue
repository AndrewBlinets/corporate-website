<template>
  <div>
  <div class="main-banner banner">
      <div class="container">
        <div class="banner-content">
          <span>НИРУП</span>
          <h1>Институт прикладных программных систем</h1>
          <p>Современная, динамично развиввающаяся компания в области научно-методического обеспечения процессов развития информатизации, бизнес-анализа, создания информационных систем электронного правительства и предоставления услуг в области IT.</p>
          <div class="banner__social-link">
            <a href="" class="social-link">
              <font-awesome-icon :icon="['fab', 'vk']" />
            </a>
            <a href="" class="social-link">
              <font-awesome-icon :icon="['fab', 'facebook-f']" />
            </a>
            <a href="" class="social-link">
              <font-awesome-icon :icon="['fab', 'twitter']" />
            </a>
            <a href="" class="social-link">
              <font-awesome-icon :icon="['fab', 'youtube']" />
            </a>
          </div>
        </div>
      </div>
    </div>
    <div class="section-padding">
      <div class="container">
        <div class="section-header">
          <h2>Новости</h2>
          <div class="small-border"></div>
        </div>
        <div class="section-body">
          <div class="news-container">
            <div class="news-card">
              <div class="news-img">
                <img src="../../images/news1.jpg" alt="" srcset="">
                <div class="state">
                  <div class="state-item state-comment">
                    <font-awesome-icon :icon="['fas', 'comment-alt']" />
                    <span>10</span>
                  </div>
                  <div class="state-item state-data">
                    <span>10.08.2019</span>
                  </div>
                </div>
              </div>
              <div class="news-info">
                <h4>
                  <router-link :to="{ name: 'Article'}">С 4 по 30 октября 2019 года в Республике Беларусь пройдет перепись населения</router-link>
                </h4>
                <p>Целью подписания соглашения является взаимодействие и координация деятельности по интеграции автоматизированных систем и электронной торговой площадки «Грузовые перевозки».</p>
              </div>
            </div>
            <div class="news-card">
              <div class="news-img">
                <img src="../../images/news2.jpg" alt="" srcset="">
                <div class="state">
                  <div class="state-item state-comment">
                    <font-awesome-icon :icon="['fas', 'comment-alt']" />
                    <span>10</span>
                  </div>
                  <div class="state-item state-data">
                    <span>10.08.2019</span>
                  </div>
                </div>
              </div>
              <div class="news-info">
                <h4>
                  <a href="">19 сентября 2019 года НИРУП «ИППС» и ООО «Цифровая логистика» (Российская Федерация) подписали соглашение о сотрудничестве и взаимодействии в области внедрения цифровых технологий на железнодорожном транспорте</a>
                </h4>
                <p>Целью подписания соглашения является взаимодействие и координация деятельности по интеграции автоматизированных систем и электронной торговой площадки «Грузовые перевозки».</p>
              </div>
            </div>
            <div class="news-card">
              <div class="news-img">
                <img src="../../images/news3.jpg" alt="" srcset="">
                <div class="state">
                  <div class="state-item state-comment">
                    <font-awesome-icon :icon="['fas', 'comment-alt']" />
                    <span>10</span>
                  </div>
                  <div class="state-item state-data">
                    <span>10.08.2019</span>
                  </div>
                </div>
              </div>
              <div class="news-info">
                <h4>
                  <a href="">Дайджест публикаций на сайтах органов государственного управления в области информатизации стран СНГ</a>
                </h4>
                <p>Целью подписания соглашения является взаимодействие и координация деятельности по интеграции автоматизированных систем и электронной торговой площадки «Грузовые перевозки».</p>
              </div>
            </div>
          </div>
          <div class="button-container">
            <div class="button-item">
              <a href="" class="btn btn-main">Все Новости</a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="section-padding backgr-grey">
      <div class="container">
        <div class="section-header">
          <h2>направления деятельности</h2>
          <div class="small-border"></div>
        </div>
        <div class="section-body">
          <div class="services-container">
            <div class="service-item">
              <img src="../../images/desktop.svg" alt="" srcset="">
            </div>
            <div class="service-item">
              <img src="../../images/layers.svg" alt="" srcset="">
            </div>
            <div class="service-item">
              <img src="../../images/line-chart.svg" alt="" srcset="">
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="section-padding">
      <div class="container">
        <div class="section-header">
          <h2>Наши проекты</h2>
          <div class="small-border"></div>
        </div>
        <div class="section-body">
          <div class="projects-container">
            <div class="project-item">
              <img src="../../images/project1.jpg" alt="" srcset="">
            </div>
            <div class="project-item">
              <img src="../../images/project2.jpg" alt="" srcset="">
            </div>
            <div class="project-item">
              <img src="../../images/project3.jpg" alt="" srcset="">
            </div>
            <div class="project-item">
              <img src="../../images/project4.jpg" alt="" srcset="">
            </div>
            <div class="project-item">
              <img src="../../images/project5.jpg" alt="" srcset="">
            </div>
            <div class="project-item">
              <img src="../../images/project6.jpg" alt="" srcset="">
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="section-padding">
      <div class="container">
        <div class="section-header">
          <h2>Контакты</h2>
          <div class="small-border"></div>
        </div>
        <div class="section-body"></div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Home'
}
</script>
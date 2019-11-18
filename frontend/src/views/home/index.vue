<template>
  <div>
    <div class="main-banner banner">
      <div class="container grid grid-header">
        <div class="banner-content">
          <h4>НИРУП</h4>
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

    <section id="about-us">
      <div class="container grid-area">
        <div class="section-header">
          <h2>О нас</h2>
          <div class="small-border"></div>
        </div>
        <div class="section-body grid">
          <div class="information">
            <p>Большинство разработанных НИРУП «ИППС» продуктов относятся к глобальным, эффективно применяемым на общегосударственном уровне.</p>
            <p>Предприятие выполняет заказы более 300 организаций, органов государственного управления, учреждений и предприятий в Республике Беларусь и Российской Федерации.</p>
            <p>Мы предлагаем сотрудничество по разработке программного обеспечения, созданию корпоративных систем, автоматизации бухгалтерского учета непроизводственной сферы, комплексной автоматизации органов государственного управления и других структур.</p>
          </div>
          <div class="information-statistic">
            <div class="data-statistic">
              <h2>300+</h2>
              <h5>клиентов</h5>
            </div>
            <div class="data-statistic">
              <h2>100+</h2>
              <h5>проектов</h5>
            </div>
            <div class="data-statistic">
              <h2>40+</h2>
              <h5>на рынке</h5>
            </div>
          </div>
        </div>
      </div>
    </section>

    <section id="activities">
      <div class="container grid-area">
        <div class="section-header">
          <h2>направления деятельности</h2>
          <div class="small-border"></div>
        </div>
        <div class="section-body">
          <div class="services-container">
            <div class="service-item">
              <img src="../../images/desktop.svg" alt="" srcset="">
              <h5>Программный инжиниринг</h5>
            </div>
            <div class="service-item">
              <img src="../../images/layers.svg" alt="" srcset="">
              <h5>Создание инфраструктуры электронного правительства</h5>
            </div>
            <div class="service-item">
              <img src="../../images/line-chart.svg" alt="" srcset="">
              <h5>Защита информациии</h5>
            </div>
            <div class="service-item">
              <img src="../../images/line-chart.svg" alt="" srcset="">
              <h5>Сопровождение проектов</h5>
            </div>
            <div class="service-item">
              <img src="../../images/line-chart.svg" alt="" srcset="">
              <h5>Государстенная регистрация ИС и ИР</h5>
            </div>
            <div class="service-item">
              <img src="../../images/line-chart.svg" alt="" srcset="">
              <h5>Автоматизация информационных систем</h5>
            </div>
            <div class="service-item">
              <img src="../../images/line-chart.svg" alt="" srcset="">
              <h5>Аутсорсинг государственных ИС</h5>
            </div>
            <div class="service-item">
              <img src="../../images/line-chart.svg" alt="" srcset="">
              <h5>Научно-технические, информационно-справочные услуги</h5>
            </div>
          </div>
        </div>
      </div>
    </section>
    
    <section id="news">
      <div class="container grid-area">
        <div class="section-header">
          <h2>Новости</h2>
          <div class="small-border"></div>
        </div>
        <div class="section-body">
          <div class="news-container">
            <div class="news-card card-img">
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
                <h5>
                  <a href="">Дайджест публикаций на сайтах органов государственного управления в области информатизации стран СНГ</a>
                </h5>                
              </div>
            </div>
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
                <h5>
                  <router-link :to="{ name: 'Article'}">С 4 по 30 октября 2019 года в Республике Беларусь пройдет перепись населения</router-link>
                </h5>
                <p>Целью подписания соглашения является взаимодействие и координация деятельности по интеграции автоматизированных систем и электронной торговой площадки «Грузовые перевозки».</p>
              </div>
            </div>
            <div class="news-card card-img">
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
                <h5>
                  <a href="">НИРУП «ИППС» и ООО «Цифровая логистика» (РФ) подписали соглашение о сотрудничестве и взаимодействии</a>
                </h5>
                <p>Целью подписания соглашения является взаимодействие и координация деятельности по интеграции автоматизированных систем и электронной торговой площадки «Грузовые перевозки».</p>
              </div>
            </div>
            <div class="news-card card-img">
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
                <h5>
                  <router-link :to="{ name: 'Article'}">С 4 по 30 октября 2019 года в Республике Беларусь пройдет перепись населения</router-link>
                </h5>
                <p>Целью подписания соглашения является взаимодействие и координация деятельности по интеграции автоматизированных систем и электронной торговой площадки «Грузовые перевозки».</p>
              </div>
            </div>
            <div class="news-list">
              <div class="news-info">
                <h5>
                  <router-link :to="{ name: 'Article'}">С 4 по 30 октября 2019 года в Республике Беларусь пройдет перепись населения</router-link>
                </h5>
                <div class="state">
                  <div class="state-item state-comment">
                    <font-awesome-icon :icon="['fas', 'comment-alt']" />
                    <span>10</span>
                  </div>
                  <div class="state-item state-data">
                    <span>10.08.2019</span>
                  </div>
                </div>
                <p>Целью подписания соглашения является взаимодействие и координация деятельности по интеграции автоматизированных систем и электронной торговой площадки «Грузовые перевозки».</p>
              </div>
              <div class="news-info">
                <h5>
                  <router-link :to="{ name: 'Article'}">С 4 по 30 октября 2019 года в Республике Беларусь пройдет перепись населения</router-link>
                </h5>
                <div class="state">
                  <div class="state-item state-comment">
                    <font-awesome-icon :icon="['fas', 'comment-alt']" />
                    <span>10</span>
                  </div>
                  <div class="state-item state-data">
                    <span>10.08.2019</span>
                  </div>
                </div>
                <p>Целью подписания соглашения является взаимодействие и координация деятельности по интеграции автоматизированных систем и электронной торговой площадки «Грузовые перевозки».</p>
              </div>
              <div class="news-info">
                <h5>
                  <router-link :to="{ name: 'Article'}">С 4 по 30 октября 2019 года в Республике Беларусь пройдет перепись населения</router-link>
                </h5>
                <div class="state">
                  <div class="state-item state-comment">
                    <font-awesome-icon :icon="['fas', 'comment-alt']" />
                    <span>10</span>
                  </div>
                  <div class="state-item state-data">
                    <span>10.08.2019</span>
                  </div>
                </div>
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
    </section>
    
    <section id="projects">
      <div class="container grid-area">
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
    </section>

    <section id="partners">
      <div class="container grid-area">
        <div class="section-header">
          <h2>Партёнры</h2>
          <div class="small-border"></div>
        </div>
        <div class="section-body"></div>
      </div>
    </section>

    <section id="contacts">
      <div class="container grid-area">
        <div class="section-header">
          <h2>Контакты</h2>
          <div class="small-border"></div>
        </div>
        <div class="section-body"></div>
      </div>
    </section>
  </div>
</template>

<script>
export default {
  name: 'Home'
}
</script>
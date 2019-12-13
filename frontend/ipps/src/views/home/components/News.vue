<template>
  <section id="news">
    <div class="app-container grid-area">
      <div class="section-header">
        <h2>Новости</h2>
      </div>
      <div class="section-body">
        <div class="news-container">
          <div class="news-card card-img">
            <div class="news-img">
              <img src="../../../images/news3.jpg" alt="" srcset="">
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
              <img src="../../../images/news1.jpg" alt="" srcset="">
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
              <img src="../../../images/news2.jpg" alt="" srcset="">
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
              <img src="../../../images/news1.jpg" alt="" srcset="">
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
            <router-link
              :to="{ name: 'news' }"
              class="btn btn-main"
            >Все Новости</router-link>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  name: 'News'
};
</script>

<template>
  <section id="contacts">
    <div class="app-container grid-area">
      <div class="section-header">
        <h2>Контакты</h2>
      </div>
      <div class="section-body">
        <div class="row">
          <div class="col">
            <div class="contact-info">
              <div class="about">
                <i class="fas fa-map-marker-alt icon"/>
                <span class="about-title">Адрес</span>
                <span>: 220013 г. Минск, ул.Беломорская, 18</span>
              </div>
              <div class="about">
                <i class="fas fa-phone-alt icon"></i>
                <span class="about-title">Телефон</span>
                <span>: (8-017) 290-07-66</span>
              </div>
              <div class="about">
                <i class="fas fa-envelope icon"></i>
                <span class="about-title">Email</span>
                <span>: info@ipps.by</span>
              </div>
            </div>
            <div class="note">
              <p>Телефон «горячей линии» - (8-017) 290-07-66</p>
              <div class="list">
                <div class="header">
                  <p>По номеру «горячей линии» можно обратиться:</p>
                </div>
                <ul>
                  <li>по вопросам справочно-консультационного характера, связанного с направлениями деятельности организации;</li>
                  <li>по вопросам выявления фактов вымогательства, взяточничества и других проявлений коррупции со стороны работников организации;</li>
                  <li>по вопросам записи на личный прием к руководству организации.</li>
                </ul>
              </div>
              <div class="list">
                <div class="header">
                  <p>Режим работы горячей линии:</p>
                </div>
                <ul>
                  <li>понедельник – четверг: с 9-00 до 18-00;</li>
                  <li>обеденный перерыв: с 13-00 до 13-45;</li>
                  <li>пятница: с 9-00 до 16-20;</li>
                  <li>обеденный перерыв: с 13-00 до 13-20;</li>
                  <li>выходной: суббота, воскресенье.</li>
                </ul>
              </div>
            </div>
          </div>
          <div class="col">
            <!-- <yandex-map
              :settings="settings"
              :coords="[53.924124, 27.588861]"
              :controls="['zoomControl']"
              zoom="14"
            >
              <ymap-marker
                marker-id="123"
                :marker-type="'Placemark'"
                :coords="[53.924124, 27.588861]"
              />
            </yandex-map> -->
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
// import { yandexMap, ymapMarker } from 'vue-yandex-maps';

export default {
  name: 'Contacts',
  // components: {
  //   yandexMap,
  //   ymapMarker
  // },
  data() {
    return {
      settings: {
        lang: 'ru_RU',
        coordorder: 'latlong',
        version: '2.1',
      }
    };
  },
};
</script>

<style lang="stylus" scoped>
.ymap-container
  height: 100%
</style>

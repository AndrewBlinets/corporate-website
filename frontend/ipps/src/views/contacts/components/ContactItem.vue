<template>
  <div class="col-sm-12 col-md-6 col-lg-4 mb-4">
    <div v-if="positions.length" class="position">
      <h5>{{ positions[0].name }}</h5>
    </div>
    <div v-if="fullName" class="name">
      <h3>{{ name }}</h3>
      <h3>{{ patronicName }}</h3>
      <h3>{{ surName }}</h3>
    </div>
    <div class="contact-info">
      <div class="about">
        <i class="fas fa-map-marker-alt icon"/>
        <span class="about-title">Кабинет</span>
        <span>: № {{ room }}</span>
      </div>
      <div class="about">
        <i class="fas fa-phone-alt icon"></i>
        <span class="about-title">Телефон</span>
        <span>: {{ phone }}</span>
      </div>
      <div class="about">
        <i class="fas fa-envelope icon"></i>
        <span class="about-title">Email</span>
        <span>: {{ email }}</span>
      </div>
    </div>
    <div v-if="contact.note.length" class="note">{{ contact.note }}</div>
  </div>
</template>

<script>
export default {
  name: 'ContactItem',
  props: {
    id: Number,
    name: {
      type: String,
      default: ''
    },
    patronicName: {
      type: String,
      default: ''
    },
    surName: {
      type: String,
      default: ''
    },
    room: {
      type: String,
      default: ''
    },
    phone: {
      type: String,
      default: ''
    },
    email: {
      type: String,
      default: ''
    },
    positions: {
      type: Array,
      default: function() {
        return [];
      }
    },
    contact: Object
  },
  computed: {
    fullName({ name, patronicName, surName } = this.$props) {
      const length = name.length && patronicName.length && surName.length;
      return length ? `${name} ${patronicName} ${surName}` : false;
    }
  }
};
</script>

<style lang="stylus" scoped>
.position
  margin-bottom: 1rem
  h5::after
    content: ""
    display: block
    width: 60px
    margin-top: 6px
    border-bottom: 3px solid #222
.name
  margin-bottom: 2rem
  h3
    color: #1461ff
    font-weight: 300
</style>
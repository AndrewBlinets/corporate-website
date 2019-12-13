<template>
  <div class="category-contacts">
    <div class="category-name">
      <h2>{{ name }}</h2>
    </div>
    <div class="row">
      <contact-item 
        v-for="user in users"
        v-bind="user"
        :key="user.id"
      />
    </div>
  </div>
</template>

<script>
import ContactItem from './ContactItem';

export default {
  name: 'CategoryContacts',
  props: {
    id: {
      type: Number
    },
    name: {
      type: String
    },
    users: {
      type: Array
    }
  },
  components: {
    ContactItem
  }
};
</script>

<style lang="stylus" scoped>
.category-contacts
  margin-bottom: 2rem
  .category-name
    margin-bottom: 2rem
    h2
      font-weight: 200
</style>
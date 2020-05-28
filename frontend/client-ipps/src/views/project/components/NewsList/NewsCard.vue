<template>
  <v-card>
    <v-card-title class="subtitle-1 font-weight-bold">{{ title }}</v-card-title>

    <v-card-subtitle class="caption">{{ date | formatDate }}</v-card-subtitle>

    <v-card-text>
      <p>{{ entrySpeech }}</p>
      <v-expand-transition>
        <div v-if="showContent">
          {{ content }}
        </div>
      </v-expand-transition>
    </v-card-text>

    <v-card-actions>
      <v-btn color="primary" text x-small @click="toogleContent">
        {{ labelBtn }}
      </v-btn>

      <v-spacer></v-spacer>

      <v-icon v-if="read" color="primary">mdi-check-all</v-icon>
      <v-icon v-else>mdi-check</v-icon>
    </v-card-actions>
  </v-card>
</template>

<script>
export default {
  name: 'NewsCard',
  props: {
    id: Number,
    title: {
      type: String,
      default: 'Title Card',
    },
    date: {
      type: String,
      default: '2019-11-20T07:27:52.000+0000',
    },
    entrySpeech: {
      type: String,
      default:
        'Lorem ipsum dolor sit amet consectetur adipisicing elit. Illum illo quam id impedit dolore facilis voluptate, iusto sit, consectetur ipsam, labore voluptatibus expedita ea nihil tenetur nisi ab harum officiis.',
    },
    content: String,
  },
  data: () => ({
    showContent: false,
    read: false,
  }),
  computed: {
    labelBtn() {
      return this.showContent ? 'Свернуть' : 'Подробнее';
    },
  },
  methods: {
    toogleContent() {
      this.showContent = !this.showContent;
      if (!this.read) this.read = true;
    },
  },
};
</script>

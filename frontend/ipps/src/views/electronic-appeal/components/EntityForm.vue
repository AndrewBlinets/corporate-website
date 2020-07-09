<template>
  <div class="v-list">
    <div class="v-list-item">
      <div class="v-list-item__content">
        <div class="v-list-item__subtitle">
          ПОЛНОЕ НАИМЕНОВАНИЕ ЮРИДИЧЕСКОГО ЛИЦА <span class="red--text">*</span>
        </div>
        <v-text-field
          v-model.trim="jurName"
          hide-details="auto"
          :error-messages="jurNameErrors"
          @input="$v.jurName.$touch()"
          @blur="$v.jurName.$touch()"
        ></v-text-field>
      </div>
    </div>

    <div class="v-list-item">
      <div class="v-list-item__content">
        <div class="v-list-item__subtitle">
          ПОЧТОВЫЙ ИНДЕКС ЮРИДИЧЕСКОГО ЛИЦА <span class="red--text">*</span>
        </div>
        <v-text-field
          v-model.number.trim="postcode"
          hide-details="auto"
          :error-messages="postcodeErrors"
          @input="$v.postcode.$touch()"
          @blur="$v.postcode.$touch()"
        ></v-text-field>
      </div>
    </div>

    <div class="v-list-item">
      <div class="v-list-item__content">
        <div class="v-list-item__subtitle">
          ПОЧТОВЫЙ АДРЕС ЮРИДИЧЕСКОГО ЛИЦА <span class="red--text">*</span>
        </div>
        <v-text-field
          v-model.trim="address"
          hide-details="auto"
          :error-messages="addressErrors"
          @input="$v.address.$touch()"
          @blur="$v.address.$touch()"
        ></v-text-field>
      </div>
    </div>

    <div class="v-list-item">
      <div class="v-list-item__content">
        <div class="v-list-item__subtitle">
          АДРЕС ЭЛЕКТРОННОЙ ПОЧТЫ <span class="red--text">*</span>
        </div>
        <v-text-field
          v-model.trim="email"
          hide-details="auto"
          :error-messages="emailErrors"
          @input="$v.email.$touch()"
          @blur="$v.email.$touch()"
        ></v-text-field>
      </div>
    </div>

    <div class="v-list-item">
      <div class="v-list-item__content">
        <div class="v-list-item__subtitle">
          ФАМИЛИЯ, СОБСТВЕННОЕ ИМЯ, ОТЧЕСТВО <span class="red--text">*</span>
        </div>
        <v-text-field
          v-model.trim="name"
          hide-details="auto"
          :error-messages="nameErrors"
          @input="$v.name.$touch()"
          @blur="$v.name.$touch()"
        ></v-text-field>
      </div>
    </div>

    <div class="v-list-item">
      <div class="v-list-item__content">
        <div class="v-list-item__subtitle">
          ТЕКСТ ОБРАЩЕНИЯ <span class="red--text">*</span>
        </div>
        <v-textareas
          v-model.trim="textAppeal"
          hide-details="auto"
          counter
          :error-messages="textAppealErrors"
          @input="$v.textAppeal.$touch()"
          @blur="$v.textAppeal.$touch()"
        ></v-textareas>
      </div>
    </div>

    <div class="v-list-item">
      <div class="v-list-item__content">
        <div class="v-list-item__subtitle">
          ПРИКРЕПИТЬ ФАЙЛ
        </div>
        <v-file-input v-model="file" hide-details="auto"></v-file-input>
      </div>
    </div>

    <div class="v-list-item">
      <div class="v-list-item__content">
        <div class="button-container">
          <div class="button-item">
            <button class="btn btn-main" @click="send">
              Отправить
            </button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { formMixin } from '../form.mixin';

export default {
  name: 'EntityForm',
  mixins: [formMixin],
  data: () => ({
    type: 2,
    jurName: '',
    postcode: null,
  }),
  computed: {
    jurNameErrors() {
      const errors = [];

      if (!this.$v.jurName.$dirty) return errors;
      !this.$v.jurName.required && errors.push('Поле обязательно');

      return errors;
    },
    postcodeErrors() {
      const errors = [];

      if (!this.$v.postcode.$dirty) return errors;
      !this.$v.postcode.required && errors.push('Поле обязательно');

      return errors;
    },
  },
};
</script>

<style lang="stylus" scoped>
.button-item {
  width: 100%;

  .btn {
    width: 100%;
  }
}
</style>

import { sendAppeal } from '@/api/appeal';

import VTextField from '@/components/UI/VTextField';
import VTextareas from '@/components/UI/VTextareas';
import VFileInput from '@/components/UI/VFileInput';

import { validationMixin } from 'vuelidate';
import { required, maxLength } from 'vuelidate/lib/validators';

export const formMixin = {
  components: {
    VTextField,
    VTextareas,
    VFileInput,
  },

  mixins: [validationMixin],
  validations: {
    jurName: { required },
    postcode: { required },
    name: { required },
    address: { required },
    email: { required },
    textAppeal: { required, maxLength: maxLength(2000) },
  },

  data: () => ({
    name: '',
    address: '',
    email: '',
    textAppeal: '',
    file: null,
  }),

  computed: {
    nameErrors() {
      const errors = [];

      if (!this.$v.name.$dirty) return errors;
      !this.$v.name.required && errors.push('Поле обязательно');

      return errors;
    },
    addressErrors() {
      const errors = [];

      if (!this.$v.address.$dirty) return errors;
      !this.$v.address.required && errors.push('Поле обязательно');

      return errors;
    },
    emailErrors() {
      const errors = [];

      if (!this.$v.email.$dirty) return errors;
      !this.$v.email.required && errors.push('Поле обязательно');

      return errors;
    },
    textAppealErrors() {
      const errors = [];

      if (!this.$v.textAppeal.$dirty) return errors;
      !this.$v.textAppeal.required && errors.push('Поле обязательно');
      !this.$v.textAppeal.maxLength &&
        errors.push(
          `Максимум ${this.$v.textAppeal.$params.maxLength.max} символов`,
        );

      return errors;
    },
  },

  methods: {
    send() {
      let formData = new FormData();

      for (const [key, value] of Object.entries(this.$data)) {
        formData.append(key, value);
      }

      sendAppeal(formData).then(() => {
        // eslint-disable-next-line no-console
        console.log('OK');
      });
    },
  },
};

<template>
  <div class="shadow-container">
    <div class="title">
      <h1>Восстановление пароля</h1>
    </div>
    <el-form
      label-position="top"
      :model="form"
      ref="form"
      :rules="rules"
    >
      <el-form-item
        label="E-mail"
        prop="email"
      >
        <el-input
          v-model="form.email"
          name="email"
          ref="email"
          tabindex="1"
          type="text"          
        />
      </el-form-item>

      <el-form-item>
        <el-button
          class="full-width margin-top"
          type="primary"
          @click="sendEmail"
        >Отправить</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  name: 'Reminder',
  data() {
    const validateEmail = (rule, value, callback) => {
      if (!value.length) {
        callback(new Error('Введите email адрес'));
      } else {
        callback();
      }
    };

    return {
      form: {
        email: ''
      },
      rules: {
        email: [
          { validator: validateEmail, trigger: 'blur' },
          { type: 'email', message: 'Введите корректный email адрес', trigger: ['blur', 'change']}
        ],
      }
    };
  },
  mounted() {
    this.$refs.email.focus();
  },
  methods: {
    sendEmail() {
      /* eslint-disable no-console */
      this.$refs.form.validate((valid) => {
        if (valid) {
          const { email } = this.form;
          console.log({ email });
        } else {
          console.log('error submit!!');
          return false;
        }
      });
    }
  }  
};
</script>
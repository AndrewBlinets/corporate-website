<template>
  <div class="shadow-container">
    <div class="title">
      <h1>Вход</h1>
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

      <el-tooltip v-model="capsTooltip" content="Caps Lock включён" manual>
        <el-form-item
          label="Пароль"
          prop="password"
        >
          <el-input
            v-model="form.password"
            name="password"
            type="password"
            tabindex="2"
            @keyup.native="checkCapslock"
            @blur="capsTooltip = false"
            @keyup.enter.native="handleLogin"
            show-password
          >            
          </el-input>
        </el-form-item>
      </el-tooltip>

      <el-form-item>
        <el-button
          class="full-width margin-top"
          type="primary"
          @click="handleLogin"
        >Войти</el-button>
      </el-form-item>

      <el-form-item>
        <router-link
          :to="{ name: 'reminder'}"
          tag="el-link"
        >Забыли пароль?</router-link>
      </el-form-item>

      <el-form-item
        v-if="false"
        label="Или войдите с помощью других сервисов"
      >
        <el-button type="info" circle></el-button>
        <el-button type="info" circle></el-button>
        <el-button type="info" circle></el-button>
        <el-button type="info" circle></el-button>
        <el-button type="info" circle></el-button>
      </el-form-item>
    </el-form>    
  </div>
</template>

<script>
export default {
  name: 'Login',
  data() {
    const validateEmail = (rule, value, callback) => {
      if (!value.length) {
        callback(new Error('Введите email адрес'));
      } else {
        callback();
      }
    };
    const validatePassword = (rule, value, callback) => {
      if (!value.length) {
        callback(new Error('Введите пароль'));
      } else {
        callback();
      }
    };

    return {
      form: {
        email: '',
        password: ''
      },
      rules: {
        email: [
          { validator: validateEmail, trigger: 'blur' },
          { type: 'email', message: 'Введите корректный email адрес', trigger: ['blur', 'change']}
        ],
        password: [
          { validator: validatePassword,  trigger: 'blur' }
        ]
      },
      capsTooltip: false
    };
  },
  mounted() {
    this.$refs.email.focus();
  },
  methods: {
    checkCapslock(event) {
      this.capsTooltip = event.getModifierState('CapsLock');
    },
    handleLogin() {
      /* eslint-disable no-console */
      this.$refs.form.validate((valid) => {
        if (valid) {
          const { email, password } = this.form;
          console.log({ email, password });
        } else {
          console.log('error submit!!');
          return false;
        }
      });
    }
  }
};
</script>

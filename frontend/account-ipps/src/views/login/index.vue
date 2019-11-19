<template>
  <div class="shadow-container">
    <div class="title">
      <h1>Вход</h1>
    </div>    
    <el-form label-position="top" :model="form">
      <el-form-item label="E-mail">
        <el-input v-model="form.email"></el-input>
      </el-form-item>
      <el-form-item label="Пароль">
        <el-input v-model="form.password"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button class="full-width margin-top" type="primary">Войти</el-button>
      </el-form-item>
      <el-form-item>
        <el-link
          href="https://element.eleme.io"
          target="_blank"
          :underline="false"
        >Забыли пароль?</el-link>
      </el-form-item>
      <el-form-item label="Или войдите с помощью других сервисов">
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
    return {
      form: {
        email: '',
        password: ''
      },
    };
  }
};
</script>

<style lang="stylus" scoped>
.shadow-container
  padding: 40px
  box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1)
  background-color: #fff

.title
  margin-bottom: 40px
  h1
    font-size: 22px

.full-width
    width: 100%

.margin-top
  margin-top: 20px
</style>
<template>
  <div class="create-aricle-container">
    <div class="name">
      <h1>Новость</h1>
    </div>
    <div class="form-container">
      <el-form ref="form" :model="form" label-width="190px">
        <el-form-item label="Изображение заголовка">
          <upload-file />
        </el-form-item>
        <language-tabs :languageVersions="form.languageVersions" />
        <el-form-item label="Дата публикации">
          <el-col :span="8">
            <el-date-picker type="date" placeholder="Выберите дату" v-model="form.dpublic" />
          </el-col>
          <el-col :span="8">
            <el-time-picker placeholder="Выберите время" v-model="form.dpublic" />
          </el-col>
        </el-form-item>
        <el-form-item>
          <el-button type="success" @click="save">Сохранить</el-button>
          <el-button @click="save">Сохранить как черновик</el-button>
          <el-button @click="cansel">Отмена</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
import UploadFile from '@/components/UploadFile';
import LanguageTabs from './components/LanguageTabs';

export default {
  name: 'Article',
  components: {
    UploadFile,
    LanguageTabs
  },
  data() {
    return {
      form: {
        languageVersions: [
          {
            codeLanguage: 'ru',
            title: 'Test',
            shortTitle: '',
            entrySpeech: '',
            content: ''
          },
          {
            codeLanguage: 'by',
            title: '',
            shortTitle: '',
            entrySpeech: '',
            content: ''
          },
          {
            codeLanguage: 'en',
            title: '',
            shortTitle: '',
            entrySpeech: '',
            content: ''
          }
        ],
        dpublic: ''
      },
      dialogImageUrl: '',
      dialogVisible: false,
      disabled: false
    };
  },
  methods: {
    save() {
      // eslint-disable-next-line no-console
      console.log('submit!');
    },
    cansel() {
      // eslint-disable-next-line no-console
      console.log('cansel!');
    }
  }
};
</script>

<style lang="stylus" scoped>
.create-aricle-container
  display: flex
  flex-direction: column
  width: 1000px
  padding: 20px
  background-color: #fff
  .name
    margin-bottom: 30px

.el-upload.el-upload--picture-card
  width: 100%
  height: 150px
</style>
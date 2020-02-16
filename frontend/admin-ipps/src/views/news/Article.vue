<template>
  <div class="create-aricle-container">
    <div class="name">
      <h1>Новость</h1>
    </div>
    <div class="form-container mb-2">
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
      </el-form>
    </div>
    <el-row type="flex" justify="space-between">
      <el-col :span="12" >
        <el-button
          type="success"
          @click="save"
        >Сохранить</el-button>
        <el-button
          type="success"
          plain
          @click="save"
        >Сохранить как черновик</el-button>
        <el-button
          type="danger"
          plain
          @click="save"
        >Удалить</el-button>
      </el-col>
      <el-col :span="3" align="right">
        <el-button
          type="primary"
          @click="$router.push({ path: '/news' })"
        >Отмена</el-button>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import store from '@/store';
import { mapActions } from 'vuex';
import UploadFile from '@/components/UploadFile';
import LanguageTabs from './components/LanguageTabs';

export default {
  name: 'Article',
  components: {
    UploadFile,
    LanguageTabs
  },
  props: {
    id: {
      type: Number,
      default: null
    }
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
  beforeRouteEnter(to, from, next) {
    const id = to.params.id;

    if (id) {
      store.dispatch('news/getNews', id).then(() => {
        next();
      });
    } else {
      next();
    }
  },
  methods: {
    ...mapActions({
      getNews: 'news/getNews'
    }),
    save() {
      // eslint-disable-next-line no-console
      console.log('submit!');
    },
    delete() {
      this.$confirm('Вы точно хотите удалить?', {
          confirmButtonText: 'Подтвердить',
          cancelButtonText: 'Отменить',
          type: 'warning'
        }).then(() => {
          this.$message({
            type: 'success',
            message: 'Запись удалина'
          });
          this.$router.push({ path: '/news' });
        }).catch(() => {
          this.$message({
            type: 'info',
            message: 'Удаление отменино'
          });
        });
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
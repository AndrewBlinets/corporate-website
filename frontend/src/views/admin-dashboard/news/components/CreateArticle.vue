<template>
  <div class="create-aricle-container">
    <div class="name">
      <h1>Новая новость</h1>
    </div>
    <div class="form-container">
      <el-form ref="form" :model="form" label-width="189px">
        <el-form-item label="Заголовок">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="Краткий заголовок">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="Изображение заголовка">
          <el-upload
            action="#"
            list-type="picture-card"
            :auto-upload="false"
          >
            <i slot="default" class="el-icon-plus"></i>
            <div slot="file" slot-scope="{file}">
              <img
                class="el-upload-list__item-thumbnail"
                :src="file.url" alt=""
              >
                <span class="el-upload-list__item-actions">
                  <span
                    class="el-upload-list__item-preview"
                    @click="handlePictureCardPreview(file)"
                  >
                    <i class="el-icon-zoom-in"></i>
                  </span>
                  <span
                    v-if="!disabled"
                    class="el-upload-list__item-delete"
                    @click="handleDownload(file)"
                  >
                    <i class="el-icon-download"></i>
                  </span>
                  <span
                    v-if="!disabled"
                    class="el-upload-list__item-delete"
                    @click="handleRemove(file)"
                  >
                    <i class="el-icon-delete"></i>
                  </span>
                </span>
              </div>
          </el-upload>
          <el-dialog :visible.sync="dialogVisible">
            <img width="100%" :src="dialogImageUrl" alt="">
          </el-dialog>
        </el-form-item>
        <el-form-item label="Вступительная речь">
          <el-input type="textarea" v-model="form.desc"></el-input>
        </el-form-item>        
        <el-form-item label="Содержание">
          <el-input v-model="form.name"></el-input>
        </el-form-item>
        <el-form-item label="Дата публикации">
          <el-col :span="6">
            <el-date-picker type="date" placeholder="Выберите дату" v-model="form.date1"></el-date-picker>
          </el-col>
          <el-col class="line" :span="1">-</el-col>
          <el-col :span="6">
            <el-time-picker placeholder="Выберите время" v-model="form.date2"></el-time-picker>
          </el-col>
        </el-form-item>
        <el-form-item>
          <el-button type="success" @click="onSubmit">Опубликовать</el-button>
          <el-button>Сохранить как черновик</el-button>
          <el-button>Отмена</el-button>
        </el-form-item>
      </el-form>
    </div>
  </div>
</template>

<script>
export default {
  name: 'CreateArticle',
  data() {
    return {
      form: {
        name: '',
        region: '',
        date1: '',
        date2: '',
        delivery: false,
        type: [],
        resource: '',
        desc: ''
      },
      dialogImageUrl: '',
      dialogVisible: false,
      disabled: false
    }
  },
  methods: {
    onSubmit() {
      console.log('submit!');
    },
    handleRemove(file) {
      console.log(file);
    },
    handlePictureCardPreview(file) {
      this.dialogImageUrl = file.url;
      this.dialogVisible = true;
    },
    handleDownload(file) {
      console.log(file);
    }
  }
}
</script>

<style lang="stylus" scoped>
.create-aricle-container
  display: flex
  flex-direction: column
  height: 100%
  padding: 20px
  background-color: #fff
  overflow: auto
  .name
    margin-bottom: 30px

.el-upload.el-upload--picture-card
  width: 100%
  height: 150px
</style>
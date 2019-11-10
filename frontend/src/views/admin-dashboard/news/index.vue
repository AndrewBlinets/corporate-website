<template>
  <div class="news-container">
    <div class="name">
      <h1>Новости</h1>
    </div>
    <div class="button-container">
      <el-button
        type="success"
        icon="el-icon-plus"
        @click="toCreateArticle"
      >Создать</el-button>
    </div>    
    <!-- <text-editor /> -->
    <div class="table-container">
      <el-table
        ref="multipleTable"
        :data="tableData"
        border>
        <el-table-column
          prop="id"
          label="Id"
          width="50">
        </el-table-column>
        <el-table-column
          prop="title"
          label="Название"
          width="180">
        </el-table-column>
        <el-table-column
          prop="dti"
          label="Дата создания"
          width="180">
        </el-table-column>
        <el-table-column
          prop="dpublic"
          label="Дата публикации">
        </el-table-column>
        <el-table-column
          prop="rstatus"
          label="Статус">
        </el-table-column>
        <el-table-column
          fixed="right"
          label="Operations"
          width="230"
        >
          <template slot-scope="scope">
            <el-tooltip effect="dark" content="Просмотреть" placement="top">
              <el-button size="medium" icon="el-icon-view" />
            </el-tooltip>
            <el-tooltip effect="dark" content="Редактировать" placement="top">
              <el-button size="medium" icon="el-icon-edit" />
            </el-tooltip>
            <el-tooltip effect="dark" content="Удалить" placement="top">
              <el-button
                @click.native.prevent="deleteRow(scope.$index, tableData)"
                size="medium"
                icon="el-icon-delete"
                type="danger" />
              </el-tooltip>
          </template>
        </el-table-column>
      </el-table>
    </div>    
  </div>  
</template>

<script>
import TextEditor from '@/components/TextEditor'

export default {
  name: 'News',
  components: {
    TextEditor
  },
  data() {
    return {
      tableData: [{
        id: 1,
        dti: '2016-05-03',
        dpublic: '2016-05-03',
        title: 'Tom',
        rstatus: 'T'
      }, {
        id: 2,
        dti: '2016-05-03',
        dpublic: '2016-05-03',
        title: 'Tom',
        rstatus: 'T'
      }, {
        id: 3,
        dti: '2016-05-03',
        dpublic: '2016-05-03',
        title: 'Tom',
        rstatus: 'T'
      }, {
        id: 4,
        dti: '2016-05-03',
        dpublic: '2016-05-03',
        title: 'Tom',
        rstatus: 'T'
      }, {
        id: 5,
        dti: '2016-05-03',
        dpublic: '2016-05-03',
        title: 'Tom',
        rstatus: 'T'
      }, {
        id: 6,
        dti: '2016-05-03',
        dpublic: '2016-05-03',
        title: 'Tom',
        rstatus: 'T'
      }, {
        id: 7,
        dti: '2016-05-03',
        dpublic: '2016-05-03',
        title: 'Tom',
        rstatus: 'T'
      }],
    }
  },
  methods: {
    toCreateArticle() {
      this.$router.push({ path: 'create'});
    },
    deleteRow(index, rows) {
      this.$confirm('Вы точно хотите удалить?', {
          confirmButtonText: 'Подтвердить',
          cancelButtonText: 'Отменить',
          type: 'warning'
        }).then(() => {
          rows.splice(index, 1);
          this.$message({
            type: 'success',
            message: 'Запись удалина'
          });
        }).catch(() => {
          this.$message({
            type: 'info',
            message: 'Удаление отменино'
          });          
        });      
    }
  },
}
</script>

<style lang="stylus" scoped>
.news-container
  display: flex
  flex-direction: column
  height: 100%
  padding: 20px
  background-color: #fff
  .name
  .button-container
    margin-bottom: 30px
  .table-container
  .el-table
    height: 100%
    width: 100%
</style>
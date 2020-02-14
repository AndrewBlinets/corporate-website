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
    <div class="table-container">
      <el-table
        ref="multipleTable"
        :data="news"
        :row-class-name="tableRowClassName"
        border
      >
        <el-table-column
          type="index"
        />
        <el-table-column
          prop="id"
          label="Id"
          width="50"
        />
        <el-table-column
          prop="shortTitle"
          label="Название"
        />
        <el-table-column
          label="Дата создания"
          width="140"
        >
          <template slot-scope="scope">{{ scope.row.dti | formatDate}}</template>
        </el-table-column>
        <el-table-column
          label="Дата публикации"
          width="140"
        >
          <template slot-scope="scope">{{ scope.row.datePublic | formatDate}}</template>
        </el-table-column>
        <el-table-column
          prop="status"
          label="Статус"
          width="140"
        />
        <el-table-column
          fixed="right"
          label="Операции"
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
                @click.native.prevent="deleteRow(scope, tableData)"
                size="medium"
                icon="el-icon-delete"
                type="danger"
              />
            </el-tooltip>
          </template>
        </el-table-column>
      </el-table>
    </div>    
  </div>  
</template>

<script>
import { mapGetters } from 'vuex';

export default {
  name: 'News',
  computed: {
    ...mapGetters([
      'news'
    ])
  },
  created() {
    this.$store.dispatch('news/getNews');
  },
  methods: {
    toCreateArticle() {
      this.$router.push({ path: 'create'});
    },
    tableRowClassName({ row }) {
      if (row.status === 'Опубликовано') {
        return 'success-row';
      } else if (row.status === 'черновик') {
        return 'warning-row';
      } else if (row.status === 'Удалён') {
        return 'error-row';
      }
      return '';
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
};
</script>

<style lang="stylus" scoped>
.news-container
  display: flex
  flex-direction: column
  padding: 20px
  background-color: #fff
  .name
  .button-container
    margin-bottom: 30px
 
.el-table__row
  .warning-row
    background: oldlace
  .success-row
    background: #f0f9eb
</style>
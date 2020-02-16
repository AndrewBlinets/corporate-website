<template>
  <div class="page-container">
    <div class="title">
      <h1>Новости</h1>
    </div>
    <div class="button-container">
      <el-button
        type="success"
        icon="el-icon-plus"
        @click="$router.push({ name: 'create-news' })"
      >Создать</el-button>
    </div>
    <div class="table-container mb-1">
      <el-table
        ref="multipleTable"
        :data="newsList"
        :row-class-name="tableRowClassName"
        border
      >
        <el-table-column
          type="index"
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
            <!-- <el-button size="medium" icon="el-icon-view" /> -->
            <el-button
              @click="$router.push({ name: 'news-id', params: { id: scope.row.id } })"
              size="medium"
              icon="el-icon-edit"
            />
            <el-button
              @click="deleteRow(scope.row.id)"
              size="medium"
              icon="el-icon-delete"
              type="danger"
            />
          </template>
        </el-table-column>
      </el-table>
    </div>

    <el-pagination
      @size-change="tableSizeChange"
      @current-change="tableCurrentChange"
      :current-page.sync="page"
      :page-sizes="[10, 20, 50, 100]"
      :page-size="size"
      layout="total, sizes, prev, pager, next, jumper"
      :total="total">
    </el-pagination>

  </div>
</template>

<script>
import store from '@/store';
import { mapState, mapGetters, mapActions } from 'vuex';

export default {
  name: 'News',
  computed: {
    ...mapState({
      size: state => state.news.params.size
    }),
    ...mapGetters({
      newsList: 'news/newsListData',
      total: 'news/newsListTotal'
    }),
    page: {
      get: function() {
        return store.state.news.params.page + 1;
      },
      set: function(value) {
        store.commit('news/ADD_PARAMS', { page: value - 1});
      }
    }
  },
  beforeRouteEnter(to, from, next) {
    store.dispatch('news/getNewsList').then(() => {
      next();
    });
  },
  methods: {
    ...mapActions({
      deleteNews: 'news/deleteNews'
    }),
    tableSizeChange(value) {
      store.dispatch('news/getNewsList', { size: value });
    },
    tableCurrentChange(value) {
      store.dispatch('news/getNewsList', { page: value - 1 });
    },
    tableRowClassName({ row }) {
      if (row.status === 'Опубликовано') {
        return 'success-row';
      } else if (row.status === 'Черновик') {
        return 'warning-row';
      } else if (row.status === 'Удалён') {
        return 'error-row';
      }
      return '';
    },
    deleteRow(id) {
      this.$confirm('Вы точно хотите удалить?', {
          confirmButtonText: 'Подтвердить',
          cancelButtonText: 'Отменить',
          type: 'warning'
        }).then(() => {
          this.deleteNews(id).then(() => {
            this.$message({
              type: 'success',
              message: 'Запись удалина'
            });
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

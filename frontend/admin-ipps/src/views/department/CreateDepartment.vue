<template>
  <el-row>
    <el-col :span="24">
      <el-input v-model="name" placeholder="Название" />
    </el-col>
    <el-col :span="24">
      <el-input v-model="code" placeholder="Код" />
    </el-col>
    <el-col :span="12">
      <div class="button-container">
        <el-button
          type="success"
          icon="el-icon-plus"
          @click="createDepartment({ name, code })"
        >Создать</el-button>
        <el-button
          type="default"
          @click="clean"
        >Очистить</el-button>
        <el-button
          type="default"
          @click="$emit('close')"
        >Закрыть</el-button>
      </div>
    </el-col>
  </el-row>
</template>

<script>
import { mapActions } from 'vuex';

export default {
  name: 'CreateDepartment',
  data: () => ({
    name: '',
    code: ''
  }),
  methods: {
    ...mapActions({
      createDepartment: 'department/createDepartment'
    }),
    clean() {
      this.name = '';
      this.code = '';
    }
  }
};
</script>
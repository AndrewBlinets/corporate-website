<template>
  <div>
    <el-upload
      action="#"
      :http-request="uploadFileServer"
      :file-list="fileList"
      list-type="picture-card"
      :auto-upload="true"
      :limit="1"
    >
      <i slot="default" class="el-icon-plus" />
      <div slot="file" :slot-scope="{ file }" class="file">
        <img class="el-upload-list__item-thumbnail" :src="urlFile" alt="" />
        <span class="el-upload-list__item-actions">
          <span
            class="el-upload-list__item-preview"
            @click="handlePictureCardPreview(file)"
          >
            <i class="el-icon-zoom-in" />
          </span>
          <!-- <span
            v-if="!disabled"
            class="el-upload-list__item-delete"
            @click="handleDownload(file)"
          >
            <i class="el-icon-download" />
          </span> -->
          <span
            v-if="!disabled"
            class="el-upload-list__item-delete"
            @click="handleRemove()"
          >
            <i class="el-icon-delete" />
          </span>
        </span>
      </div>
    </el-upload>
    <el-dialog :visible.sync="dialogVisible">
      <img width="100%" :src="dialogImageUrl" alt="" />
    </el-dialog>
  </div>
</template>

<script>
import { mapState, mapGetters, mapActions } from 'vuex';

export default {
  name: 'UploadFile',
  props: {
    value: {
      type: Number,
    },
  },
  data() {
    return {
      dialogImageUrl: '',
      dialogVisible: false,
      disabled: false,
    };
  },
  computed: {
    ...mapState({
      urlId: state => state.file.fileId,
    }),
    ...mapGetters({
      urlFile: 'file/urlFile',
      fileObject: 'file/fileObject',
    }),
    fileList: {
      get: function () {
        return this.fileObject;
      },
      set: function (value) {
        this.$store.commit('file/SET_FILE_ID', value);
        this.$emit('input', value);
      },
    },
  },
  created() {
    this.$store.commit('file/SET_FILE_ID', this.value);
  },
  destroyed() {
    this.resetFile();
  },
  methods: {
    ...mapActions({
      uploadFile: 'file/uploadFileServer',
      resetFile: 'file/resetFile',
    }),
    uploadFileServer(value) {
      const { file } = value;
      this.uploadFile(file).then(id => {
        this.$emit('input', id);
      });
    },
    handleRemove() {
      this.fileList = null;
    },
    handlePictureCardPreview(file) {
      this.dialogImageUrl = file.url;
      this.dialogVisible = true;
    },
  },
};
</script>

<style lang="stylus" scoped>
.file {
  width: 100%;
  height: 100%;

  .el-upload-list__item-thumbnail {
    object-fit: cover;
    object-position: center center;
  }
}
</style>

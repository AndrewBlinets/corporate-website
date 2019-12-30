<template>
  <div>
    <ckeditor
      :editor="editor"
      v-model="editorData"
      :config="editorConfig"
      :disabled="editorDisabled"
    />
    <div>
      <code>{{ editorData }}</code>
    </div>
  </div>
</template>

<script>
import ClassicEditor from '@ckeditor/ckeditor5-editor-classic/src/classiceditor';
import { EditorConfig } from './editorConfig.js';

export default {
  name: 'Editor',
  data: () => ({
    editor: ClassicEditor,
    editorData: `<p>Content</p>`,
    editorConfig: EditorConfig,
    editorDisabled: false
  })
};
</script>
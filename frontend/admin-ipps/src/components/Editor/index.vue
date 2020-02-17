<template>
  <div>
    <ckeditor
      :value="content"
      @input="$emit('input', $event)"
      :editor="editor"
      :config="editorConfig"
      :disabled="editorDisabled"
    />
  </div>
</template>

<script>
import ClassicEditor from '@ckeditor/ckeditor5-editor-classic/src/classiceditor';
import { EditorConfig } from './editorConfig.js';

export default {
  name: 'Editor',
  props: {
    content: {
      type: String,
      default: ''
    }
  },
  data: () => ({
    editor: ClassicEditor,
    editorConfig: EditorConfig,
    editorDisabled: false
  }),
};
</script>
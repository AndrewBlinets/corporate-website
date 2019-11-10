<template>
  <div class="text-editor-container">
    <editor-menu-bar :editor="editor" v-slot="{ commands, isActive }">
      <button :class="{ 'is-active': isActive.bold() }" @click="commands.bold">
        Bold
      </button>
    </editor-menu-bar>
    <editor-content :editor="editor" />
  </div>
</template>

<script>
import { Editor, EditorContent, EditorMenuBar } from 'tiptap'
import { Bold } from 'tiptap-extensions'

export default {
  name: 'TextEditor',
  components: {
    EditorMenuBar,
    EditorContent
  },
  data() {
    return {
      editor: new Editor({
        content: '<p>Контент</p>',
        extensions: [
          new Bold(),
        ],
      })
    };
  },
  beforeDestroy() {
    this.editor.destroy();
  }
}
</script>
<template>
  <div class="text-editor-container">
    <editor-menu-bar :editor="editor" v-slot="{ commands, isActive }">
      <div>        
        <el-button
          @click="commands.undo"
          size="small"
          icon="fas fa-undo"
          type="info"
          plain />
        <el-button
          @click="commands.redo"
          size="small"
          icon="fas fa-redo"
          type="info"
          plain />
        <el-button
          @click="commands.bold"
          size="small"
          icon="fas fa-bold"
          type="info"
          :plain="!isActive.bold()" />
        <el-button
          @click="commands.italic"
          size="small"
          icon="fas fa-italic"
          type="info"
          :plain="!isActive.italic()" />
        <el-button
          @click="commands.strike"
          size="small"
          icon="fas fa-strikethrough"
          type="info"
          :plain="!isActive.strike()" />
        <el-button
          @click="commands.underline"
          size="small"
          icon="fas fa-underline"
          type="info"
          :plain="!isActive.underline()" />
        <el-button
          @click="commands.code"
          size="small"
          icon="fas fa-code"
          type="info"
          :plain="!isActive.code()" />
        <el-button
          @click="commands.paragraph"
          size="small"
          icon="fas fa-paragraph"
          type="info"
          :plain="!isActive.paragraph()" />
        <el-button
          @click="commands.heading({ level: 2 })"
          size="small"
          icon="fas fa-heading"
          type="info"
          :plain="!isActive.heading({ level: 2 })" />
        <el-button
          @click="commands.bullet_list"
          size="small"
          icon="fas fa-list-ul"
          type="info"
          :plain="!isActive.bullet_list()" />
        <el-button
          @click="commands.ordered_list"
          size="small"
          icon="fas fa-list-ol"
          type="info"
          :plain="!isActive.ordered_list()" />
        <el-button
          @click="commands.blockquote"
          size="small"
          icon="fas fa-quote-right"
          type="info"
          :plain="!isActive.blockquote()" />
        <el-button
          @click="commands.code_block"
          size="small"
          icon="fas fa-file-code"
          type="info"
          :plain="!isActive.code_block()" />
             
      </div>
    </editor-menu-bar>
    <editor-content class="el-textarea__inner editor" :editor="editor" />
    <!-- <el-form-item label="Json">
      <pre><code v-html="json"></code></pre>
    </el-form-item>
    <el-form-item label="Html">
      <code>{{ html }}</code>
    </el-form-item> -->
  </div>
</template>

<script>
import { Editor, EditorContent, EditorMenuBar } from 'tiptap'
import {
  Blockquote,
  CodeBlock,
  HardBreak,
  Heading,
  OrderedList,
  BulletList,
  ListItem,
  TodoItem,
  TodoList,
  Bold,
  Code,
  Italic,
  Image,
  Link,
  Strike,
  Underline,
  History,
} from 'tiptap-extensions'

export default {
  name: 'TextEditor',
  components: {
    EditorContent,
    EditorMenuBar    
  },
  data() {
    return {
      editor: new Editor({
        content: '',
        extensions: [
          new Blockquote(),
          new CodeBlock(),
          new HardBreak(),
          new Heading({ levels: [1, 2, 3] }),
          new BulletList(),
          new OrderedList(),
          new ListItem(),
          new TodoItem(),
          new TodoList(),
          new Bold(),
          new Code(),
          new Italic(),
          new Image(),
          new Link(),
          new Strike(),
          new Underline(),
          new History(),
        ],
        onUpdate: ({ getJSON, getHTML }) => {
          this.json = getJSON();
          this.html = getHTML();
        },
      }),
      json: `{
        "type": "doc",
        "content": [
          {
            "type": "paragraph",
            "content": [
              {
                "type": "text",
                "text": "Контент "
              }
            ]
          }
        ]
        }`,
      html: '',
    };
  },
  mounted() {
    this.editor.setContent(JSON.parse(this.json), true);
    this.editor.focus();
  },
  beforeDestroy() {
    this.editor.destroy();
  }
}
</script>

<style lang="stylus">
.editor
  min-height: 300px
  max-width: 750px

.ProseMirror
  color: #222
  max-width: 730px
  p
    font-size: 16px
    line-height: 1.572
    margin-bottom: 20px
    img
      width: 720px
</style>
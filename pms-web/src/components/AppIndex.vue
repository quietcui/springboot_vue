// eslint-disable-next-line
const someVariable = 'some value';

/* eslint-disable */
// 此处是整个文件的代码，所有 ESLint 规则都将被忽略
const anotherVariable = 'another value';
// ...

/* eslint-enable */
// 从这里开始，文件的 ESLint 规则又会被启用

<template>
   <div class="container">
          <div class="header">
              <div class="logo">壁纸引擎</div>
              <div class="nav">
                  <a href="#">首页</a>
                  <a href="#">分类</a>
                  <a href="../登录页面/index.html"><img src="../assets/tou1.jpg" alt="" width="25"></a>
                  <a href="../登录页面/index.html">登录</a>
                  <a href="#">下载</a>
              </div>
          </div>
          <div class="search">
              <input type="text" placeholder="搜索壁纸...">
              <button>搜索</button>
          </div>
          <div class="label">
              最新 动漫 科技 风景
          </div>
          <div class="gallery">
              <img src="https://picsum.photos/300/200?random=1">
              <img src="https://picsum.photos/300/200?random=2">
              <img src="https://picsum.photos/300/200?random=3">
              <img src="https://picsum.photos/300/200?random=4">
              <img src="https://picsum.photos/300/200?random=5">
              <img src="https://picsum.photos/300/200?random=6">
              <img src="https://picsum.photos/300/200?random=7">
              <img src="https://picsum.photos/300/200?random=8">
              <img src="https://picsum.photos/300/200?random=9">
              <img src="https://picsum.photos/300/200?random=10">
              <img src="https://picsum.photos/300/200?random=11">
              <img src="https://picsum.photos/300/200?random=12">
              <img src="https://picsum.photos/300/200?random=13">
              <img src="https://picsum.photos/300/200?random=14">
              <img src="https://picsum.photos/300/200?random=15">
              <img src="https://picsum.photos/300/200?random=16">
          </div>
          <div class="footer">
              <p>© 2023 壁纸引擎. All rights reserved.</p>
          </div>
      </div>
</template>

<script>


export default {
  name: "AppIndex",
  components: {},
  data(){
    return{
      isCollapse:false,
      aside_width:'200px',
      icon:'el-icon-s-fold'
    }
  },
  methods:{
    doCollapse(){
      this.isCollapse = !this.isCollapse
      if(!this.isCollapse){
        //展开
        this.aside_width='200px',
        this.icon='el-icon-s-fold'
      }else{
        //收起
        this.aside_width='65px',
        this.icon='el-icon-s-unfold'
      }
    }
  }
}
</script>

<style>
 body {
             background-color: #f0f0f0;
             font-family: Arial, sans-serif;
         }
         .container {
             width: 80%;
             margin: 0 auto;
         }
         .header {
             display: flex;
             align-items: center;
             justify-content: space-between;
             padding: 20px;
         }
         .logo {
             font-size: 32px;
             font-weight: bold;
             color: #333333;
         }
         .nav {
             display: flex;
             gap: 20px;
         }
         .nav a {
             text-decoration: none;
             color: #333333;
             font-size: 16px;
         }
         .nav a:hover {
             color: #0099ff;
         }
         .search {
             display: flex;
             align-items: center;
             gap: 10px;
             margin-top: 20px;
         }
         .search input {
             width: 60%;
             height: 40px;
             border: 1px solid #cccccc;
             border-radius: 20px;
             padding: 10px;
             font-size: 16px;
         }
         .search button {
             width: 100px;
             height: 40px;
             border: none;
             border-radius: 20px;
             background-color: #0099ff;
             color: white;
             font-size: 16px;
         }
         .search button:hover {
             background-color: #0066cc;
         }
         .label {
             margin: 0 auto;
             font-weight:600;
             font-size: 20px;
         }
         .gallery {
             display: grid;
             grid-template-columns: repeat(4, 1fr);
             grid-gap: 20px;
             margin-top: 20px;
         }
         .gallery img {
             width: 100%;
             height: 200px;
             object-fit: cover;
         }
         .gallery img:hover {
             opacity: 0.8;
         }
         .footer {
             display: flex;
             align-items: center;
             justify-content: center;
             padding: 20px;
         }
         .footer p {
             font-size: 14px;
             color: #999999;
         }
</style>
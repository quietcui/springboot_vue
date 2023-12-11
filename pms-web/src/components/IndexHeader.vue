<template>
  <div style="display: flex; line-height: 60px;">
    <div style="margin-top: 5px; margin-left: -2px">
      <i :class="icon" style="font-size: 30px; cursor: pointer" @click="collapse"></i>
    </div>
    <div style="flex: 1; text-align: center; font-size: 34px">
      <span>欢迎来到物业管理系统</span>
    </div>
    <span>王小虎</span>
    <el-dropdown>
      <i class="el-icon-arrow-down" style="margin-left: 10px"></i>
      <el-dropdown-menu slot="dropdown">
        <el-dropdown-item @click.native="toUser">个人中心</el-dropdown-item>
        <el-dropdown-item @click.native="logout">退出登录</el-dropdown-item>
      </el-dropdown-menu>
    </el-dropdown>
  </div>
</template>

<script>
export default {
  name: "IndexHeader",
  props:{
    icon:String
  },
  methods:{
    toUser(){
      console.log('to_user')
    },
    logout(){
      console.log('logout')
    },
    collapse(){
      this.$emit('daCollapse')
    }
  }
}
</script>

<style scoped>

</style>
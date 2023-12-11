<template>
  <el-table :data="tableData" style="height: 100%">
    <el-table-column prop="date" label="日期" width="140">
    </el-table-column>
    <el-table-column prop="name" label="姓名" width="120">
    </el-table-column>
    <el-table-column prop="address" label="地址">
    </el-table-column>
  </el-table>
</template>

<script>
export default {
  name: "IndexMain",
  data() {
    return {
      tableData: []
    }
  },
  methods:{
    loadPost(){
      this.$axios.post(this.$httpUrl + '/resident/listP', {}).then(res=>{
        console.log(res);
      })
    }
  },
  beforeMount() {
    this.loadPost();
  }
}
</script>

<style scoped>

</style>
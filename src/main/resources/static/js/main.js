Vue.component('index-head', {
    props:{
        search:String
    },
    methods:{
        indexBack:function () {
            this.$emit('indexback');
        }
    },
    template: '<div class="index_head">\n' +
        '        <div style="float: left;margin: 10px 20px">\n' +
        '            <img height="60px" src="/img/aisama.png"/>\n' +
        '        </div>\n' +
        '        <div class="index-button" @click="indexBack"><i class="el-icon-s-home"></i>&nbsp;首页&nbsp;&nbsp;</div>\n' +
        '        <div style="float: left"><i class="el-icon-share"></i>&nbsp;友链</div>\n' +
        '        <div style="float: right;width: 400px;height: 60px;margin-right: 500px">\n' +
        '            <el-input placeholder="请输入搜索内容...." v-model="search">\n' +
        '                <el-button slot="append" icon="el-icon-search"></el-button>\n' +
        '            </el-input>\n' +
        '        </div>\n' +
        '    </div>'
})


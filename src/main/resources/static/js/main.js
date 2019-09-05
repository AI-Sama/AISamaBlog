Vue.component('index-head', {
    props:{
        search:String
    },
    methods:{
        indexBack:function () {
            this.$emit('indexback');
        },
        links:function () {
            this.$emit('links');
        },
        searchblog:function () {
            this.$emit('searchblog');
        }
    },
    template: '<div class="index_head">\n' +
        '        <div style="float: left;margin: 10px 20px">\n' +
        '            <img height="60px" src="/img/aisama.png"/>\n' +
        '        </div>\n' +
        '        <div class="index-button" @click="indexBack"><i class="el-icon-s-home"></i>&nbsp;首页&nbsp;&nbsp;</div>\n' +
        '        <div class="links-button" @click="links"><i class="el-icon-share"></i>&nbsp;友链</div>\n' +
        '        <div class="search-button" >\n' +
        '            <el-input placeholder="请输入搜索内容...." v-model="search">\n' +
        '                <el-button @click="searchblog" slot="append" icon="el-icon-search"></el-button>\n' +
        '            </el-input>\n' +
        '        </div>\n' +
        '    </div>'
})


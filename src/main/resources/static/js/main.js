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
        '        <div style="float: left;height: 4rem;width: 25%">\n' +
        '            <img style="height: 4rem" src="/img/aisama.png"/>\n' +
        '        </div>\n' +'<div class="index_head_center">'+
        '        <div class="index-button" @click="indexBack"><i class="el-icon-s-home"></i>&nbsp;首页&nbsp;&nbsp;</div>\n' +
        '        <div class="links-button" @click="links"><i class="el-icon-share"></i>&nbsp;友链</div>\n' +
        '        <div v-if="search !=\'false\'" class="search-button" >\n' +
        '            <el-input placeholder="请输入搜索内容...." v-model="search">\n' +
        '                <el-button @click="searchblog" slot="append" icon="el-icon-search"></el-button>\n' +
        '            </el-input>\n' +
        '        </div>\n' +'</div>'+
        '    </div>'
})

Vue.component('index-tail', {
    template:'<div style="margin:auto;text-align: center;color:rgba(0, 0, 0, .20) ;font-size: 15px;">\n' +
        '        Copyright © 2019 AISama\'s Blog<br>\n' +
        '        赣 ICP 备 18013570 号\n' +
        '    </div>'
})
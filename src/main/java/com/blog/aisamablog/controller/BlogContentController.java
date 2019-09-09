package com.blog.aisamablog.controller;

import com.blog.aisamablog.model.BlogContent;
import com.blog.aisamablog.model.PageValue;
import com.blog.aisamablog.model.ResultBean;
import com.blog.aisamablog.service.BlogContentServiceImpl;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-09-01 16:24
 **/
@Slf4j
@RestController
@RequestMapping(value = "/BlogContentController")
@Api(tags = "博客")
public class BlogContentController {
    @Autowired
    BlogContentServiceImpl blogContentService;

    @ApiOperation("添加一条博客")
    @PostMapping(value = "/insertBlog", produces = {"application/json;charset=utf-8"})
    public ResultBean insertBlog(@RequestBody BlogContent blogContent) {
        blogContentService.insertBlog(blogContent);
        return new ResultBean();
    }

    @ApiOperation("删除一条博客")
    @PostMapping(value = "/deleteBlog", produces = {"application/json;charset=utf-8"})
    public ResultBean deleteBlog(@RequestBody BlogContent blogContent) {
        blogContentService.deleteBlog(blogContent);
        return new ResultBean();
    }

    @ApiOperation("更新一条博客")
    @PostMapping(value = "/updateBlog", produces = {"application/json;charset=utf-8"})
    public ResultBean updateBlog(@RequestBody BlogContent blogContent) {
        blogContentService.updateBlog(blogContent);
        return new ResultBean();
    }

    @ApiOperation("查找所有博客")
    @PostMapping(value = "/selectBlogList", produces = {"application/json;charset=utf-8"})
    public ResultBean selectBlogList(@RequestBody PageValue pageValue) {
        log.info(pageValue.toString());
        PageInfo listPageInfo = blogContentService.selectBlogList(pageValue);
        return new ResultBean(listPageInfo);
    }

    @ApiOperation("根据id查找一个博客")
    @GetMapping(value = "/selectBlogById", produces = {"application/json;charset=utf-8"})
    public ResultBean<BlogContent> selectBlogById(Integer id) {
        BlogContent blogContent = blogContentService.selectBlog(id);
        return new ResultBean(blogContent);
    }

    @ApiOperation("查找博客全部分类")
    @GetMapping(value = "/selectBlogCategory", produces = {"application/json;charset=utf-8"})
    public ResultBean<List<String>> selectBlogCategory() {
        List<String> blogCategorys = blogContentService.selectBlogCategory();
        return new ResultBean(blogCategorys);
    }
}

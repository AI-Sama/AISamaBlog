package com.blog.aisamablog.controller;

import com.blog.aisamablog.model.BlogContent;
import com.blog.aisamablog.model.PageValue;
import com.blog.aisamablog.model.ResultBean;
import com.blog.aisamablog.service.BlogContentServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-09-01 16:24
 **/
@RestController
@RequestMapping(value = "/BlogContentController")
@Api(tags = "博客")
public class BlogContentController {
    @Autowired
    BlogContentServiceImpl blogContentService;
    final Logger logger= LoggerFactory.getLogger(this.getClass());
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
        List<BlogContent> blogContentList = blogContentService.selectBlog();
        return new ResultBean(blogContentList);
    }
}

package com.blog.aisamablog.controller;

import com.blog.aisamablog.model.BlogContent;
import com.blog.aisamablog.model.PageValue;
import com.blog.aisamablog.model.ResultBean;
import com.blog.aisamablog.service.BlogContentServiceImpl;
import com.blog.aisamablog.utils.Tools;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Iterator;
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

    @Value("${img.path}")
    String path;
    @Value("${blog.href}")
    String href;
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
        return new ResultBean(0,"删除成功");
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
        log.debug(pageValue.toString());
        PageInfo listPageInfo = blogContentService.selectBlogList(pageValue);
        log.info(listPageInfo.toString());
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

    @ApiOperation("上传图片或文件")
    @PostMapping(value = "/upImg", produces = {"application/json;charset=utf-8"})
    public ResultBean upImg(HttpServletRequest httpServletRequest)throws Exception{
        MultipartHttpServletRequest multipartHttpServletRequest=(MultipartHttpServletRequest) httpServletRequest;
        Iterator<String> names = multipartHttpServletRequest.getFileNames();
        String fileName="";
        String imgName="";
        while(names.hasNext()){
            fileName=names.next();
            MultipartFile multipartFile=multipartHttpServletRequest.getFile(fileName);
            File file;
            if(multipartFile.getOriginalFilename().endsWith("htm")||multipartFile.getOriginalFilename().endsWith("html")){
                imgName= "blogHtml/"+Tools.getNonceStr()+".html";
                file=new File(path+imgName);
            }else{
                imgName= "blogImg/"+Tools.getNonceStr()+".jpg";
                file=new File(path+imgName);
            }
            multipartFile.transferTo(file);
        }
        log.info(path+imgName);
        return new ResultBean(href+"blogFile/"+imgName);
    }
}

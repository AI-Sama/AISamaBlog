package com.blog.aisamablog.service;

import com.blog.aisamablog.mapper.BlogContentMapper;
import com.blog.aisamablog.model.BlogContent;
import com.blog.aisamablog.model.PageValue;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-09-01 16:27
 **/
@Slf4j
@Service
public class BlogContentServiceImpl implements BlogContentService {

    @Autowired
    BlogContentMapper blogContentMapper;

    @Override
    public void insertBlog(BlogContent blogContent) {
        blogContentMapper.insertSelective(blogContent);
    }

    @Override
    public void deleteBlog(BlogContent blogContent) {
        blogContentMapper.deleteByPrimaryKey(blogContent.getId());
    }

    @Override
    public void updateBlog(BlogContent blogContent) {
        blogContentMapper.updateByPrimaryKeySelective(blogContent);
    }

    @Override
    public PageInfo<List<BlogContent>> selectBlogList(PageValue pageValue) {
        PageHelper.startPage(pageValue.getPageNum(), pageValue.getPageSize());
        List<BlogContent> blogContentList = blogContentMapper.selectBlogContentList(pageValue.getVar1(),pageValue.getVar2());
        PageInfo pageInfo = new PageInfo(blogContentList);
        return pageInfo;
    }

    @Override
    public List<String> selectBlogCategory() {
        return blogContentMapper.selectBlogCategory();
    }

    @Override
    public BlogContent selectBlog(Integer id) {
        BlogContent blogContent=blogContentMapper.selectByPrimaryKey(id);
        BlogContent updateBlog=new BlogContent();
        updateBlog.setId(blogContent.getId());
        updateBlog.setBlogLookAmount(blogContent.getBlogLookAmount()+1);
        blogContentMapper.updateByPrimaryKeySelective(updateBlog);
        return blogContent;
    }

}

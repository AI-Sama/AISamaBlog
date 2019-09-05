package com.blog.aisamablog.service;


import com.blog.aisamablog.model.BlogContent;
import com.blog.aisamablog.model.PageValue;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BlogContentService {

    void insertBlog(BlogContent blogContent);

    void deleteBlog(BlogContent blogContent);

    void updateBlog(BlogContent blogContent);

    PageInfo<List<BlogContent>> selectBlogList(PageValue pageValue);

    List<String> selectBlogCategory();

    BlogContent selectBlog(Integer id);
}

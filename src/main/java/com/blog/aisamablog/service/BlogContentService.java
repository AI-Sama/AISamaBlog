package com.blog.aisamablog.service;


import com.blog.aisamablog.model.BlogContent;

import java.util.List;

public interface BlogContentService {
    void insertBlog(BlogContent blogContent);
    void deleteBlog(BlogContent blogContent);
    void updateBlog(BlogContent blogContent);
    List<BlogContent> selectBlog();
}

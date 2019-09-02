package com.blog.aisamablog.service;

import com.blog.aisamablog.model.BlogUser;
import com.blog.aisamablog.model.PageValue;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BlogUserService {
    void insertUser(BlogUser blogUser);

    void deleteUser(BlogUser blogUser);

    void updateUser(BlogUser blogUser);

    PageInfo<List<BlogUser>> selectBlogUserList(PageValue pageValue);
}

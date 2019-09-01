package com.blog.aisamablog.service;

import com.blog.aisamablog.model.BlogUser;

import java.util.List;

public interface BlogUserService {
    void insertUser(BlogUser blogUser);
    void deleteUser(BlogUser blogUser);
    void updateUser(BlogUser blogUser);
    List<BlogUser> selectUser();
}

package com.blog.aisamablog.mapper;

import com.blog.aisamablog.model.BlogUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogUserMapper {
    BlogUser selectUserByNickName(BlogUser blogUser);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogUser record);

    int insertSelective(BlogUser record);

    BlogUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BlogUser record);

    int updateByPrimaryKey(BlogUser record);

    List<BlogUser> selectBlogUserList();
}
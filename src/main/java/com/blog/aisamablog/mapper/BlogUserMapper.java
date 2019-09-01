package com.blog.aisamablog.mapper;

import com.blog.aisamablog.model.BlogUser;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BlogUser record);

    int insertSelective(BlogUser record);

    BlogUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BlogUser record);

    int updateByPrimaryKey(BlogUser record);
}
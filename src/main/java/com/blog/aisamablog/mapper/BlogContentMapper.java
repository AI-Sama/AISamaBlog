package com.blog.aisamablog.mapper;

import com.blog.aisamablog.model.BlogContent;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BlogContent record);

    int insertSelective(BlogContent record);

    BlogContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BlogContent record);

    int updateByPrimaryKey(BlogContent record);
}
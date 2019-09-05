package com.blog.aisamablog.mapper;

import com.blog.aisamablog.model.BlogContent;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogContentMapper {
    int deleteByPrimaryKey(Integer id);

    List<BlogContent> selectBlogContentList();

    List<String> selectBlogCategory();

    int insertSelective(BlogContent record);

    BlogContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BlogContent record);

}
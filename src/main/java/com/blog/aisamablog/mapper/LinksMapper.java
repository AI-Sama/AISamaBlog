package com.blog.aisamablog.mapper;

import com.blog.aisamablog.model.Links;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinksMapper {
    List<Links> selectLinkList();

    int deleteByPrimaryKey(Integer id);

    int insert(Links record);

    int insertSelective(Links record);

    Links selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Links record);

    int updateByPrimaryKey(Links record);
}
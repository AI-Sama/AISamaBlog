package com.blog.aisamablog.service;

import com.blog.aisamablog.mapper.BlogContentMapper;
import com.blog.aisamablog.model.BlogContent;
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
@Service
public class BlogContentServiceImpl implements BlogContentService {

    @Autowired
    BlogContentMapper blogContentMapper;
    final Logger logger= LoggerFactory.getLogger(this.getClass());
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
    public List<BlogContent> selectBlog() {

        return null;
    }
}

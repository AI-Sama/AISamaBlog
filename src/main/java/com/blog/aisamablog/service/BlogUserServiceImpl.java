package com.blog.aisamablog.service;

import com.blog.aisamablog.mapper.BlogUserMapper;
import com.blog.aisamablog.model.BlogUser;
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
public class BlogUserServiceImpl implements BlogUserService {

    @Autowired
    BlogUserMapper blogUserMapper;
    final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Override
    public void insertUser(BlogUser blogUser) {
        blogUserMapper.insertSelective(blogUser);
    }

    @Override
    public void deleteUser(BlogUser blogUser) {
        blogUserMapper.deleteByPrimaryKey(blogUser.getId());
    }

    @Override
    public void updateUser(BlogUser blogUser) {
        blogUserMapper.updateByPrimaryKeySelective(blogUser);
    }

    @Override
    public List<BlogUser> selectUser() {
        return null;
    }
}

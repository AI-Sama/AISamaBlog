package com.blog.aisamablog.service;

import com.blog.aisamablog.mapper.BlogUserMapper;
import com.blog.aisamablog.model.BlogUser;
import com.blog.aisamablog.model.PageValue;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Service
public class BlogUserServiceImpl implements BlogUserService {

    @Autowired
    BlogUserMapper blogUserMapper;

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
    public PageInfo<List<BlogUser>> selectBlogUserList(PageValue pageValue) {
        PageHelper.startPage(pageValue.getPageNum(), pageValue.getPageSize());
        List<BlogUser> blogUserList = blogUserMapper.selectBlogUserList();
        PageInfo pageInfo = new PageInfo(blogUserList);
        return pageInfo;
    }
}

package com.blog.aisamablog.service;

import com.blog.aisamablog.mapper.LinksMapper;
import com.blog.aisamablog.model.Links;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-09-05 16:54
 **/
@Slf4j
@Service
public class LinksServiceImpl implements LinksService {
    @Autowired
    LinksMapper linksMapper;

    @Override
    public void insertLink(Links links) {
        linksMapper.insertSelective(links);
    }

    @Override
    public void deleteLink(Links links) {
        linksMapper.deleteByPrimaryKey(links.getId());
    }

    @Override
    public void updateLink(Links links) {
        linksMapper.updateByPrimaryKeySelective(links);
    }

    @Override
    public List<Links> selectLinkList() {
        return linksMapper.selectLinkList();
    }
}

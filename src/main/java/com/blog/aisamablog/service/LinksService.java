package com.blog.aisamablog.service;

import com.blog.aisamablog.model.Links;

import java.util.List;

public interface LinksService {
    void insertLink(Links links);

    void deleteLink(Links links);

    void updateLink(Links links);

    List<Links> selectLinkList();
}

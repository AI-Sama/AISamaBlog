package com.blog.aisamablog.controller;

import com.blog.aisamablog.model.Links;
import com.blog.aisamablog.model.ResultBean;
import com.blog.aisamablog.service.LinksServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-09-05 16:58
 **/
@RestController
@RequestMapping(value = "/BlogUserController")
@Api(tags = "友情链接")
public class LinksController {
    @Autowired
    LinksServiceImpl linksService;

    @ApiOperation("新增一条友情链接")
    @PostMapping(value = "/insertLink", produces = {"application/json;charset=utf-8"})
    public ResultBean insertLink(@RequestBody Links links) {
        linksService.insertLink(links);
        return new ResultBean();
    }

    @ApiOperation("删除一条友情链接")
    @PostMapping(value = "/deleteLink", produces = {"application/json;charset=utf-8"})
    public ResultBean deleteLink(@RequestBody Links links) {
        linksService.deleteLink(links);
        return new ResultBean();
    }

    @ApiOperation("修改一条友情链接")
    @PostMapping(value = "/updateLink", produces = {"application/json;charset=utf-8"})
    public ResultBean updateLink(@RequestBody Links links) {
        linksService.updateLink(links);
        return new ResultBean();
    }

    @ApiOperation("查找全部友情链接")
    @GetMapping(value = "/selectLinkList", produces = {"application/json;charset=utf-8"})
    public ResultBean<List<Links>> selectLinkList() {
        return new ResultBean(linksService.selectLinkList());
    }

}

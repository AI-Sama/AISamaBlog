package com.blog.aisamablog.controller;

import com.blog.aisamablog.model.BlogUser;
import com.blog.aisamablog.model.PageValue;
import com.blog.aisamablog.model.ResultBean;
import com.blog.aisamablog.service.BlogUserServiceImpl;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-09-01 16:24
 **/
@Slf4j
@RestController
@RequestMapping(value = "/BlogUserController")
@Api(tags = "账号")
public class BlogUserController {
    @Autowired
    BlogUserServiceImpl blogUserService;

    @ApiOperation("添加一个账号")
    @PostMapping(value = "/insertUser", produces = {"application/json;charset=utf-8"})
    public ResultBean insertUser(@RequestBody BlogUser blogContent) {
        blogUserService.insertUser(blogContent);
        return new ResultBean();
    }

    @ApiOperation("删除一个账号")
    @PostMapping(value = "/deleteUser", produces = {"application/json;charset=utf-8"})
    public ResultBean deleteUser(@RequestBody BlogUser blogContent) {
        blogUserService.deleteUser(blogContent);
        return new ResultBean();
    }

    @ApiOperation("更新一个账号")
    @PostMapping(value = "/updateUser", produces = {"application/json;charset=utf-8"})
    public ResultBean updateUser(@RequestBody BlogUser blogContent) {
        blogUserService.updateUser(blogContent);
        return new ResultBean();
    }

    @ApiOperation("查找所有账号")
    @PostMapping(value = "/selectUserList", produces = {"application/json;charset=utf-8"})
    public ResultBean selectUserList(@RequestBody PageValue pageValue) {
        PageInfo listPageInfo = blogUserService.selectBlogUserList(pageValue);
        return new ResultBean(listPageInfo);
    }

    @ApiOperation("账号登录")
    @PostMapping(value = "/login", produces = {"application/json;charset=utf-8"})
    public ResultBean login(@RequestBody BlogUser blogUser, HttpServletRequest httpServletRequest) {
        HttpSession httpSession = httpServletRequest.getSession();
        BlogUser user = blogUserService.checkUser(blogUser);
        if (user == null) {
            return new ResultBean(1, "账号不存在或密码错误");
        } else {
            httpSession.setAttribute("user", user);
            return new ResultBean(0,"登录成功");
        }
    }
}

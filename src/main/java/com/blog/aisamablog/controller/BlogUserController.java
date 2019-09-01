package com.blog.aisamablog.controller;

import com.blog.aisamablog.model.BlogUser;
import com.blog.aisamablog.model.PageValue;
import com.blog.aisamablog.model.ResultBean;
import com.blog.aisamablog.service.BlogUserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-09-01 16:24
 **/
@RestController
@RequestMapping(value = "/UserUserController")
@Api(tags = "账号")
public class BlogUserController{
        @Autowired
        BlogUserServiceImpl blogUserService;
        final Logger logger= LoggerFactory.getLogger(this.getClass());
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
                List<BlogUser> blogUserList = blogUserService.selectUser();
                return new ResultBean(blogUserList);
        }
}

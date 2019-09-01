package com.blog.aisamablog.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("账号")
public class BlogUser {
    @ApiModelProperty("账号id")
    private Integer id;
    @ApiModelProperty("创建时间")
    private Date gmtCreate;
    @ApiModelProperty("修改时间")
    private Date gmtModified;
    @ApiModelProperty("账号昵称")
    private String userName;
    @ApiModelProperty("密码")
    private String userPass;
    @ApiModelProperty("邮件")
    private String userMail;
    @ApiModelProperty("头像")
    private String userHeadImg;
    @ApiModelProperty("账号标识")
    private Byte userType;
}
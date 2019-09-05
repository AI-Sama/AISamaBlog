package com.blog.aisamablog.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("友情链接")
public class Links {
    @ApiModelProperty("账号id")
    private Integer id;
    @ApiModelProperty("创建时间")
    private Date gmtCreate;
    @ApiModelProperty("修改时间")
    private Date gmtModified;
    @ApiModelProperty("链接名称")
    private String linkName;
    @ApiModelProperty("链接头像")
    private String linkHeadImg;
    @ApiModelProperty("链接地址")
    private String linkHref;
    @ApiModelProperty("链接描述")
    private String linkSummary;
}
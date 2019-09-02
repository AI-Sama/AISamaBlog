package com.blog.aisamablog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@ApiModel("博客")
public class BlogContent {
    @ApiModelProperty("博客id")
    private Integer id;
    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date gmtCreate;
    @ApiModelProperty("修改时间")
    private Date gmtModified;
    @ApiModelProperty("博客标题")
    private String blogTitle;
    @ApiModelProperty("博客标签")
    private String blogLabel;
    @ApiModelProperty("观看数量")
    private Integer blogLookAmount;
    @ApiModelProperty("点赞数量")
    private Integer blogLikeAmount;
    @ApiModelProperty("博客内容")
    private String blogText;
    @ApiModelProperty("博客简述")
    private String blogBeWrite;
}
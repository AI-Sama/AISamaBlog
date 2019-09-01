package com.blog.aisamablog.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-09-01 18:52
 **/
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("分页参数")
public class PageValue {
    @ApiModelProperty("当前页数")
    private Integer pageNum=1;
    @ApiModelProperty("一页显示数量")
    private Integer pageSize=0;
    @ApiModelProperty("扩展参数1")
    private String var1;
    @ApiModelProperty("扩展参数2")
    private String var2;
    @ApiModelProperty("扩展参数3")
    private String var3;
}

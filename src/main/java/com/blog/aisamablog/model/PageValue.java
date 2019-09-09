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

    public void setVar1(String var1) {
        if(var1!=null&&var1.trim().length()<=0){
            var1=null;
        }
        this.var1 = var1;
    }

    public void setVar2(String var2) {
        if(var2!=null&&var2.trim().length()<=0){
            var2=null;
        }
        this.var2 = var2;
    }

    public void setVar3(String var3) {
        if(var3!=null&&var3.trim().length()<=0){
            var3=null;
        }
        this.var3 = var3;
    }
}

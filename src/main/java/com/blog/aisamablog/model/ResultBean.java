package com.blog.aisamablog.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-09-01 18:38
 **/

@Data
@ToString
@ApiModel("返回结果")
public class ResultBean<T> implements Serializable {
    @ApiModelProperty(value = "返回code")
    private Integer resultCode=0;
    @ApiModelProperty(value = "返回信息")
    private String resultMsg="OK";
    @ApiModelProperty(value = "返回数据")
    private T resultData=null;

    public ResultBean() {

    }

    public ResultBean(T resultData) {
        this.resultData = resultData;
    }

    public ResultBean(Integer resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public ResultBean(Integer resultCode, String resultMsg, T resultData) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.resultData = resultData;
    }
}

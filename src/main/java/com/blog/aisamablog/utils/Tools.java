package com.blog.aisamablog.utils;

import java.util.UUID;

/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-09-10 10:29
 **/

public class Tools {
    public static String getNonceStr(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}

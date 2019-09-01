package com.blog.aisamablog.conf;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-08-22 09:52
 **/
public class MyWebMvcConfigurations extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
    }
}

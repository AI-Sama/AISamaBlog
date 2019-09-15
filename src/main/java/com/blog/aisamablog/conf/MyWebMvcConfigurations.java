package com.blog.aisamablog.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-08-22 09:52
 **/
@Configuration
public class MyWebMvcConfigurations implements WebMvcConfigurer {

    @Value("${img.path}")
    String path;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/blogImg/**").addResourceLocations("file:"+path);
    }
    //    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/blogImg/**").addResourceLocations("file:D:/blogImg/");
////        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
}

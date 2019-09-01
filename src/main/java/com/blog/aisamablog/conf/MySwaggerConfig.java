package com.blog.aisamablog.conf;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: aisamablog
 * @author: ZhangXiangQiang
 * @create: 2019-08-22 09:52
 **/
@Configuration
@EnableSwagger2
public class MySwaggerConfig {
    @Value("${enableSwagger}")
    private boolean enableSwagger;
    @Bean
    public Docket userApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(enableSwagger)
                .select()// 选择那些路径和api会生成document
                .apis(RequestHandlerSelectors.basePackage("com.blog.aisamablog.controller")) // 对所有api进行监控
                .paths(PathSelectors.any()) // 对所有路径进行监控
                .build()
                .apiInfo(apiInfo());
    }
    @Bean
    public RequestMappingInfoHandlerMapping requestMapping() {
        return new RequestMappingHandlerMapping();
    }
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder().
                title("aisama_blog")
                .version("V1.0.0")
                .build();
        return apiInfo;
    }
}

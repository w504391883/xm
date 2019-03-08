package com.xxd.swagger;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * + @author Xuxiaodong
 * + @descriptionswagger2配置类
 * + @date 2019/3/7
 * + @E-mail 504391883@qq.com
 */
@Configuration
@EnableSwagger2
@EnableAutoConfiguration
@ComponentScan("com.xxd.controller")
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xxd"))
                .paths(PathSelectors.any())
                .build();

    }


    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("角色权限管理Api")
                //创建人
                .contact(new Contact("续晓东","","504391883@qq.com"))
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }

}

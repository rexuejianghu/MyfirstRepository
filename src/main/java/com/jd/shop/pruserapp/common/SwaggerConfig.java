package com.jd.shop.pruserapp.common;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author xingzhiyan
 * @create 2018-10-14 16:47
 * @desc swagger配置
 **/
@Configuration
@EnableSwagger2
@EnableAutoConfiguration
public class SwaggerConfig
{
    public static final String SWAGGER_SCAN_BASE_PACKAGE = "com.jd.shop.pruserapp.controller";//扫描路径
    public static final String SWAGGER_SERVICE_CNTITLE="用户领域服务API接口";//标题
    public static final String SWAGGER_SERVICE_ENTITLE="User domain service API interface";//英文标题
    public static final String TEAM_ENNAME ="TEAM  OF CUST"; //团队英文名称
    public static final String TEAM_CNNAME ="店铺小组"; //团队名称
    public static final String VERSION = "0.0.1";//版本号


    @Bean
    public Docket api()
    {
        return new Docket(DocumentationType.SWAGGER_2).pathMapping("/").select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo()
    {
        ApiInfo apiInfo = new ApiInfoBuilder().title(SWAGGER_SERVICE_CNTITLE)
                .description("综合管理 Swagger API 服务")
                .termsOfServiceUrl("http://swagger.io/")
                .contact(new Contact("xingzhiyan", "127.0.0.1", "zhiyan721@163.com.cn"))
                .version(VERSION)
                .build();


        return apiInfo;
    }

}
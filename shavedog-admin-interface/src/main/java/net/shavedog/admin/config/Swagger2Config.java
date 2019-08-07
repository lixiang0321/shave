package net.shavedog.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket getDocket() { // 设置基础的Swagger配置项，主要设置扫描的包
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.getApiInfo()).select().apis(RequestHandlerSelectors.basePackage("net.shavedog.admin.rest"))
                .paths(PathSelectors.any()).build();
    }

    /*
        http://shavedogadmin.com:8001/swagger-ui.html   HOST本地注册
    */
    private ApiInfo getApiInfo() {  // 得到的基础内容信息
        return new ApiInfoBuilder().title("部门微服务")
                .description("这里面融合了本次使用的部门微服务信息")
                .termsOfServiceUrl("http://shavedogadmin.com")
                .license("爆可爱的小李老师").version("1.0").build();
    }
}

//package com.lifebug.facevision.controller.swagger;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import static springfox.documentation.builders.PathSelectors.regex;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public Docket productApi() {
//
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//
//        apiInfoBuilder.title("Face Vision API");
//        apiInfoBuilder.description("Project Hack First Line");
//        apiInfoBuilder.version("1.0");
//        apiInfoBuilder.license("Apache License Version 2.0");
//        apiInfoBuilder.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0");
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.lifebug.facevision.controller"))
//                .paths(regex("/api.*"))
//                .build()
//                .apiInfo(apiInfoBuilder.build());
//
//    }
//}

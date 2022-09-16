package com.qa.sms.swagger.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configurable
@EnableSwagger2
public class SwaggerConfig {
	
		@Bean
		public Docket swaggerApiConfig() {

		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				//.apis(Predicates.not(RequestHandlerSelectors.basePackage("com.qa.sms")))
				//.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.qa.sms"))
				.build();
		}

	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
	        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	    }
}

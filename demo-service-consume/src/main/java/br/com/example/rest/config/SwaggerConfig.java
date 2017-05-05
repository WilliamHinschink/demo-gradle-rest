package br.com.example.rest.config;

import io.swagger.jaxrs.config.BeanConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public BeanConfig beanConfig(){
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle("demo-service api docs");
        beanConfig.setVersion("1.0.0");
        beanConfig.setBasePath("/demo");
        beanConfig.setResourcePackage("br.com.example.rest");
        beanConfig.setScan(true);
        return beanConfig;
    }
}

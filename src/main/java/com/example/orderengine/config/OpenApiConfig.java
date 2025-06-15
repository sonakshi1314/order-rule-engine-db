package com.example.orderengine.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Order Rule Engine API")
                        .version("1.0.0")
                        .description("API documentation for Order Rule Engine with dynamic rule evaluation."));
    }
}

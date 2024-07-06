package tn.nasa_service_a.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Микросервис для работы с Nasa API")
                        .version("1.0"))
                .externalDocs(new ExternalDocumentation()
                        .url("http://localhost:8082/swagger-ui/index.html"));
    }
}

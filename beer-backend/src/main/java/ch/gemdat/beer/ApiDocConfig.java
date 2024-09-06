package ch.gemdat.beer;

import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ApiDocConfig {

    @Bean
    GroupedOpenApi beerApiV1() {
        return GroupedOpenApi.builder().group("Beer v1").pathsToMatch("/api/v1/**")
                .packagesToScan(new String[] { "ch.gemdat.beer" })
                .addOpenApiCustomizer(new OpenApiCustomizer() {
                    @Override
                    public void customise(OpenAPI openApi) {
                        openApi.getInfo().description(
                                "<img src=\"https://www.telegraph.co.uk/content/dam/health-fitness/2023/09/03/TELEMMGLPICT000347834660_16937432783420_trans_NvBQzQNjv4BqqVzuuqpFlyLIwiB6NTmJwfSVWeZ_vEN7c6bHu2jJnT8.jpeg?imwidth=1280\" width='300px'></img>");
                    }
                }).build();
    }

    @Bean
    OpenAPI apiInfo() {
        Contact contact = new Contact();
        contact.setName("Gemdat AG");
        contact.setEmail("info@gemdat.ch");
        contact.setUrl("https://www.gemdat.ch");
        return new OpenAPI().info(new Info().title("BEER").contact(contact).version("N/A"));
    }

}
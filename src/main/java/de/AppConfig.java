package de;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "de")
public class AppConfig {
    @Bean
    public MessageRenderer messageRenderer() {
        return new MessageRendererStandardImpl(message());
    }

    @Bean
    public Message message() {
        return new HelloMessage("Hello");
    }
}

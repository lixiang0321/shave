package net.shavedog.api.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {
    @Bean
    public feign.Logger.Level getFeignLoggerLevel() {
        return Logger.Level.FULL ;
    }
}

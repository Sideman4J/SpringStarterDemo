package com.example.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Greeter.class)
public class GreeterAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Greeter greeter() {
        return new Greeter();
    }
}

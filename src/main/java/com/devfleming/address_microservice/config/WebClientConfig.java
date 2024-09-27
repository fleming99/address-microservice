package com.devfleming.address_microservice.config;

import com.devfleming.address_microservice.audit.AuditAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@EnableJpaAuditing
public class WebClientConfig {

    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl("https://viacep.com.br/ws/").build();
    }

    @Bean
    public AuditorAware<String> auditorAware(){
        return new AuditAwareImpl();
    }
}

package com.bookmyshow.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain configureWeb(ServerHttpSecurity http) throws Exception {
        http.redirectToHttps(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public ServerHttpSecurity serverHttpSecurity() {
        return ServerHttpSecurity.http();
    }
}

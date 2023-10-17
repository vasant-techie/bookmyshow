package com.bookmyshow.gateway.config;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JAutoConfiguration;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class BMSCircuitBreakerConfig {

    @Bean
    public Customizer<Resilience4JConfigBuilder.Resilience4JCircuitBreakerConfiguration> bmsDefaultCustomizer() {
        /*return id -> {
            TimeLimiterConfig timeLimiterConfig = TimeLimiterConfig.custom()
                    .timeoutDuration(Duration.ofMillis(3000))
                    .build();
            CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.custom()
                    .failureRateThreshold(50)
                    .waitDurationInOpenState(Duration.ofMillis(1000))
                    .slidingWindowSize(20)
                    .build();
            Resilience4JConfigBuilder.Resilience4JCircuitBreakerConfiguration resilience4JConfigBuilder = new Resilience4JConfigBuilder("d").build();
            resilience4JConfigBuilder.setCircuitBreakerConfig(circuitBreakerConfig);
            resilience4JConfigBuilder.setTimeLimiterConfig(timeLimiterConfig);
            return resilience4JConfigBuilder;
        };*/
        return null;
    }
}
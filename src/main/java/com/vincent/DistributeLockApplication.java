package com.vincent;

import com.vincent.config.RedissonProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"classpath:redisson.properties"})
@EnableConfigurationProperties(value={RedissonProperties.class})
public class DistributeLockApplication {
    public static void main(String[] args) {
        SpringApplication.run(DistributeLockApplication.class,args);
    }
}

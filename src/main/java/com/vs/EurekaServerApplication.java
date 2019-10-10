package com.vs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description
 * Spring Cloud Eureka Server
 * @Author victor su
 * @Date 2019/10/10 19:41
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication extends SpringBootServletInitializer {

    /**
     * Spring Boot 启动类
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EurekaServerApplication.class);
    }

}

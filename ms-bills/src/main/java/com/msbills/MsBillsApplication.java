package com.msbills;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MsBillsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsBillsApplication.class, args);
    }

}

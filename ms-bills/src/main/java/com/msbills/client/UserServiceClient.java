package com.msbills.client;

import com.msbills.configuration.feign.OAuthFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "users-service", configuration = OAuthFeignConfig.class, url="http://localhost/8087")
public interface UserServiceClient {
    @GetMapping("/users/admin")
    String siEsAdmin();
}

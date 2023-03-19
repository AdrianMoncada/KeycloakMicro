package com.msbills.repositories;

import com.msbills.configuration.feign.OAuthFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "users-service", url="http://localhost:8087", configuration = OAuthFeignConfig.class)
public interface FeignRepository {

    @RequestMapping(method= RequestMethod.GET, value="/users/pruebaFeign")
    String funciona();
}

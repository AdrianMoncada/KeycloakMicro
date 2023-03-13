package com.digitalmedia.users.repository;

import com.digitalmedia.users.configuration.feign.FeignInterceptor;
import com.digitalmedia.users.model.Bill;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "ms-bills", url="http://localhost:8086", configuration = FeignInterceptor.class)
public interface FeignBillingRepository {

    @RequestMapping(method= RequestMethod.GET, value="/bills/findByCustomer")
    ResponseEntity<Bill> findBillByCustomer(@RequestParam String customer);
}

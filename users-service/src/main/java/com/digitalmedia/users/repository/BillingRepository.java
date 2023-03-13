package com.digitalmedia.users.repository;

import com.digitalmedia.users.model.Bill;
import org.springframework.http.ResponseEntity;

public class BillingRepository {

    private FeignBillingRepository feignBillingRepository;

    public BillingRepository(FeignBillingRepository feignBillingRepository) {
        this.feignBillingRepository = feignBillingRepository;
    }

    public Bill findBillByCustomer(String customer){
        ResponseEntity<Bill> response = feignBillingRepository.findBillByCustomer(customer);
        return response.getBody();
    }
}

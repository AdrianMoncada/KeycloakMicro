package com.msbills.controller;

import com.msbills.models.Bill;
import com.msbills.service.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

@RestController
@RequestMapping("/bills")
@RequiredArgsConstructor
public class BillController {

  private final BillService service;



  @GetMapping("/all")
  @PreAuthorize("hasRole('ROLE_provider')")
  public ResponseEntity<List<Bill>> getAll() {
    return ResponseEntity.ok().body(service.getAllBill());
  }


  @PostMapping()
  @PreAuthorize("hasRole('ROLE_provider')")
  public ResponseEntity<Bill> saveBill(@RequestBody Bill bill) {
    return ResponseEntity.ok().body(service.saveBill(bill));
  }

  @GetMapping("/findBy")
  @PreAuthorize("hasRole('ROLE_provider')")
  public ResponseEntity<Bill> findByCustomer(@RequestParam String customer) {
    Bill bill = service.findByCustomer(customer);
    if (bill != null) {
      return ResponseEntity.ok().body(bill);
    }
    return ResponseEntity.notFound().build();
  }



}

package com.digitalmedia.users.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
public class Bill {

        private String idBill;

        private Date billingDate;

        private String customerBill;

        private String productBill;

        private Double totalPrice;


}

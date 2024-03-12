package com.springbatch.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanInfo {
    @Id
    private Long id;
    private String name;
    private String city;
    private int pincode;
    private double loanAmount;
    private String loanType;
}

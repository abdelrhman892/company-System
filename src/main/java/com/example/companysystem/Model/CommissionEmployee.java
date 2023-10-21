package com.example.companysystem.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CommissionEmployee extends Employee{
    @Column(nullable = false)
    private double GrossSales;
    @Column(nullable = false)
    private double CommissionRate;


    public CommissionEmployee(String Name, String Address, Gender sex, double grossSales, double commissionRate) {
        super(Name, Address, sex);
        GrossSales = grossSales;
        CommissionRate = commissionRate;
    }

}

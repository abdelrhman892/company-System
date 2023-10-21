package com.example.companysystem.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class SalariedEmployee extends Employee{
    private double salary;
    private double bonus;
    private double deductions;
}

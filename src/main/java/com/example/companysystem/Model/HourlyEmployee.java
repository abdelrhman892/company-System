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
public class HourlyEmployee extends Employee{
    @Column(nullable = false)
    private double houreRate;
    @Column(nullable = false)
    private int numberOfHours;
}

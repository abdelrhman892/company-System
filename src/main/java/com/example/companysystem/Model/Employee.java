package com.example.companysystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
enum Gender{male, female};
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Employee {

    @Id
    private Long id;
    @Column(nullable = false)
    private String Name;
    @Column(unique = true, nullable = false)
    private String Address;
    @Column(nullable = false)
    private Gender sex;

    public Employee(String name, String address, Gender sex) {
        this.Name = name;
        this.Address = address;
        this.sex = sex;
    }
}

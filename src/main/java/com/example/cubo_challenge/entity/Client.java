package com.example.cubo_challenge.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Table(name = "clients")
@Entity(name= "clients")
@Getter
@Setter
@AllArgsConstructor

public class Client {

    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private BigDecimal participation;

    public Client( String firstName, String lastName, BigDecimal participation){
        this.firstName = firstName;
        this.lastName = lastName;
        this.participation = participation;
    }

    public Client(){}
    
}

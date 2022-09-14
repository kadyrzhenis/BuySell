package com.example.buysell.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "error",schema = "public")
public class Error {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code",nullable = false)
    private Long code;

    @Column(name = "message",nullable = false)
    private String message;


}

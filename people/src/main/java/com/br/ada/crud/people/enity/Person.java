package com.br.ada.crud.people.enity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "tb_people")
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long Id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "age",nullable = false)
    private String age;
     @Column(name = "cpf",nullable = false, unique = true)
    private String cpf;

    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "telefone",nullable = false)
    private String telefone;

    @Column(name = "saldo",nullable = false)
    private float saldo;

    @Builder
    public Person(String name, String age, String cpf, String email, String telefone, float saldo) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.saldo = saldo;
    }
}

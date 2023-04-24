package com.br.ada.crud.people.dto.response;

import com.br.ada.crud.people.enity.Person;
import lombok.Getter;
@Getter
public class PersonResponseDTO {
    private Long Id;
    private String name;
    private String age;
    private String cpf;
    private String email;
    private String telefone;
    private float saldo;

    public PersonResponseDTO(Person person) {
        this.Id = person.getId();
        this.name = person.getName();
        this.age = person.getAge();
        this.cpf = person.getCpf();
        this.email = person.getEmail();
        this.telefone = person.getTelefone();
        this.saldo = person.getSaldo();
    }



}

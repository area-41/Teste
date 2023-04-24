package com.br.ada.crud.people.dto.request;

import lombok.Getter;

@Getter
public class PersonRequestDTO {

    private String name;
    private String age;
    private String cpf;
    private String email;
    private String telefone;
    private float saldo;
}

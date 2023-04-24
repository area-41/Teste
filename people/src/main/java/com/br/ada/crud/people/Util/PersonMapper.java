package com.br.ada.crud.people.Util;

import com.br.ada.crud.people.dto.request.PersonRequestDTO;
import com.br.ada.crud.people.dto.response.PersonResponseDTO;
import com.br.ada.crud.people.enity.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapper {
    public Person toPerson(PersonRequestDTO personDTO){

        return Person.builder()
                .name(personDTO.getName())
                .age(personDTO.getAge())
                .cpf(personDTO.getCpf())
                .telefone(personDTO.getTelefone())
                .email(personDTO.getEmail())
                .saldo(personDTO.getSaldo())
                .build();

    }
    public PersonResponseDTO toPersonDTO (Person person){
        return  new PersonResponseDTO(person);
    }

    public List<PersonResponseDTO> toPeopleDTO(List<Person> peopleList){

        return peopleList.stream().map(PersonResponseDTO::new).collect(Collectors.toList());

    }

    public void updatepersonData (Person person, PersonRequestDTO personDTO){
        person.setName(person.getName());
        person.setCpf(person.getCpf());
        person.setAge(person.getAge());
        person.setEmail(person.getEmail());
        person.setTelefone(person.getTelefone());
        person.setSaldo(person.getSaldo());
    }
}

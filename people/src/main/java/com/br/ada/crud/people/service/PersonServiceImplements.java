package com.br.ada.crud.people.service;


import com.br.ada.crud.people.Util.PersonMapper;
import com.br.ada.crud.people.dto.request.PersonRequestDTO;
import com.br.ada.crud.people.dto.response.PersonResponseDTO;
import com.br.ada.crud.people.enity.Person;
import com.br.ada.crud.people.repository.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class PersonServiceImplements implements PersonService{


    public final PeopleRepository peopleRepository;
    public final PersonMapper personMapper;

    @Override
    public PersonResponseDTO findById(Long id) {
        Person person = returnPerson(id);
        return personMapper.toPersonDTO(returnPerson(id));
    }

    @Override
    public List<PersonResponseDTO> findAll() {

        return personMapper.toPeopleDTO(peopleRepository.findAll());
    }

    @Override
    public PersonResponseDTO register(PersonRequestDTO personDTO) {
        Person person = personMapper.toPerson(personDTO);
        return personMapper.toPersonDTO(peopleRepository.save(peopleRepository.save(person)));
    }

    @Override
    public PersonResponseDTO update(PersonRequestDTO personDTO, Long id) {
        Person person = returnPerson(id);
        personMapper.updatepersonData(person,personDTO);
        person = peopleRepository.save(person);
        return personMapper.toPersonDTO(peopleRepository.save(person));
    }

    @Override
    public String delete(Long id) {
        peopleRepository.deleteById(id);
        return "A pessoa do id: "+id+" deletada";
    }


    public Person returnPerson (Long id){
        return peopleRepository.findById(id).orElseThrow(()-> new RuntimeException("Person wasn't found on database"));
    }


}

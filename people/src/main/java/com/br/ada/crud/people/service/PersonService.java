package com.br.ada.crud.people.service;

import com.br.ada.crud.people.dto.request.PersonRequestDTO;
import com.br.ada.crud.people.dto.response.PersonResponseDTO;

import java.util.List;

public interface PersonService {

    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO personDTO);

    PersonResponseDTO update(PersonRequestDTO personDTO, Long id);

    String delete(Long id);
}

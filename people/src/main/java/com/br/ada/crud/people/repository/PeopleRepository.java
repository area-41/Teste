package com.br.ada.crud.people.repository;

import com.br.ada.crud.people.enity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Long> {

}

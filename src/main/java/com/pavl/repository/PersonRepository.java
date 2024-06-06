package com.pavl.repository;

import com.pavl.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {
    List<Person> findAllByIsDeletedOrderByFirstNameDesc(Boolean deleted);
    Person findByFirstNameAndLastNameAndIsDeleted(String firstName,String lastName,Boolean deleted);
}

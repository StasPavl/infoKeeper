package com.pavl.service.impl;

import com.pavl.dto.PersonDto;
import com.pavl.entity.Person;
import com.pavl.mapper.PersonMapper;
import com.pavl.repository.PersonRepository;
import com.pavl.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonMapper personMapper;
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonMapper personMapper, PersonRepository personRepository) {
        this.personMapper = personMapper;
        this.personRepository = personRepository;
    }

    @Override
    public void save(PersonDto person) {


        Person obj = personMapper.convertToEntity(person);


        personRepository.save(obj);
    }

    @Override
    public List<PersonDto> findAll() {
        List<Person> personList = personRepository.findAllByIsDeletedOrderByFirstNameDesc(false);
        return personList.stream().map(personMapper::convertToDto).collect(Collectors.toList());
    }
}

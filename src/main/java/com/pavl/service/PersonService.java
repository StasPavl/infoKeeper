package com.pavl.service;

import com.pavl.dto.PersonDto;

import java.util.List;

public interface PersonService {
    void save(PersonDto user);
    List<PersonDto> findAll();
}

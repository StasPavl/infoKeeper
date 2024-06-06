package com.pavl.mapper;


import com.pavl.dto.PersonDto;
import com.pavl.entity.Person;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    private final ModelMapper modelMapper;

    public PersonMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Person convertToEntity(PersonDto dto){
        return modelMapper.map(dto,Person.class);

    }

    public PersonDto convertToDto(Person entity){
        return modelMapper.map(entity,PersonDto.class);
    }

}

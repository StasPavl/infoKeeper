package com.pavl.entity;

import com.pavl.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "persons")
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;
    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
    @Column(columnDefinition = "DATE")
    private LocalDate deathDate;
    @Column(columnDefinition = "DATE")
    private LocalDate weddingDate;

    private String occupation;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}

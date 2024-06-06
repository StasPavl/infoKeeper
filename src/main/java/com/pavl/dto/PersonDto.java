package com.pavl.dto;

import com.pavl.enums.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
    @NotBlank
    @Size(max = 15, min =2)
    private String firstName;

    @NotBlank
    @Size(max = 15, min =2)
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate deathDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate weddingDate;

    private String occupation;
    @NotNull
    private Gender gender;

}

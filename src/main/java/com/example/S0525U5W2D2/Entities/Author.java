package com.example.S0525U5W2D2.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Author {
    public long id;
    public String name;
    public String surname;
    public String email;
    public LocalDate birthDate;
    public String avatar;

    public Author(String name, String surname, String email, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthDate = birthDate;
    }
}

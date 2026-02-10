package com.example.S0525U5W2D2.Payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
public class NewAuthorPayload {
    public long id;
    public String name;
    public String surname;
    public String email;
    public LocalDate birthDate;
    public String avatar;
}

package pl.medapp.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.medapp.commons.enums.AccountType;
import pl.medapp.commons.enums.Gender;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationDto {
    private String email;
    private String password;
    private AccountType accountType;
    private String firstName;
    private String lastName;

    // PATIENT
    private String pesel;
    LocalDate dateOfBirth;

    Gender gender;

    // DOCTOR
    private String specialization;
}


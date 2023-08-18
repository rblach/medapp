package pl.medapp.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;
import lombok.With;
import pl.medapp.commons.enums.Gender;
import pl.medapp.infrastructure.database.entity.MedicalHistoryEntity;

import java.time.LocalDate;
import java.util.List;

@With
@Value
@Builder
@EqualsAndHashCode(of = "id")
@ToString(of = {"id", "firstName", "lastName", "pesel"})
public class Patient {
    Long id;

    String firstName;
    String lastName;
    String pesel;
    LocalDate dateOfBirth;

    Gender gender;

    String email;

    List<MedicalHistoryEntity> medicalHistories;

    User user;
}

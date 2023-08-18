package pl.medapp.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;
import lombok.With;

@With
@Value
@Builder
@EqualsAndHashCode(of = "id")
@ToString(of = {"id", "email"})
public class User {
    Long id;

    String email;

    String password;

    Patient patient;

    Doctor doctor;
}

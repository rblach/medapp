package pl.medapp.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;
import lombok.With;
import pl.medapp.infrastructure.database.entity.VisitEntity;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "id")
@ToString(of = {"id", "firstName", "lastName", "specialization"})
public class Doctor {
    Long id;
    String firstName;
    String lastName;
    String specialization;
    Set<VisitEntity> visits;

    User user;
}
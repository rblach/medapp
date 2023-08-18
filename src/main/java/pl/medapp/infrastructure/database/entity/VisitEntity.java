package pl.medapp.infrastructure.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import pl.medapp.commons.enums.VisitStatus;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "visit")
public class VisitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorEntity doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patient;

    private LocalDate visitDate;
    private LocalTime startTime;
    private LocalTime endTime;

    @Enumerated(EnumType.STRING)
    private VisitStatus status;
}


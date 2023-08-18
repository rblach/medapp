package pl.medapp.infrastructure.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medical_history")
public class MedicalHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patient;

    private String illnessName;
    private LocalDate diagnosisDate;

    @Column(columnDefinition = "TEXT")
    private String treatment;

    // Getters and setters
}
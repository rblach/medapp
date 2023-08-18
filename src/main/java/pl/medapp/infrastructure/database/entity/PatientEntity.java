package pl.medapp.infrastructure.database.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import pl.medapp.commons.enums.Gender;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString(of = "lastName")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String pesel;
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "patient")
    private List<MedicalHistoryEntity> medicalHistories;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserEntity user;

}


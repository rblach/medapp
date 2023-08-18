package pl.medapp.infrastructure.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString(of = "email")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "app_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;

    @OneToOne(mappedBy = "user")
    private PatientEntity patient;

    @OneToOne(mappedBy = "user")
    private DoctorEntity doctor;
}
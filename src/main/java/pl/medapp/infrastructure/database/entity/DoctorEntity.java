package pl.medapp.infrastructure.database.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString(of = "lastName")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctor")
@Entity
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Long id;

    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "specialization")
    private String specialization;

    @OneToMany(mappedBy = "doctor")
    private Set<VisitEntity> visits;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserEntity user;
}


package pl.medapp.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.medapp.infrastructure.database.entity.PatientEntity;

public interface PatientJpaRepository extends JpaRepository<PatientEntity, Long> {
}

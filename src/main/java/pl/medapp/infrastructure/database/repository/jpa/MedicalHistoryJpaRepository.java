package pl.medapp.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.medapp.infrastructure.database.entity.MedicalHistoryEntity;

@Repository
public interface MedicalHistoryJpaRepository extends JpaRepository<MedicalHistoryEntity, Long> {
}

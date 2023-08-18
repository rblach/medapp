package pl.medapp.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.medapp.infrastructure.database.entity.VisitEntity;

public interface VisitJpaRepository extends JpaRepository<VisitEntity, Long> {
}
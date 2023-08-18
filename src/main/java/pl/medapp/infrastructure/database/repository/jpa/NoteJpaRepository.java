package pl.medapp.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.medapp.infrastructure.database.entity.NoteEntity;

public interface NoteJpaRepository extends JpaRepository<NoteEntity, Long> {
}

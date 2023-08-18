package pl.medapp.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.medapp.business.dao.NoteDAO;
import pl.medapp.infrastructure.database.repository.jpa.NoteJpaRepository;

@Repository
@AllArgsConstructor
public class NoteRepository implements NoteDAO {
    private final NoteJpaRepository noteJpaRepository;

}

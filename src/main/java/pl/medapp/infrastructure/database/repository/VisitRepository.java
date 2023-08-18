package pl.medapp.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.medapp.business.dao.VisitDAO;
import pl.medapp.infrastructure.database.repository.jpa.VisitJpaRepository;

@Repository
@AllArgsConstructor
public class VisitRepository implements VisitDAO {
    private final VisitJpaRepository visitJpaRepository;
}

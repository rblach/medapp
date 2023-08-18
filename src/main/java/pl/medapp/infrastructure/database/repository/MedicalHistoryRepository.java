package pl.medapp.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.medapp.business.dao.MedicalHistoryDAO;
import pl.medapp.infrastructure.database.repository.jpa.MedicalHistoryJpaRepository;

@Repository
@AllArgsConstructor
public class MedicalHistoryRepository implements MedicalHistoryDAO {
    private final MedicalHistoryJpaRepository medicalHistoryJpaRepository;

    public void saveMedical() {
//        medicalHistoryJpaRepository.save()
    }
}

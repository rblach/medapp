package pl.medapp.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.medapp.business.dao.PatientDAO;
import pl.medapp.domain.Patient;
import pl.medapp.infrastructure.database.entity.PatientEntity;
import pl.medapp.infrastructure.database.repository.jpa.PatientJpaRepository;
import pl.medapp.infrastructure.database.repository.mapper.PatientEntityMapper;

@Repository
@AllArgsConstructor
public class PatientRepository implements PatientDAO {
    private final PatientJpaRepository patientJpaRepository;
    private final PatientEntityMapper patientEntityMapper;

    @Override
    public void save(Patient patient) {
        PatientEntity patientEntity = patientEntityMapper.toEntity(patient);
        patientJpaRepository.saveAndFlush(patientEntity);
    }

    // Implementujesz niestandardowe metody interfejsu PatientDAO, korzystając z patientJpaRepository
}
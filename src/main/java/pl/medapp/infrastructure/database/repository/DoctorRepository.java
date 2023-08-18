package pl.medapp.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.medapp.business.dao.DoctorDAO;
import pl.medapp.domain.Doctor;
import pl.medapp.infrastructure.database.entity.DoctorEntity;
import pl.medapp.infrastructure.database.repository.jpa.DoctorJpaRepository;
import pl.medapp.infrastructure.database.repository.mapper.DoctorEntityMapper;

@Repository
@AllArgsConstructor
public class DoctorRepository implements DoctorDAO {
    private final DoctorJpaRepository doctorJpaRepository;
    private final DoctorEntityMapper doctorEntityMapper;

    @Override
    public void save(Doctor doctor) {
        DoctorEntity doctorEntity = doctorEntityMapper.toEntity(doctor);
        System.out.println(doctorEntity);
        doctorJpaRepository.saveAndFlush(doctorEntity);
    }

    // Implementujesz niestandardowe metody interfejsu DoctorDAO, korzystając z doctorJpaRepository
}
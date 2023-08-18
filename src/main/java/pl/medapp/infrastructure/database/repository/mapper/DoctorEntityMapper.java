package pl.medapp.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.medapp.domain.Doctor;
import pl.medapp.infrastructure.database.entity.DoctorEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface DoctorEntityMapper {
    Doctor toDomain(DoctorEntity doctorEntity);
    DoctorEntity toEntity(Doctor doctor);
}
package pl.medapp.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.medapp.domain.Patient;
import pl.medapp.infrastructure.database.entity.PatientEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface PatientEntityMapper {
    Patient toDomain(PatientEntity patientEntity);
    PatientEntity toEntity(Patient patient);
}

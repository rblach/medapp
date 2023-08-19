package pl.medapp.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import pl.medapp.domain.User;
import pl.medapp.infrastructure.database.entity.UserEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserEntityMapper {
    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    @Mapping(target = "doctor", ignore = true)
    User toDomain(UserEntity userEntity);

    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    UserEntity toEntity(User user);
}

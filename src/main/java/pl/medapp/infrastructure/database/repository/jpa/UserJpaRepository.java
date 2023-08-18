package pl.medapp.infrastructure.database.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.medapp.infrastructure.database.entity.UserEntity;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);
}

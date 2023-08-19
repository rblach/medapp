package pl.medapp.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.medapp.business.dao.UserDAO;
import pl.medapp.domain.User;
import pl.medapp.infrastructure.database.entity.UserEntity;
import pl.medapp.infrastructure.database.repository.jpa.UserJpaRepository;
import pl.medapp.infrastructure.database.repository.mapper.UserEntityMapper;

@Repository
@AllArgsConstructor
public class UserRepository implements UserDAO {
    private final UserJpaRepository userJpaRepository;
    private final UserEntityMapper userEntityMapper;

    @Override
    public void save(User user) {
        UserEntity userEntity = userEntityMapper.toEntity(user);
        userJpaRepository.saveAndFlush(userEntity);
    }

    @Override
    public User findByEmail(String email) {
        var userEntity = userJpaRepository.findByEmail(email);
        return userEntityMapper.toDomain(userEntity);
    }
}

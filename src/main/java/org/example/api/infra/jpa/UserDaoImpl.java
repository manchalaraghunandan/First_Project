package org.example.api.infra.jpa;

import org.example.api.infra.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

    private final UserRepository userRepository;

    public UserDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity getUserById(long id) {
        return userRepository.findById(id);
    }
}

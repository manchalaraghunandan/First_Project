package org.example.api.infra.jpa;

import jakarta.persistence.EntityManagerFactory;
import org.example.api.infra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

    private final UserRepository userRepository;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public UserDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity getUserById(long id) {
        return userRepository.findById(id);
    }
}

package org.example.api.infra.jpa;

import org.springframework.stereotype.Component;

@Component
public interface UserDao {

    UserEntity getUserById(long id);
}

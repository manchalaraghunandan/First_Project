package org.example.service;

import org.example.api.infra.dto.UserDto;
import org.example.api.infra.jpa.UserDao;
import org.example.mappers.CommonMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDao userDao;

    private final CommonMapper commonMapper;

    public UserService(UserDao userDao, CommonMapper commonMapper) {
        this.userDao = userDao;
        this.commonMapper = commonMapper;
    }

    public UserDto getUserById(long id) {
        return commonMapper.toUserDto(userDao.getUserById(id));
    }

}

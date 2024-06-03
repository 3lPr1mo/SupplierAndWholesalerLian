package com.lian.supplierandwholesalerlian.domain.spi;

import com.lian.supplierandwholesalerlian.domain.model.User;

import java.util.List;

public interface IUserPersistencePort {
    void saveUser(User user);

    List<User> getAllUser();

    User getUser(Long userId);

    void updateUser(User user);

    void deleteUser(Long userId);
}

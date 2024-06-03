package com.lian.supplierandwholesalerlian.domain.useCase;

import com.lian.supplierandwholesalerlian.domain.api.IUserServicePort;
import com.lian.supplierandwholesalerlian.domain.model.User;
import com.lian.supplierandwholesalerlian.domain.spi.IUserPersistencePort;

import java.util.List;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }


    @Override
    public void saveUser(User user) {
        userPersistencePort.saveUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return userPersistencePort.getAllUser();
    }

    @Override
    public User getUser(Long userId) {
        return userPersistencePort.getUser(userId);
    }

    @Override
    public void updateUser(User user) {
        userPersistencePort.updateUser(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userPersistencePort.deleteUser(userId);
    }
}

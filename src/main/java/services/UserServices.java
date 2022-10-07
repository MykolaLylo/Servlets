package services;

import Excptions.IncorectCredentialsException;
import Excptions.UserAlreadyExistException;
import Models.UserCredentials;
import entity.User;

public interface UserServices {
    void save(User user) throws UserAlreadyExistException;
    User login(UserCredentials credentials) throws IncorectCredentialsException;
}

package services.impl;

import Excptions.IncorectCredentialsException;
import Excptions.UserAlreadyExistException;
import Models.UserCredentials;
import dao.daoInterfaces.UserDao;
import entity.User;
import services.UserServices;

import java.sql.SQLException;
import java.util.Optional;

public class UserServiceImpl implements UserServices {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) throws UserAlreadyExistException {
        try {
           Optional <User> byEmail = userDao.getByEmail(user.getEmail());
            if (byEmail.isPresent()){
                throw new UserAlreadyExistException();
            }
           userDao.insert(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User login(UserCredentials credentials) throws IncorectCredentialsException {
        try {
          Optional<User> byEmail= userDao.getByEmail(credentials.getEmail());
          if (byEmail.isPresent()){
              User user = byEmail.get();
              if (user.getPassword().equals(credentials.getPassword())){
                  return user;
              }
          }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw  new IncorectCredentialsException();
    }

}

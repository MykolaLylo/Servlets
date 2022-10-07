package dao.daoInterfaces;

import entity.User;

import java.sql.SQLException;
import java.util.Optional;

public interface UserDao {
    public Optional<User> getByEmail(String email) throws SQLException;
    public void insert(User user) throws SQLException;
}

package dao.impl;

import connectors.MySQLConnector;
import dao.daoInterfaces.UserDao;
import mappers.UserMapper;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    private final Connection connection;
    public UserDaoImpl(){
        connection = new MySQLConnector().getConnection();
    }
    @Override
    public Optional<User> getByEmail(String email) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("Select * from user where email  = ?");
        statement.setString(1, email);
        ResultSet resultSet = statement.executeQuery();
        User user = UserMapper.mapUser(resultSet);
        statement.close();
        return Optional.ofNullable(user);
    }

    @Override
    public void insert(User user) throws SQLException {
      PreparedStatement statement =  connection.prepareStatement("insert into user values(?,?,?,?,?,?)");
      statement.setInt(1,user.getUser_id());
      statement.setString(2, user.getName());
      statement.setString(3, user.getSurname());
      statement.setString(4, user.getEmail());
      statement.setString(5, user.getPassword());
      statement.setString(6, user.getRole().name());
      statement.execute();
      statement.close();
    }
}

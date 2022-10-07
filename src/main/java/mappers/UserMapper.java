package mappers;

import entity.Role;
import entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserMapper {
    public static User mapUser(ResultSet resultSet) throws SQLException {
        User user = null;
        while (resultSet.next()) {
            user = new User();
            user.setUser_id(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setSurname(resultSet.getString(3));
            user.setEmail(resultSet.getString(4));
            user.setPassword(resultSet.getString(5));
            user.setRole(Role.valueOf(resultSet.getString(6)));
        }
        return user;
    }
}

import Excptions.IncorectCredentialsException;
import Models.UserCredentials;
import dao.impl.ProductDaoImpl;
import dao.impl.UserDaoImpl;
import services.ProductService;
import services.UserServices;
import services.impl.ProductServiceImpl;
import services.impl.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IncorectCredentialsException {
        ProductDaoImpl productDao = new ProductDaoImpl();
        try {
            productDao.getAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

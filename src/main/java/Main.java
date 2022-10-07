import Excptions.IncorectCredentialsException;
import Models.UserCredentials;
import dao.impl.ProductDaoImpl;
import dao.impl.UserDaoImpl;
import services.ProductService;
import services.UserServices;
import services.impl.ProductServiceImpl;
import services.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) throws IncorectCredentialsException {
        ProductService productService = new ProductServiceImpl(new ProductDaoImpl());

    }
}

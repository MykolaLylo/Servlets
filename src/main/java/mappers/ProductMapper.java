package mappers;

import entity.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductMapper {
    public static List<Product> mapProductFromResulSet(ResultSet resultSet)throws SQLException {
        List<Product> products = new ArrayList<>();
        while (resultSet.next()){
            Product product = new Product(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getDouble(4),
                    resultSet.getString(5));
            products.add(product);
        }
        return products;
    }

    public static Product mapProduct(ResultSet resultSet) throws SQLException {
        Product product = null;

        while (resultSet.next()){
            product = new Product(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getDouble(4),
                    resultSet.getString(5));
        }
        return product;
    }

}

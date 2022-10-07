package services;

import entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService {
    void save (Product product) throws SQLException;
    Product getById (int id);
    List<Product> getAll();
}

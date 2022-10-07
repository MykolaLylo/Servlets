package services.impl;

import dao.daoInterfaces.ProductDao;
import entity.Product;
import services.ProductService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;
    private final String DEFAULT_IMAGE = "https://cdn2.vectorstock.com/i/1000x1000/01/31/newspaper-icon-journal-symbol-vector-26970131.jpg";
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void save(Product product) throws SQLException {
        String image = product.getImage();
        if (image == null){
            product.setImage(DEFAULT_IMAGE);
        }
        productDao.save(product);
    }

    @Override
    public Product getById(int id) {
        try {
            Optional<Product> product = productDao.getById(id);
            if(product.isPresent()){
                return product.get();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        try {
            return productDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}

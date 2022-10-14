package dao.impl;


import connectors.MySQLConnector;
import dao.daoInterfaces.ProductDao;
import entity.Product;
import mappers.ProductMapper;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class ProductDaoImpl implements ProductDao {
    private final Connection connection;
    public ProductDaoImpl(){
        this.connection = new MySQLConnector().getConnection();
    }

    @Override
    public void save(Product product) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into product values(?,?,?,?,?)");
        statement.setInt(1,product.getProductId());
        statement.setString(2, product.getProductName());
        statement.setString(3, product.getDescription());
        statement.setDouble(4,product.getPrice());
        statement.setString(5, product.getImage());
        statement.execute();
        statement.close();
    }

    @Override
    public List<Product> getAll() throws SQLException {
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from product");
        return ProductMapper.mapProductFromResulSet(resultSet);
    }

    @Override
    public Optional<Product> getById(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("Select * from product where product_id = ?");
        statement.setInt(1,id);
        ResultSet resultSet = statement.executeQuery();
        Product product = ProductMapper.mapProduct(resultSet);
        statement.close();
        return Optional.ofNullable(product);
    }
}
package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    private int productId;
    private String productName;
    private String description;
    private double price;
    private String image;

    public Product(String productName, String description, double price, String image){
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.image = image;
    }

}

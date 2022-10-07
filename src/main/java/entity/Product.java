package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    private int product_id;
    private String product_name;
    private String description;
    private double price;
    private String image;

    public Product(String product_name, String description, double price, String image){
        this.product_name = product_name;
        this.description = description;
        this.price = price;
        this.image = image;
    }

}

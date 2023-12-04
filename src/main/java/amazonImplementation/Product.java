package amazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String ProductName;
    private int price;

    public Product(String productName, Integer price) {
        this.ProductName = ProductName;
        this.price = price;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getProductList() {
        List<String> ProductList = new ArrayList<>();
        ProductList.add("Apple Mackbook");
        ProductList.add("Apple Mackbook Pro");
        ProductList.add("Apple Mackbook Air");
        return ProductList;

    }
}

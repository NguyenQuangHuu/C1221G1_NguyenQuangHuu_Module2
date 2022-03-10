package ss17_io_binary.bai_tap.product_manager_binary_io;

import java.io.Serializable;

public class Product implements Serializable {
    private String productId;
    private String productName;
    private String producerName;
    private double price;
    private String description;

    public Product() {
    }

    public Product(String productId, String productName, String producerName, double price, String description) {
        this.productId = productId;
        this.productName = productName;
        this.producerName = producerName;
        this.price = price;
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return productId +
                ", " + productName +
                ", " + producerName +
                ", " + price +
                ", " + description;
    }


}

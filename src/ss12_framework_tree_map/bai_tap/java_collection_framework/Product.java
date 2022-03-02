package ss12_framework_tree_map.bai_tap.java_collection_framework;

public class Product{
    private int idProduct;
    private String nameProduct;
    private double price;
    private int quantity;

    public Product(int idProduct, String nameProduct,double price,int quantity) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product : id: "+this.getIdProduct()+", product name: "+this.getNameProduct()+" , quantity : "+this.getQuantity()+" , price: "+this.getPrice();
    }

}

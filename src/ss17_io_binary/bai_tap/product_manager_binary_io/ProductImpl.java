package ss17_io_binary.bai_tap.product_manager_binary_io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements IServices {
    Scanner sc = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    public ProductImpl() {
    }

    public ProductImpl(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> search(String search,List<Product> products) {
        List<Product> list = new ArrayList<>();
        for (Product product:products
             ) {
            if(product.getProductName().contains(search)){
                list.add(product);
            }
        }
        return list;
    }

    @Override
    public void display(List<Product> products) {

        products.forEach(product -> {
            System.out.println(product+"\n");
        });
    }
}

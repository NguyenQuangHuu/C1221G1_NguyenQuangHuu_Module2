package ss17_io_binary.bai_tap.product_manager_binary_io;

import java.util.List;

public interface IServices {
    void add (Product product);
    List<Product> search(String search,List<Product> products);
    void display(List<Product> products);
}

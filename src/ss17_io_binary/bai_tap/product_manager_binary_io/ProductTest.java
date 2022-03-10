package ss17_io_binary.bai_tap.product_manager_binary_io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTest {
    Scanner sc = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();
    ProductImpl productManager = new ProductImpl();
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    public void displayMenu(){
        int choice;
        do{
            System.out.println("Menu sản phẩm.\n" +
                    "1. Thêm sản phẩm.\n" +
                    "2. Tìm kiếm sản phẩm\n" +
                    "3. Hiển thị sản phẩm\n" +
                    "0. Thoát\n");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1 :
                    System.out.println("Nhập mã sản phẩm");
                    String id =  sc.nextLine();

                    System.out.println("Nhập tên sản phẩm");
                    String nameProduct = sc.nextLine();

                    System.out.println("Hãng sản xuất");
                    String nameProducer = sc.nextLine();

                    System.out.println("Giá sản phẩm");
                    double price = Double.parseDouble(sc.nextLine());

                    System.out.println("Mô tả sản phẩm");
                    String description = sc.nextLine();
                    Product product = new Product(id,nameProduct,nameProducer,price,description);
                    productList = readAndWriteFile.readFile();
                    productList.add(product);
                    readAndWriteFile.writeFile(productList);
                    break;
                case 2 : System.out.println("Nhập tên sản phẩm cần tìm");
                    String inputString = sc.nextLine();
                    List<Product> productList = readAndWriteFile.readFile();
                    List<Product> result = productManager.search(inputString,productList);
                    productManager.display(result);
                    break;
                case 3 :
                    List<Product> productList1 = readAndWriteFile.readFile();
                    productManager.display(productList1);
                    break;
                case 0 : break;
                default:
                    System.out.println("Sai cú pháp mời nhập lại");
            }
        }while (choice != 0);
    }
}

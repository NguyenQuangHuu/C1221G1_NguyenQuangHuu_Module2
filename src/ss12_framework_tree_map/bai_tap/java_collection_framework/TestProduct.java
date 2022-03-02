package ss12_framework_tree_map.bai_tap.java_collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        ArrayList<Product> products = productManager.productArrayList;
        int choice;
        do{
            System.out.println("Menu sản phẩm.\n" +
                    "1. Thêm sản phẩm.\n" +
                    "2. Chỉnh sửa sản phẩm theo id\n" +
                    "3. Xóa sản phẩm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm theo giá tăng dần\n" +
                    "7. Sắp xếp sản phẩm theo giá giảm dần\n" +
                    "0. Thoát menu.");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1: productManager.add();break;
                case 2: productManager.update();break;
                case 3: productManager.delete();break;
                case 4: productManager.showAll();break;
                case 5: productManager.search();break;
                case 6: productManager.sortUp();break;
                case 7: productManager.sortDown();break;
                case 0:break;
                default:
                    System.out.println("Nhập lại đi bạn, sao làm ít vậy");
            }
        }while(choice != 0);
    }
}

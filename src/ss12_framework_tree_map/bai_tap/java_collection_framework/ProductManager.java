package ss12_framework_tree_map.bai_tap.java_collection_framework;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class ProductManager{
    Scanner sc = new Scanner(System.in);
    ArrayList<Product> productArrayList = new ArrayList<>();
    SortUp sortUp = new SortUp();
    SortDown sortDown = new SortDown();
    public void add(){
        System.out.println("Nhập id của sản phẩm");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Nhập giá của sản phẩm:");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập só lượng sản phẩm");
        int quantity = Integer.parseInt(sc.nextLine());
        Product product = new Product(id,name,price,quantity);
        productArrayList.add(product);
    }

    public void update(){
        showAll();
        System.out.println("Nhập id sản phẩm muốn chỉnh sửa");
        int index = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên mới của sản phẩm");
        String newName = sc.nextLine();
        System.out.println("Nhập giá mới của sản phảm");
        double newPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số lượng mới của sản phẩm");
        int newQuantity = Integer.parseInt(sc.nextLine());
        productArrayList.get(index).setNameProduct(newName);
        productArrayList.get(index).setPrice(newPrice);
        productArrayList.get(index).setQuantity(newQuantity);
    }

    public void delete(){
//        for (Product product: productArrayList) {
//            System.out.println(product);
//        }
        showAll();
        System.out.println("Chọn mã số sản phẩm bạn muốn xóa");
        int index = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < productArrayList.size();i++){
            if(productArrayList.get(i).getIdProduct() == index){
                productArrayList.remove(i);
                break;
            }
        }
    }

    public void showAll(){
        for (Product product: productArrayList) {
            System.out.println(product);
        }
    }

    public void search(){
        System.out.println("Nhập tên sản phẩm cần tìm kiếm");
        boolean exist = false;
        Product product = null;
        String name = sc.nextLine();
        for (int i = 0; i < productArrayList.size(); i++) {
            if(productArrayList.get(i).getNameProduct().equals(name)){
                product = productArrayList.get(i);
                exist = true;
            }
        }
        if(exist){
            System.out.println(product);
        }else{
            System.out.println("Không tồn tại phần tử này");
        }
    }

    public void sortUp(){
        productArrayList.sort(sortUp);

        this.showAll();
    }
    public void sortDown(){
        productArrayList.sort(sortDown);
        this.showAll();
    }
}

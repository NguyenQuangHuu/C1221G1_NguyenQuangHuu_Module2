package oop_review.oop_2.quan_ly_tai_lieu;

import java.util.Scanner;

public class FileManager implements IFileManager{
    Scanner  sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Lựa chọn loại tài liệu bạn muốn thêm vào\n" +
                "1.Sách\n" +
                "2.Báo\n" +
                "3.Tạp chí\n" +
                "0.Thoát menu.\n" +
                "Lựa chọn của ban: ");
        int select = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập mã tài liệu");
        String fileCode = sc.nextLine();
        System.out.println("Nhập nhà xuất bản");
        String publisher = sc.nextLine();
        System.out.println("Nhập số lượng ấn bản phát hành");
        int releaseNumbers = Integer.parseInt(sc.nextLine());
        switch (select){
            case 1:System.out.println("Nhập tên tác giả");
                String authorName = sc.nextLine();
                System.out.println("Nhập số lượng trang");
                int pages = Integer.parseInt(sc.nextLine());
                File book = new Book(fileCode,publisher,releaseNumbers,authorName,pages);
                System.out.println(book);
                break;
            case 2:
                System.out.println("Nhập số phát hành");
                int releaseTimes = Integer.parseInt(sc.nextLine());
                System.out.println("Tháng phát hành:");
                int releaseMonth = Integer.parseInt(sc.nextLine());
                File magazine = new Magazine(fileCode,publisher,releaseNumbers,releaseTimes,releaseMonth);
                System.out.println(magazine);
                break;
            case 3:
                System.out.println("Nhập ngày phát hành");
                String date = sc.nextLine();
                File newspaper = new Newspaper(fileCode,publisher,releaseNumbers,date);
                System.out.println(newspaper);
                break;
        }

    }

    @Override
    public void search() {

    }

    @Override
    public void show() {

    }
}

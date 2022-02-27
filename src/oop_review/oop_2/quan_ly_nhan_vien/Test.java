package oop_review.oop_2.quan_ly_nhan_vien;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int ADD = 1;
        final int SEARCH = 2;
        final int SHOW = 3;
        final int SORT = 4;
        final int EXIT = 0;
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        CanBo[] canBos = new CanBo[50];
        NhanVien nhanVien = new NhanVien("Nguyễn Văn A",  1992,true,"Quảng Nam","Phục Vụ");
        KySu kySu = new KySu("Nguyễn Văn D",  1982,true,"Quảng Nam","Xây dựng");
        CongNhan congNhan = new CongNhan("Nguyễn Văn C",  1988,true,"Quảng Nam",2);
        canBos[0] = nhanVien;
        canBos[1] = kySu;
        canBos[2] = congNhan;
        byte choice;
        do{
            System.out.println("Menu Quản lý cán bộ.\n" +
                    "1.Thêm mới cán bộ\n" +
                    "2.Tìm kiếm theo họ tên\n" +
                    "3.Hiển thị danh sách cán bộ\n" +
                    "4.Sắp xếp danh sách theo tên\n" +
                    "0.Thoát khỏi chương trình\n");
            System.out.print("Lựa chọn của bạn:");
            choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case ADD:quanLyCanBo.themCanBo(canBos);break;
                case SEARCH:quanLyCanBo.search(canBos);break;
                case SHOW:quanLyCanBo.show(canBos);break;
                case SORT:
                    Arrays.sort(canBos,quanLyCanBo);
                case EXIT:break;
            }
        }while (choice!=0);
    }
}

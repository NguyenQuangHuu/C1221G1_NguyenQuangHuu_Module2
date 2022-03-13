package bai_tap_file_io_anh_chanh.controllers;


import bai_tap_file_io_anh_chanh.services.impl.VehicleImpl;




import java.util.Scanner;

public class VehicleController {
    public  void display() {

        VehicleImpl vehicle = new VehicleImpl();

        final int ADD = 1;
        final int SHOW = 2;
        final int DELETE = 3;
        final int EXIT = 4;
        Scanner  sc  = new Scanner(System.in);
        short choice;
        do{
            System.out.println("\tCHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("\t\tChọn chức năng: \n" +
                    "\t\t1. Thêm mới phương tiện.\n" +
                    "\t\t2. Hiển thị phương tiện.\n" +
                    "\t\t3. Xóa phương tiện.\n" +
                    "\t\t4. Thoát");
            System.out.print("\tLựa chọn của bạn: ");
            choice = Short.parseShort(sc.nextLine());
            switch (choice){
                case ADD:vehicle.add();break;
                case SHOW:vehicle.show();break;
                case DELETE:vehicle.delete();break;
                case EXIT:break;

            }
        }while (choice!=4);
    }
}

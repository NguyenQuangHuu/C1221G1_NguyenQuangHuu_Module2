package bai_tap_oop;

import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {




        VehicleImpl vehicleImpl = new VehicleImpl();

        Motorbike[] motorbikes = vehicleImpl.motorbikes;
        Motorbike motorbike = new Motorbike("43C1-251.39","Yamaha",2012,"Nguyễn Quang Hữu",125);
        motorbikes[0] = motorbike;
        Car[] cars = vehicleImpl.cars;
        Truck[] trucks = vehicleImpl.trucks;
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
                case ADD:vehicleImpl.add();break;
                case SHOW:vehicleImpl.show();break;
                case DELETE:vehicleImpl.delete();break;
                case EXIT:break;

            }
        }while (choice!=4);
    }
}

package bai_tap_oop_cua_anh_chanh.controllers;

import bai_tap_oop_cua_anh_chanh.models.Car;
import bai_tap_oop_cua_anh_chanh.models.Motorbike;
import bai_tap_oop_cua_anh_chanh.models.Truck;
import bai_tap_oop_cua_anh_chanh.services.impl.VehicleImpl;

import java.util.Scanner;

public class VehicleController {
    public  void display() {

        VehicleImpl vehicleImpl = new VehicleImpl();

        Motorbike[] motorbikes = vehicleImpl.motorbikes;
        Motorbike motorbike = new Motorbike("43C1-251.39","Yamaha",2012,"Nguyễn Quang Hữu",125);
        motorbikes[0] = motorbike;
        Car[] cars = vehicleImpl.cars;
        Car car = new Car("43B-453.88","Huyndai",2020,"Nguyễn Văn B",9,"Xe khách");
        cars[0] = car;
        Truck[] trucks = vehicleImpl.trucks;
        Truck truck = new Truck("43C-47.678","Dongfeng",2020,"Nguyễn Văn C",9);
        trucks[0] = truck;
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

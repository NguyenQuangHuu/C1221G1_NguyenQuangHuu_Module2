package bai_tap_oop_cua_anh_chanh.services.impl;

import bai_tap_oop_cua_anh_chanh.models.Car;
import bai_tap_oop_cua_anh_chanh.models.Manufacturer;
import bai_tap_oop_cua_anh_chanh.models.Motorbike;
import bai_tap_oop_cua_anh_chanh.models.Truck;
import bai_tap_oop_cua_anh_chanh.services.IVehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleImpl implements IVehicle {

    public Motorbike[] motorbikes = new Motorbike[20];
    public Car[] cars = new Car[20];
    public Truck[] trucks = new Truck[20];

    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập phương tiện muốn khai báo:\n" +
                "1. Xe máy\n" +
                "2. Ô tô\n" +
                "3. Xe Tải\n" +
                "0. Thoát chức năng này."
        );
        System.out.print("Lựa chọn của bạn: ");
        int select = Integer.parseInt(sc.nextLine());
        if (select < 0 || select > 3) {
            System.out.println("Vui lòng chọn số theo mẫu hướng dẫn");
        } else {
            input(select);
        }

    }

    public String manufacturerChoose(int index) {
        ArrayList<Manufacturer> manufacturers = new ArrayList<>();

        Manufacturer manufacturer = new Manufacturer("HSX-001", "Yamaha", "Nhật Bản");
        Manufacturer manufacturer1 = new Manufacturer("HSX-002", "Honda", "Nhật Bản");
        Manufacturer manufacturer2 = new Manufacturer("HSX-003", "Dongfeng", "Trung Quốc");
        Manufacturer manufacturer3 = new Manufacturer("HSX-004", "Huyndai", "Hàn Quốc");
        Manufacturer manufacturer4 = new Manufacturer("HSX-005", "Ford", "Mỹ");
        Manufacturer manufacturer5 = new Manufacturer("HSX-006", "Toyota", "Nhật Bản");
        Manufacturer manufacturer6 = new Manufacturer("HSX-007", "Hino", "Nhật Bản");
        manufacturers.add(manufacturer);
        manufacturers.add(manufacturer1);
        manufacturers.add(manufacturer2);
        manufacturers.add(manufacturer3);
        manufacturers.add(manufacturer4);
        manufacturers.add(manufacturer5);
        manufacturers.add(manufacturer6);

        return manufacturers.get(index - 1).getManufacturerName();
    }


    public void input(int choice) {

        final int MOTORBIKE = 1;
        final int CAR = 2;
        final int TRUCK = 3;
        System.out.println("Nhập biển số xe");
        String numberPlate = sc.nextLine();
        System.out.println("Chọn hãng sản xuất\n" +
                "1.Yamaha\n" +
                "2.Honda\n" +
                "3.Dongfeng\n" +
                "4.Huyndai\n" +
                "5.Ford\n" +
                "6.Toyota\n" +
                "7.Hino\n");
        int index = Integer.parseInt(sc.nextLine());
        String maker = manufacturerChoose(index);
        System.out.println("Nhập năm sản xuất");
        int manufacturingDate = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chủ sở hữu");
        String ownerName = sc.nextLine();
        switch (choice) {
            case MOTORBIKE:
                System.out.println("Nhập công suất xe:");
                int capacity = Integer.parseInt(sc.nextLine());
                Motorbike motorbike = new Motorbike(numberPlate, maker, manufacturingDate, ownerName, capacity);
                for (int i = 0; i < motorbikes.length; i++) {
                    if (motorbikes[i] == null) {
                        motorbikes[i] = motorbike;
                        break;
                    }
                }
                break;
            case CAR:
                System.out.println("Nhập số chỗ ngồi của xe");
                int numberCapacity = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập kiểu xe (Du lịch / Xe khách)");
                String model = sc.nextLine();
                Car car = new Car(numberPlate, maker, manufacturingDate, ownerName, numberCapacity, model);
                for (int i = 0; i < cars.length; i++) {
                    if (cars[i] == null) {
                        cars[i] = car;
                        break;
                    }
                }
                break;
            case TRUCK:
                System.out.println("Nhập trọng tải của xe tải");
                int loadTruck = Integer.parseInt(sc.nextLine());
                Truck truck = new Truck(numberPlate, maker, manufacturingDate, ownerName, loadTruck);
                for (int i = 0; i < trucks.length; i++) {
                    if (trucks[i] == null) {
                        trucks[i] = truck;
                        break;
                    }
                }
                break;
        }

    }

    @Override
    public void show() {
        System.out.println("Nhập loại phương tiện bạn muốn hiển thị\n" +
                "1. Xe máy\n" +
                "2. Ô tô\n" +
                "3. Xe tải\n" +
                "4. Thoát chức năng này\n");
        int choose = Integer.parseInt(sc.nextLine());

        switch (choose) {
            case 1:
                for (Motorbike motobike : motorbikes
                ) {
                    if (motobike instanceof Motorbike) {
                        System.out.println(motobike);
                    }

                }
                ;
                break;
            case 2:
                for (Car car : cars
                ) {
                    if (car instanceof Car) {
                        System.out.println(car);
                    }

                }
                ;
                break;
            case 3:
                for (Truck truck : trucks
                ) {
                    if (truck instanceof Truck) {
                        System.out.println(truck);
                    }
                }
                ;
                break;
            case 4:
                break;
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập vào biển kiểm soát bạn muốn xóa\n");
        String numberPlate = sc.nextLine();
        boolean checking = false;
        // Duyệt mảng motobikes
        for (int i = 0; i < motorbikes.length; i++) {
            if (motorbikes[i] instanceof Motorbike) {
                if (motorbikes[i].getNumberPlate().equals(numberPlate)) {
                    checking = true;
                    System.out.println("Bạn xác nhận muốn xóa phương tiện này ?\n" +
                            "Nhập OK để xác nhận hoặc NO để hủy đi việc xóa");
                    String confirm = sc.nextLine();
                    if (confirm.equals("OK")) {
//                    motorbikes[i] = null;
                        for (int k = i; k < motorbikes.length - 1; k++) {
                            motorbikes[k] = motorbikes[k + 1];
                        }
                        motorbikes[motorbikes.length - 1] = null;
                        System.out.println("Xóa thành công");
                    } else if (confirm.equals("NO")) {
                        break;
                    } else {
                        System.out.println("Sai cú pháp vui lòng thử lại");
                        break;
                    }
                }
            }

        }

        // Duyệt mảng cars
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] instanceof Car) {
                if (cars[i].getNumberPlate().equals(numberPlate)) {
                    checking = true;
                    System.out.println("Bạn xác nhận muốn xóa phương tiện này ?\n" +
                            "Nhập OK để xác nhận hoặc NO để hủy đi việc xóa");
                    String confirm = sc.nextLine();
                    if (confirm.equals("OK")) {
//                        cars[i] = null;
                        for (int k = i; k < cars.length - 1; k++) {
                            cars[k] = cars[k + 1];
                        }
                        cars[cars.length - 1] = null;
                        System.out.println("Xóa thành công");
                    } else if (confirm.equals("NO")) {
                        break;
                    } else {
                        System.out.println("Sai cú pháp vui lòng thử lại");
                        break;
                    }
                }
            }

        }

        // Duyệt mảng motobikes
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i] instanceof Truck) {
                if (trucks[i].getNumberPlate().equals(numberPlate)) {
                    checking = true;
                    System.out.println("Bạn xác nhận muốn xóa phương tiện này ?\n" +
                            "Nhập OK để xác nhận hoặc NO để hủy đi việc xóa");
                    String confirm = sc.nextLine();
                    if (confirm.equals("OK")) {
//                        trucks[i] = null;
                        for (int k = i; k < trucks.length - 1; k++) {
                            trucks[k] = trucks[k + 1];

                        }
                        trucks[trucks.length - 1] = null;
                        System.out.println("Xóa thành công");
                    } else if (confirm.equals("NO")) {
                        break;
                    } else {
                        System.out.println("Sai cú pháp vui lòng thử lại");
                        break;
                    }
                }
            }

        }

        if (!checking) {
            System.out.println("Không tồn tại biển kiểm soát này");
        }
    }
}

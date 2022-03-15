package bai_tap_file_io_anh_chanh.services.impl;

import bai_tap_file_io_anh_chanh.models.*;
import bai_tap_file_io_anh_chanh.services.IVehicle;
import bai_tap_file_io_anh_chanh.utils.NotFoundVehicleException;
import bai_tap_file_io_anh_chanh.utils.ReadAndWriteFile;
import bai_tap_file_io_anh_chanh.utils.Validate;

import java.util.*;

public class VehicleImpl implements IVehicle {
    Validate validate = new Validate();
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    final String MOTORBIKES_LIST = "src\\bai_tap_file_io_anh_chanh\\data\\motorbike.csv";
    final String CARS_LIST = "src\\bai_tap_file_io_anh_chanh\\data\\cars.csv";
    final String TRUCKS_LIST = "src\\bai_tap_file_io_anh_chanh\\data\\trucks.csv";
    public List<Motorbike> motorbikes = readAndWriteFile.readFileMotorbikes(MOTORBIKES_LIST);
    public List<Car> cars = readAndWriteFile.readFileCars(CARS_LIST);
    public List<Truck> trucks = readAndWriteFile.readFileTrucks(TRUCKS_LIST);

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

        List<CarType> carTypes = new ArrayList<>();
        carTypes.add(new CarType("Xe Khách"));
        carTypes.add(new CarType("Xe Du Lịch"));

        final int MOTORBIKE = 1;
        final int CAR = 2;
        final int TRUCK = 3;

        System.out.println("Nhập chủ sở hữu");
        String ownerName = sc.nextLine();
        System.out.print("Chọn hãng sản xuất\n" +
                "1.Yamaha\n" +
                "2.Honda\n" +
                "3.Dongfeng\n" +
                "4.Huyndai\n" +
                "5.Ford\n" +
                "6.Toyota\n" +
                "7.Hino\n" +
                "Lựa chọn của bạn:");
//        int index = 0;
//        try{
//            index = Integer.parseInt(sc.nextLine());
//        }catch (NumberFormatException e){
//            System.out.println("Vui lòng nhập số theo danh sách phía trên");
//            System.out.println("Nhập lại");
//            index = Integer.parseInt(sc.nextLine());
//        }
        int index = Integer.parseInt(sc.nextLine());

        String maker = manufacturerChoose(index);
        System.out.println("Nhập năm sản xuất");
        int manufacturingDate = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case MOTORBIKE:
                System.out.println("Nhập công suất xe:");
                int capacity = Integer.parseInt(sc.nextLine());
                String numberPlateMotorbike;
                boolean motorbikePlateChecking;
                boolean checkMotorbikeNumberPlate;
                do {
                    System.out.println("Nhập biển số xe");
                    numberPlateMotorbike = sc.nextLine();
                    checkMotorbikeNumberPlate = this.checkExistNumberPlate(numberPlateMotorbike);
                    motorbikePlateChecking = validate.numberPlateMotorbikeValidate(numberPlateMotorbike);
                    //Kiểm tra khi biển số hợp lệ
                    if(motorbikePlateChecking){
                        //kiểm tra sự tồn tại của biển số
                        if(checkMotorbikeNumberPlate){
                            System.out.println("Biển số xe này đã tồn tại! vui lòng nhập lại");
                        }
                    }else{
                        try{
                            throw new NotFoundVehicleException("Không tồn tại biển kiểm soát này");
                        }catch(NotFoundVehicleException e){
                            System.out.println(e.getMessage());
                            System.out.println("Vui lòng nhập lại");
                        }
                    }
                } while (!motorbikePlateChecking || checkMotorbikeNumberPlate);
                Motorbike motorbike = new Motorbike(numberPlateMotorbike, maker, manufacturingDate, ownerName, capacity);
                motorbikes.add(motorbike);
                readAndWriteFile.writeFile(MOTORBIKES_LIST, motorbikes, false);
                System.out.println("Thêm thành công. Nhấn Enter để quay lại menu chính");
                String enter = sc.nextLine();
                do{
                    if(enter.equals("")){
                        break;
                    }else{
                        System.out.print("Không tìm được phím enter à bro! Nhập lại đi");
                    }
                }while (true);
            case CAR:
                System.out.println("Nhập kiểu xe");
                for (int i = 0; i < carTypes.size(); i++) {
                    System.out.println((i + 1) + " " + carTypes.get(i));
                }
                int model = Integer.parseInt(sc.nextLine());
                String numberPlateCar;
                boolean carPlateChecking;

                System.out.println("Nhập số chỗ ngồi của xe");
                int numberCapacity = Integer.parseInt(sc.nextLine());
                boolean checkExist;
                do {
                    System.out.println("Nhập biển số xe");
                    numberPlateCar = sc.nextLine();
                    carPlateChecking = validate.numberPlateCarValidate(numberPlateCar,carTypes.get(model - 1).toString());
                    checkExist = this.checkExistNumberPlate(numberPlateCar);
                    if(carPlateChecking){
                        if(checkExist){
                            System.out.println("Đã tồn tại biển số xe này");
                        }
                    }else{
                            try{
                                throw new NotFoundVehicleException("Không tồn tại biển kiểm soát này");
                            }catch(NotFoundVehicleException e){
                                System.out.println(e.getMessage());
                                System.out.println("Vui lòng nhập lại");
                            }

                    }

                } while (!carPlateChecking || checkExist);
                Car car = new Car(numberPlateCar, maker, manufacturingDate, ownerName, numberCapacity, carTypes.get(model - 1).toString());
                cars.add(car);
                readAndWriteFile.writeFile(CARS_LIST, cars, false);
                System.out.println("Thêm thành công. Nhấn Enter để quay lại menu chính");
                String enter1 = sc.nextLine();
                do{
                    if(enter1.equals("")){
                        break;
                    }else{
                        System.out.print("Không tìm được phím enter à bro! Nhập lại đi");
                    }
                }while (true);
            case TRUCK:
                System.out.println("Nhập trọng tải của xe tải");
                int loadTruck = Integer.parseInt(sc.nextLine());
                String numberPlateTruck;
                boolean truckPlateChecking;
                boolean truckExist;
                do {
                    System.out.println("Nhập biển số xe");
                    numberPlateTruck = sc.nextLine();

                        truckPlateChecking = validate.numberPlateTruckValidate(numberPlateTruck);
                        truckExist = this.checkExistNumberPlate(numberPlateTruck);
                    if (truckPlateChecking) {
                        if(truckExist){
                            System.out.println("Đã tồn tại biển số");
                        }
                    }else {
                            try{
                                throw new NotFoundVehicleException("Biển kiểm soát không tồn tại");
                            }catch(NotFoundVehicleException e){
                                System.out.println(e.getMessage());
                                System.out.println("Vui lòng nhập lại");

                            }
                    }

                } while (!truckPlateChecking);
                Truck truck = new Truck(numberPlateTruck, maker, manufacturingDate, ownerName, loadTruck);
                trucks.add(truck);
                readAndWriteFile.writeFile(TRUCKS_LIST, trucks, false);
                System.out.println("Thêm thành công. Nhấn Enter để quay lại menu chính");
                String enter2 = sc.nextLine();
                do{
                    if(enter2.equals("")){
                        break;
                    }else{
                        System.out.print("Không tìm được phím enter à bro! Nhập lại đi");
                    }
                }while (true);
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
                for (Motorbike motorbike : motorbikes
                ) {
                    if (motorbike != null) {
                        System.out.println(motorbike);
                    }

                }
                break;
            case 2:
                for (Car car : cars
                ) {
                    if (car != null) {
                        System.out.println(car);
                    }

                }
                break;
            case 3:
                for (Truck truck : trucks
                ) {
                    if (truck != null) {
                        System.out.println(truck);
                    }
                }
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

        for (int i = 0; i < motorbikes.size(); i++) {

                if (motorbikes.get(i).getNumberPlate().equals(numberPlate)) {
                    Motorbike currentObjectMotorbike = motorbikes.get(i);
                    checking = true;
                    System.out.println("Bạn xác nhận muốn xóa phương tiện này ?\n" +
                            "Nhập OK để xác nhận hoặc NO để hủy đi việc xóa");
                    String confirm;

                    do{
                        confirm = sc.nextLine();
                        if ("OK".equals(confirm)) {
                            motorbikes.remove(currentObjectMotorbike);
                            System.out.println("Xóa thành công");
                            readAndWriteFile.writeFile(MOTORBIKES_LIST,motorbikes,false);
                            System.out.println("Nhấn Enter để quay về màn hình chính");
                            sc.nextLine();

                        } else if ("NO".equals(confirm)) {
                            System.out.println("Đã hủy thao tác xóa");
                            break;
                        }else{
                            System.out.println("Sai cú pháp vui lòng thử lại");
                        }
                    }while (!confirm.equals("OK"));
                }
        }

        for (int i = 0; i < cars.size(); i++) {

                if (cars.get(i).getNumberPlate().equals(numberPlate)) {
                    Car currentObjectCar = cars.get(i);
                    checking = true;
                    System.out.println("Bạn xác nhận muốn xóa phương tiện này ?\n" +
                            "Nhập OK để xác nhận hoặc NO để hủy đi việc xóa");
                    String confirm;

                    do{
                        confirm = sc.nextLine();
                        if ("OK".equals(confirm)) {
                            cars.remove(currentObjectCar);
                            System.out.println("Xóa thành công");
                            readAndWriteFile.writeFile(CARS_LIST,cars,false);
                            System.out.println("Nhấn Enter để quay về màn hình chính");
                            sc.nextLine();

                        } else if ("NO".equals(confirm)) {
                            System.out.println("Đã hủy thao tác xóa");
                            break;
                        }else{
                            System.out.println("Sai cú pháp vui lòng thử lại");
                        }
                    }while (!confirm.equals("OK"));
                }
        }

        for (int i = 0; i < trucks.size(); i++) {

                if (trucks.get(i).getNumberPlate().equals(numberPlate)) {
                    Truck currentObject = trucks.get(i);
                    checking = true;
                    System.out.println("Bạn xác nhận muốn xóa phương tiện này ?\n" +
                            "Nhập OK để xác nhận hoặc NO để hủy đi việc xóa");

                    String confirm;

                    do{
                        confirm = sc.nextLine();
                        if ("OK".equals(confirm)) {
                            trucks.remove(currentObject);
                            System.out.println("Xóa thành công");
                            readAndWriteFile.writeFile(TRUCKS_LIST,trucks,false);
                            System.out.println("Nhấn Enter để quay về màn hình chính");
                            sc.nextLine();

                        } else if ("NO".equals(confirm)) {
                            System.out.println("Đã hủy thao tác xóa");
                            break;
                        }else{
                            System.out.println("Sai cú pháp vui lòng thử lại");
                        }
                    }while (!confirm.equals("OK"));
                }
        }
        if (!checking) {
            System.out.println("Không tồn tại biển kiểm soát này");
        }
    }

    public boolean checkExistNumberPlate(String numberPlate){
        boolean checkExist = false;
        for (Motorbike motorbike:motorbikes) {
            if(motorbike.getNumberPlate().equals(numberPlate)){
                checkExist = true;
            }
        }
        for (Car car:cars) {
            if(car.getNumberPlate().equals(numberPlate)){
                checkExist = true;
            }
        }
        for (Truck truck:trucks) {
            if(truck.getNumberPlate().equals(numberPlate)){
                checkExist = true;
            }
        }

        return checkExist;
    }
}

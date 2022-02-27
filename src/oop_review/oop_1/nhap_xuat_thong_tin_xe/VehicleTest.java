package oop_review.oop_1.nhap_xuat_thong_tin_xe;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class VehicleTest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("43C1-251.39",110,20000000);
        Vehicle vehicle2 = new Vehicle("43R1-379.78",120,80000000);
        Vehicle vehicle3 = new Vehicle("43R2-2913",100,40000000);
        Vehicle vehicle4 = new Vehicle("43K3-5099",95,30000000);
        Vehicle vehicle5 = new Vehicle("43C3-333.33",210,10000000000.0);
        Vehicle vehicle6 = new Vehicle("43C9-999.99",300,30000000000.0);

        Vehicle[] listVehicle = new Vehicle[100];
        listVehicle[0] = vehicle1;
        listVehicle[1] = vehicle2;
        listVehicle[2] = vehicle3;
        listVehicle[3] = vehicle4;
        listVehicle[4] = vehicle5;
        listVehicle[5] = vehicle6;

        int choice;
        final int ADD_NEW_VEHICLE = 1;
        final int REGISTRATION_FEE = 2;
        final int EXIT = 0;
        do{
            System.out.println("Main menu.\n" +
                    "1.\tTạo các đối tượng xe và nhập thông tin.\n" +
                    "2.\tXuất bảng kê khai tiền thuế của các xe.\n" +
                    "0.\tThoát.\n");
            System.out.print("Nhập vào lựa chọn của bạn:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case ADD_NEW_VEHICLE:addNewVehicle(listVehicle);break;
                case REGISTRATION_FEE:
                    getRegistrationFee(listVehicle);break;
                case EXIT:
            }
        }while (choice!=0);

    }

    public static void addNewVehicle(Vehicle[] vehicles){
        System.out.println("Nhập biển kiểm soát");
        String numberPlate = sc.nextLine();
        System.out.println("Nhập dung tích xi linh của phương tiện");
        int cubicCapacity = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá trị của phương tiện");
        double price = Double.parseDouble(sc.nextLine());
        Vehicle vehicle = new Vehicle(numberPlate,cubicCapacity,price);
        for(int i = 0; i<vehicles.length;i++){
            if(vehicles[i]==null){
                vehicles[i] = vehicle;
                break;
            }
        }
    }


    public static void getRegistrationFee(Vehicle[] vehicles){
        NumberFormat numberFormat = new DecimalFormat("#0.00");
        double registrationFee;
        for(Vehicle vehicle:vehicles){
            if(vehicle instanceof Vehicle){
                if(vehicle.getCubicCapacity()<100){
                    registrationFee = vehicle.getPrice() * 0.01;
                }else if(vehicle.getCubicCapacity() <200){
                    registrationFee = vehicle.getPrice() * 0.03;
                }else {registrationFee = vehicle.getPrice() * 0.05;}
                System.out.println(vehicle.getNumberPlate()+" có phí trước bạ : "+numberFormat.format(registrationFee));
            }

        }

    }

}

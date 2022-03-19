package case_study_module2.controllers;

import case_study_module2.models.Booking;
import case_study_module2.models.enums.RentType;
import case_study_module2.models.facility.Facility;
import case_study_module2.models.person.Customer;
import case_study_module2.services.impl.FacilityServiceImpl;
import case_study_module2.utils.ReadAndWriteFile;
import case_study_module2.utils.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingController {

    protected String idBooking;
    protected String startDay;
    protected String endDay;
    protected String customerId;
    protected String serviceName;
    protected RentType rentType;

    final String CUSTOMERS_FILE = "src\\case_study_module2\\data\\customers.csv";

    Validate validate = new Validate();

    Scanner sc = new Scanner(System.in);
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    List<Customer> customerList = readAndWriteFile.readFileCustomer(CUSTOMERS_FILE);
    List<Facility> facilities =  new FacilityServiceImpl().facilityArrayList;

    public Booking addBooking(){
        this.idBooking = idBookingInput();
        this.startDay = startDayInput();
        this.endDay = endDayInput();
        this.customerId = customerIdInput();
        this.serviceName = serviceNameInput();
        this.rentType = rentTypeInput();
        return new Booking(idBooking,startDay,endDay,customerId,serviceName,rentType);
    }

    public String idBookingInput(){
        System.out.print("Enter booking Id: ");
        return sc.nextLine();
    }

    public String startDayInput(){
        System.out.print("Enter start day rent with format dd/MM/yyyy : ");
        String startDay = sc.nextLine();
        while (!validate.validateDate(startDay)){
            System.out.print("Wrong input format day! Re-type: ");
            startDay = sc.nextLine();
        }
        return startDay;
    }

    public String endDayInput(){
        System.out.print("Enter end day rent with format dd/MM/yyyy : ");
        String endDay = sc.nextLine();
        while (!validate.validateDate(endDay)){
            System.out.print("Wrong input format day! Re-type: ");
            endDay = sc.nextLine();
        }
        return endDay;
    }


    public String customerIdInput(){
        customerList.forEach(System.out::println);
        System.out.println("Enter customer id");
        String customerId = sc.nextLine();

        return sc.nextLine();
    }


    public String serviceNameInput(){
        facilities.forEach(System.out::println);
        System.out.print("Enter service name: ");
        String serviceName = sc.nextLine();
        String result =null;
        boolean check = false;
        for (Facility facility : facilities) {
            if (facility.getServiceName().equals(serviceName)) {
                result = serviceName;
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("No exist your result");
        }
        return result;
    }

    public RentType rentTypeInput(){
        for (int i = 0; i < RentType.values().length; i++) {
            System.out.println(i + ""+RentType.values()[i]);
        }
        System.out.print("Enter your choice:");
        int index = Integer.parseInt(sc.nextLine());
        return RentType.values()[index];
    }

    public List<String> writeBookingToCSV(List<Booking> bookings){
        List<String> stringList = new ArrayList<>();
        for (Booking booking:
             bookings) {
            stringList.add(booking.bookingToString());
        }
        return stringList;
    }


    public void displayBooking(List<Booking> bookingList){
        System.out.println("Booking List");
        bookingList.forEach(System.out::println);
    }

}

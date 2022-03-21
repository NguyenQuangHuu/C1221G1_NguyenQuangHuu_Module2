package case_study_module2.controllers;

import case_study_module2.models.Booking;
import case_study_module2.models.enums.RentType;
import case_study_module2.models.facility.Facility;
import case_study_module2.models.person.Customer;
import case_study_module2.services.impl.FacilityServiceImpl;
import case_study_module2.utils.BookingComparator;
import case_study_module2.utils.ReadAndWriteFile;
import case_study_module2.utils.Validate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingController {

    protected int idBooking;
    protected String startDay;
    protected String endDay;
    protected Customer customerId;
    protected Facility serviceName;
    protected RentType rentType;

    final String CUSTOMERS_FILE = "src\\case_study_module2\\data\\customers.csv";

    Validate validate = new Validate();

    Scanner sc = new Scanner(System.in);
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    List<Customer> customerList = readAndWriteFile.readFileCustomer(CUSTOMERS_FILE);
    Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    public Booking addBooking(){
        this.idBooking = idBookingInput(bookingSet);
        this.startDay = startDayInput();
        this.endDay = endDayInput();
        this.customerId = customerIdInput();
        this.serviceName = serviceNameInput();
        this.rentType = rentTypeInput();
        return new Booking(idBooking,startDay,endDay,customerId,serviceName,rentType);

    }

    public int idBookingInput(Set<Booking> set){
        int id = 1;
        if(!set.isEmpty()){
            id = set.size();
        }
        return id;
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

        while (!validate.validateDate(endDay) ){
            System.out.print("Wrong input format day! Re-type: ");
            endDay = sc.nextLine();
        }
        return endDay;
    }


    public Customer customerIdInput(){
        customerList.forEach(System.out::println);
        System.out.println("Enter customer id");
        String customerId = sc.nextLine();
        boolean check = false;
        Customer customerResult = null;
        while(!check){
            while("".equals(customerId)){
                System.out.println("Please do not skip this field");
                customerId = sc.nextLine();
            }
            for (Customer customer:
                 customerList) {
                if(customerId.equals(customer.getId())){
                    customerResult = customer;
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println("NO exist! Please Re-type");
                customerId = sc.nextLine();
            }
        }

        return customerResult;
    }


    public Facility serviceNameInput(){
        System.out.println("Facility List:");

        for (Facility facility:
             readAndWriteFile.readFileVilla("src\\case_study_module2\\data\\villas.csv")) {
            facilityIntegerMap.put(facility,1);
        }

        for(Map.Entry<Facility,Integer> facility : facilityIntegerMap.entrySet()){
            System.out.println(facility.getKey().toString());
        }

        System.out.print("Enter facility name: ");
        String serviceName = sc.nextLine();

        boolean check = false;
        Facility facilityResult = null;
        while(!check){
            while("".equals(serviceName)){
                System.out.println("Please do not skip this field");
                serviceName = sc.nextLine();
            }
            for(Map.Entry<Facility,Integer> facility : facilityIntegerMap.entrySet()){
                if (facility.getKey().getServiceName().equals(serviceName)) {
                    check = true;
                    facilityResult = facility.getKey();
                }
            }

            if(!check){
                System.out.println("No exist your result");
                serviceName = sc.nextLine();
            }
        }

        return facilityResult;
    }

    public RentType rentTypeInput(){
        for (int i = 0; i < RentType.values().length; i++) {
            System.out.println(i + ""+RentType.values()[i]);
        }
        System.out.print("Enter your choice:");
        int index = Integer.parseInt(sc.nextLine());
        return RentType.values()[index];
    }

    public Set<String> writeBookingToCSV(Set<Booking> bookings){
        Set<String> stringList = new TreeSet<>();
        for (Booking booking:
             bookings) {
            stringList.add(booking.bookingToString());
        }
        return stringList;
    }


    public void displayBooking(Set<Booking> bookingSet){
        System.out.println("Booking List");

        bookingSet.forEach(System.out::println);
    }

}

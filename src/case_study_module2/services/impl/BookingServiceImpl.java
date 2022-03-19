package case_study_module2.services.impl;

import case_study_module2.controllers.BookingController;
import case_study_module2.models.Booking;
import case_study_module2.models.enums.RentType;
import case_study_module2.models.facility.Facility;
import case_study_module2.models.person.Customer;
import case_study_module2.services.IBookingService;
import case_study_module2.utils.BookingComparator;
import case_study_module2.utils.ReadAndWriteFile;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    final String BOOKINGS_FILE = "src\\case_study_module2\\data\\bookings.csv";
    Scanner sc = new Scanner(System.in);
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    BookingController bookingController = new BookingController();
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    List<Booking> bookingList = readAndWriteFile.readFileBooking(BOOKINGS_FILE);
    List<Customer> customers = customerService.customerArrayList;
    List<Facility> facilityList = facilityService.facilityArrayList;

    Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();


    @Override
    public void add() {
        bookingList.add(bookingController.addBooking());
        readAndWriteFile.writeFile(BOOKINGS_FILE,bookingController.writeBookingToCSV(bookingList));
//        System.out.println("Booking Id:");
//        String idBooking = sc.nextLine();
//
//        System.out.println("Customer List:");
//        customers.forEach(System.out::println);
//        System.out.println("Customer Id");
//        String id = sc.nextLine();
//        for (Customer customer:
//             customers) {
//            if(customer.getId().equals(id)){
//                id = customer.getId();
//            }
//        }
//
//        System.out.println("List services");
//        facilityList.forEach(System.out::println);
//        System.out.println("Enter service's name");
//        String nameService = sc.nextLine();
//
//        for(Facility facility:facilityList){
//            if(facility.getServiceName().equals(nameService)){
//                nameService = facility.getServiceName();
//            }
//        }
//
//        System.out.println("Type of rents");
//        for (int i = 0; i < RentType.values().length; i++) {
//            System.out.println((i+1)+" "+RentType.values()[i]);
//        }
//
//        System.out.println("Your choice:");
//        int index = Integer.parseInt(sc.nextLine());
//        Booking booking = new Booking(idBooking,"12-12","12-12",id,nameService,RentType.values()[index-1]);
//
//        bookingList.add(booking);
    }

    public void display(){
        bookingController.displayBooking(bookingList);
    }

}

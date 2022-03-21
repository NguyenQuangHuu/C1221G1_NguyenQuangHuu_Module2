package case_study_module2.services.impl;

import case_study_module2.controllers.BookingController;
import case_study_module2.models.Booking;
import case_study_module2.services.IBookingService;
import case_study_module2.utils.BookingComparator;
import case_study_module2.utils.ReadAndWriteFile;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    final String BOOKINGS_FILE = "src\\case_study_module2\\data\\bookings.csv";
    BookingController bookingController = new BookingController();
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    Set<Booking> bookingSet = readAndWriteFile.readFileBooking(BOOKINGS_FILE);

    @Override
    public void add() {
        Booking book = bookingController.addBooking();
        bookingSet.add(book);
        System.out.println("Create new success");
        readAndWriteFile.writeBookingFile(BOOKINGS_FILE,bookingController.writeBookingToCSV(bookingSet));
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
        bookingController.displayBooking(bookingSet);
    }

}

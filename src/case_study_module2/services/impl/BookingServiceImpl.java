package case_study_module2.services.impl;

import case_study_module2.models.Booking;
import case_study_module2.models.enums.RentType;
import case_study_module2.models.facility.Facility;
import case_study_module2.models.person.Customer;
import case_study_module2.services.IBookingService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookingServiceImpl implements IBookingService {
    Scanner sc = new Scanner(System.in);
    List<Booking> bookingList = new ArrayList<>();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    LinkedList<Customer> customers = customerService.customerArrayList;
    static List<Facility> facilities = facilityService.facilityArrayList;


    @Override
    public void add() {
        System.out.println("Booking Id:");
        String idBooking = sc.nextLine();

        System.out.println("Customer List:");
        customers.forEach(System.out::println);
        System.out.println("Customer Id");
        String id = sc.nextLine();


        for (Customer customer:
             customers) {
            if(customer.getId().equals(id)){
                id = customer.getId();
            }
        }

        System.out.println("List services");
        facilities.forEach(System.out::println);
        System.out.println("Enter service's name");
        String nameService = sc.nextLine();

        for(Facility facility:facilities){
            if(facility.getServiceName().equals(nameService)){
                nameService = facility.getServiceName();
            }
        }

        System.out.println("Type of rents");
        for (int i = 0; i < RentType.values().length; i++) {
            System.out.println((i+1)+" "+RentType.values()[i]);
        }

        System.out.println("Your choice:");
        int index = Integer.parseInt(sc.nextLine());
        Booking booking = new Booking(idBooking,"12-12","12-12",id,nameService,RentType.values()[index-1]);

        bookingList.add(booking);
    }

}

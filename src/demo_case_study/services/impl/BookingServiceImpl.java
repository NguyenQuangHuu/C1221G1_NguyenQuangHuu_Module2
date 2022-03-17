package demo_case_study.services.impl;


import demo_case_study.models.Booking;
import demo_case_study.models.facility.Facility;
import demo_case_study.models.facility.TypeOfRent;
import demo_case_study.models.person.Customer;
import demo_case_study.services.IBookingService;

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
    static ArrayList<Facility> facilities = facilityService.facilityArrayList;
    static List<TypeOfRent> typeOfRents = new ArrayList<>();
    static{
        TypeOfRent typeOfRent1 = new TypeOfRent("Hours");
        TypeOfRent typeOfRent2 = new TypeOfRent("Days");
        TypeOfRent typeOfRent3 = new TypeOfRent("Months");
        TypeOfRent typeOfRent4 = new TypeOfRent("Years");
        typeOfRents.add(typeOfRent1);
        typeOfRents.add(typeOfRent2);
        typeOfRents.add(typeOfRent3);
        typeOfRents.add(typeOfRent4);
    }



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
        for (int i = 0; i < typeOfRents.size(); i++) {
            System.out.println((i+1)+" "+typeOfRents.get(i));
        }

        System.out.println("Your choice:");
        int index = Integer.parseInt(sc.nextLine());
        Booking booking = new Booking(idBooking,"12-12","12-12",id,nameService,typeOfRents.get(index-1).getNameType());

        bookingList.add(booking);
    }

    @Override
    public void show() {

    }

    @Override
    public void update() {

    }
}

package demo_case_study.controllers;



import demo_case_study.services.IBookingService;
import demo_case_study.services.ICustomerService;
import demo_case_study.services.IEmployeeService;
import demo_case_study.services.IFacilityService;
import demo_case_study.services.impl.BookingServiceImpl;
import demo_case_study.services.impl.CustomerServiceImpl;
import demo_case_study.services.impl.EmployeeServiceImpl;
import demo_case_study.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);
    IEmployeeService employeeService = new EmployeeServiceImpl();
    ICustomerService customerService = new CustomerServiceImpl();
    IFacilityService facilityService = new FacilityServiceImpl();
    IBookingService bookingService =  new BookingServiceImpl();
    public void displayMainMenu(){
        int choice;
        do{
            System.out.println("Menu.\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:displayEmployeeMenu();break;
                case 2:displayCustomerMenu();break;
                case 3:displayFacilityMenu();break;
                case 4:displayBookingMenu();break;
                case 5:displayPromotionMenu();break;
                case 6:break;
                default:
                    System.out.println("Sai đầu vào");
            }
        }while (choice != 6);

    }

    public void displayEmployeeMenu(){
        int choose;
        do{
            System.out.println("Employee Menu:\n" +
                    "1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4.Return main menu\n"+
                    "Enter your choice");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:employeeService.show();break;
                case 2:employeeService.add();break;
                case 3:employeeService.update();break;
                case 4:break;
            }
        }while(choose!=4);
    }

    public void displayCustomerMenu(){
        int choose;
        do{
            System.out.println("Customer Menu:\n" +
                    "1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.Return main menu\n");
            System.out.println("Enter your choice");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:customerService.show();break;
                case 2:customerService.add();break;
                case 3:customerService.update();break;
                case 4:break;
            }
        }while(choose!=4);
    }

    public void displayFacilityMenu(){
        int choose;
        do{
            System.out.println("Facility Menu.\n" +
                    "1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu\n");
            System.out.println("Enter your choice");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:facilityService.show();break;
                case 2:facilityService.add();break;
                case 3:facilityService.displayMaintenance();break;
                case 4:break;
            }
        }while(choose!=4);
    }

    public void displayBookingMenu(){
        int choose;
        do{
            System.out.println("Booking Menu.\n" +
                    "1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Create new contracts\n" +
                    "4.Display list contracts\n" +
                    "5.Edit contracts\n" +
                    "6.Return main menu\n");
            System.out.println("Enter your choice");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:bookingService.add();break;
                case 2:break;
                case 3:break;
                case 4:break;
                case 5:break;
                case 6:break;
            }
        }while(choose!=6);
    }

    public void displayPromotionMenu(){
        int choose;
        do{
            System.out.println("Promotion Menu.\n" +
                    "1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Return main menu\n");
            System.out.println("Enter your choice");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:break;
                case 2:break;
                case 3:break;
            }
        }while(choose!=3);
    }
}

package case_study_module2.controllers;

import case_study_module2.services.*;
import case_study_module2.services.impl.*;
import case_study_module2.utils.UserException;
import case_study_module2.utils.Validate;

import java.util.Scanner;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);
    Validate validate = new Validate();
    IEmployeeService employeeService = new EmployeeServiceImpl();
    ICustomerService customerService = new CustomerServiceImpl();
    IFacilityService facilityService = new FacilityServiceImpl();
    IBookingService bookingService =  new BookingServiceImpl();
    IContractService contractService = new ContractServiceImpl();
    public void displayMainMenu(){
        int choice = -1;

        do{
            System.out.println("Menu.\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "0.Exit\n");
            System.out.print("Enter your choice: ");
            boolean check = false;
            while(!check || choice<0||choice>5){
                try{
                    choice = Integer.parseInt(sc.nextLine());
                    check = true;
                }catch (NumberFormatException numberFormatException){
                    try {
                        throw new UserException("Do not type character\n" +
                                "Please re-type:");
                    } catch (UserException e) {
                        System.out.print(e.getMessage());
                    }
                }
            }

//            try{
//                choiceNumber = Integer.parseInt(choice);
//            }catch (NumberFormatException numberFormatException){
//                try {
//                    throw new UserException("Please do not type character");
//                } catch (UserException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            while (!validate.positiveNumberValidate(choice) || choiceNumber < 0 || choiceNumber>5){
//                System.out.println("Wrong format! Re-type");
//                choice = sc.nextLine();
//            }

            switch(choice){
                case 1:displayEmployeeMenu();break;
                case 2:displayCustomerMenu();break;
                case 3:displayFacilityMenu();break;
                case 4:displayBookingMenu();break;
                case 5:displayPromotionMenu();break;
                case 0:break;
                default:
                    System.out.print("Wrong input ! Re-Type:");
            }
        }while (true);

    }

    public void displayEmployeeMenu(){
        String chooseEmployee;
        do{
            System.out.println("Employee Menu:\n" +
                    "1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "0.Return main menu\n"+
                    "Enter your choice");
            chooseEmployee = sc.nextLine();
            while (!validate.positiveNumberValidate(chooseEmployee)){
                System.out.println("Wrong input ! Re-Type");
                chooseEmployee = sc.nextLine();
            }
            switch (chooseEmployee){
                case "1":employeeService.show();break;
                case "2":employeeService.add();break;
                case "3":employeeService.update();break;
                case "0":break;
                default:
                    System.out.println("Wrong input ! Re-Type");
            }
        }while(!chooseEmployee.equals("0"));
    }

    public void displayCustomerMenu(){
        String chooseCustomer;
        do{
            System.out.println("Customer Menu:\n" +
                    "1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "0.Return main menu\n");
            System.out.println("Enter your choice");
            chooseCustomer = sc.nextLine();
            while (!validate.positiveNumberValidate(chooseCustomer)){
                System.out.println("Wrong input ! Re-Type");
                chooseCustomer = sc.nextLine();
            }
            switch (chooseCustomer){
                case "1":customerService.show();break;
                case "2":customerService.add();break;
                case "3":customerService.update();break;
                case "0":break;
                default:
                    System.out.println("Wrong input ! Re-Type");
            }
        }while(!chooseCustomer.equals("0"));
    }

    public void displayFacilityMenu(){
        String chooseFacility;
        do{
            System.out.println("Facility Menu.\n" +
                    "1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "0.Return main menu\n");
            System.out.println("Enter your choice");
            chooseFacility = sc.nextLine();
            while (!validate.positiveNumberValidate(chooseFacility)){
                System.out.println("Wrong input ! Re-Type");
                chooseFacility = sc.nextLine();
            }
            switch (chooseFacility){
                case "1":facilityService.show();break;
                case "2":facilityService.add();break;
                case "3":facilityService.displayMaintenance();break;
                case "0":break;
                default:
                    System.out.println("Wrong input ! Re-Type");
            }
        }while(!chooseFacility.equals("0"));
    }

    public void displayBookingMenu(){
        String chooseBooking;
        do{
            System.out.println("Booking Menu.\n" +
                    "1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Create new contracts\n" +
                    "4.Display list contracts\n" +
                    "5.Edit contracts\n" +
                    "0.Return main menu\n");
            System.out.println("Enter your choice");
            chooseBooking = sc.nextLine();
            while (!validate.positiveNumberValidate(chooseBooking) || Integer.parseInt(chooseBooking)<0 || Integer.parseInt(chooseBooking)>5){
                System.out.println("Wrong input ! Re-Type");
                chooseBooking = sc.nextLine();
            }
            switch (chooseBooking){
                case "1":bookingService.add();break;
                case "2":bookingService.display();break;
                case "3":contractService.add();break;
                case "4":contractService.show();break;
                case "5":contractService.update();break;
                case "0":break;

            }
        }while(!chooseBooking.equals("0"));
    }

    public void displayPromotionMenu(){
        String choosePromotion;
        do{
            System.out.println("Promotion Menu.\n" +
                    "1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "0.Return main menu\n");
            System.out.println("Enter your choice");
            choosePromotion = sc.nextLine();
            while (!validate.positiveNumberValidate(choosePromotion)){
                System.out.println("Wrong input ! Re-Type");
                choosePromotion = sc.nextLine();
            }
            switch (choosePromotion){
                case "1":break;
                case "2":break;
                case "0":break;
                default:
                    System.out.println("Wrong input ! Re-Type");
            }
        }while(!choosePromotion.equals("0"));
    }
}

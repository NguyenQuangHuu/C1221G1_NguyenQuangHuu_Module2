package case_study_module2.services.impl;

import case_study_module2.controllers.CustomerController;
import case_study_module2.models.enums.Membership;
import case_study_module2.models.person.Customer;
import case_study_module2.services.ICustomerService;
import case_study_module2.utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    final String CUSTOMERS_FILE = "src\\case_study_module2\\data\\customers.csv";
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    Scanner sc = new Scanner(System.in);
    CustomerController customerController = new CustomerController();
    List<Customer> customerArrayList = customersLinkedList();

    public LinkedList<Customer> customersLinkedList(){
        LinkedList<Customer> customerList = new LinkedList<>();
        customerList = readAndWriteFile.readFileCustomer(CUSTOMERS_FILE);
        return customerList;
    }

    @Override
    public void add() {
        customerArrayList.add(customerController.getCustomerInput());
        readAndWriteFile.writeFile(CUSTOMERS_FILE,customerController.writeCustomerToCSV(customerArrayList));
//        System.out.println("Customer ID");
//        String id = sc.nextLine();
//        System.out.println("Customer's full name:");
//        String fullName = sc.nextLine();
//        System.out.println("Day of birth:");
//        String dob = sc.nextLine();
//        System.out.println("Gender:");
//        String gender = sc.nextLine();
//        System.out.println("Passport ID: ");
//        long idPassport = Long.parseLong(sc.nextLine());
//        System.out.println("Phone Number:");
//        String phoneNumber = sc.nextLine();
//        System.out.println("Email :");
//        String email = sc.nextLine();
//        System.out.println("Type customer:");
//        for (int i = 0; i < Membership.values().length; i++) {
//            System.out.println(i+" : "+Membership.values()[i]);
//        }
//        int choice = Integer.parseInt(sc.nextLine());
//        System.out.println("Address:");
//        String address = sc.nextLine();
//        Customer customer = new Customer(id,fullName,dob,gender,idPassport,phoneNumber,email,Membership.values()[choice],address);
//        customerArrayList.add(customer);
//        customerArrayList.add(new Customer("1","Nguyễn văn B","12/12","Nam",123456,"0987654321","abc@gmail.com",memberships[0],"Việt Nam"));
    }



    @Override
    public void show() {
        System.out.println("Customer List:\n");
        for (int i = 0; i < customerArrayList.size(); i++) {
            System.out.println("No."+i+" : "+customerArrayList.get(i));
        }
    }

    @Override
    public void update() {
        show();
        System.out.println("Customer ID: ");
        String id =  sc.nextLine();
        for(int i = 0 ; i < customerArrayList.size() ; i++){
            if(customerArrayList.get(i).getId().equals(id)){

                Customer customer = customerArrayList.get(i);
                System.out.println("Edit menu:\n" +
                        "1. Full name\n" +
                        "2. Day of birth\n" +
                        "3. Gender\n" +
                        "4. Passport ID\n" +
                        "5. Phone Number\n" +
                        "6. Email\n" +
                        "7. Membership\n" +
                        "8. Address\n" +
                        "0. Exit edit\n" +
                        "Your choice:");
                int choose = Integer.parseInt(sc.nextLine());
                System.out.println("Enter your edit text: ");
                switch (choose){
                    case 1: System.out.println("Enter your edit text: ");
                    customer.setFullName(sc.nextLine());break;
                    case 2: System.out.println("Enter your edit text: ");
                    customer.setDayOfBirth(sc.nextLine());break;
                    case 3: System.out.println("Enter your edit text: ");
                    customer.setGender(customerController.genderInput());break;
                    case 4:
                        System.out.println("Enter your edit text: ");
                        customer.setPassportID(sc.nextLine());
                    case 5:

                        System.out.println("Enter your edit text: ");
                        customer.setPhoneNumber(sc.nextLine());
                        break;
                    case 6: System.out.println("Enter your edit text: ");
                    customer.setEmail(sc.nextLine());break;
                    case 7:
                        for (int j = 0; j <  Membership.values().length; j++) {
                            System.out.println(Membership.values()[i]);
                        }
                        System.out.println("Your choice");
                        customer.setTypeMembership(Membership.values()[Integer.parseInt(sc.nextLine())]);
                    case 8: customer.setAddress(sc.nextLine());
                    case 0:break;
                    default:
                        System.out.println("Wrong input");
                }
            }
        }
        readAndWriteFile.writeFile(CUSTOMERS_FILE,customerController.writeCustomerToCSV(customerArrayList));
    }
}

package demo_case_study.services.impl;


import demo_case_study.models.person.Customer;
import demo_case_study.models.person.Membership;
import demo_case_study.services.ICustomerService;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {

    Scanner sc = new Scanner(System.in);

    static Membership[] memberships = {new Membership("DIAMOND"),
            new Membership("PLATINUM"),
            new Membership("GOLD"),
            new Membership("SILVER"),
            new Membership("MEMBER")};

    LinkedList<Customer> customerArrayList = new LinkedList<>();

    @Override
    public void add() {
        System.out.println("Customer ID");
        String id = sc.nextLine();
        System.out.println("Customer's full name:");
        String fullName = sc.nextLine();
        System.out.println("Day of birth:");
        String dob = sc.nextLine();
        System.out.println("Gender:");
        String gender = sc.nextLine();
        System.out.println("Passport ID: ");
        long idPassport = Long.parseLong(sc.nextLine());
        System.out.println("Phone Number:");
        String phoneNumber = sc.nextLine();
        System.out.println("Email :");
        String email = sc.nextLine();
        System.out.println("Type customer:");
        for (int i = 0; i < memberships.length; i++) {
            System.out.println(i+" : "+memberships[i]);
        }
        Membership membership = memberships[Integer.parseInt(sc.nextLine())];
        System.out.println("Address:");
        String address = sc.nextLine();
        Customer customer = new Customer(id,fullName,dob,gender,idPassport,phoneNumber,email,membership,address);
        customerArrayList.add(customer);
//        customerArrayList.add(new Customer("1","Nguyễn văn B","12/12","Nam",123456,"0987654321","abc@gmail.com",memberships[0],"Việt Nam"));
    }



    @Override
    public void show() {
        System.out.println("Customer List:\n");
        for (int i = 0; i < customerArrayList.size(); i++) {
            System.out.println(i+""+customerArrayList.get(i));
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
                    case 1: customer.setFullName(sc.nextLine());break;
                    case 2: customer.setDayOfBirth(sc.nextLine());break;
                    case 3: customer.setGender(sc.nextLine());break;
                    case 4:
                        customer.setPassportID(Long.parseLong(sc.nextLine()));
                    case 5:
//                        for (int j = 0; j < positionArrayList.size(); j++) {
//                            System.out.println(j+" : "+positionArrayList.get(j).getPosition());
//                        };
//                        employees.get(i).setWorkPosition(positionArrayList.get(Integer.parseInt(sc.nextLine())));
                        customer.setPhoneNumber(sc.nextLine());
                        break;
                    case 6: customer.setEmail(sc.nextLine());break;
                    case 7: customer.setTypeMembership(memberships[Integer.parseInt(sc.nextLine())]);
                    case 8: customer.setAddress(sc.nextLine());
                    case 0:break;
                    default:
                        System.out.println("Wrong input");
                }
            }
        }
    }
}

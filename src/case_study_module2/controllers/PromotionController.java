package case_study_module2.controllers;

import case_study_module2.models.Booking;
import case_study_module2.utils.BookingComparator;
import case_study_module2.utils.ReadAndWriteFile;
import case_study_module2.models.person.Customer;
import case_study_module2.utils.Validate;

import java.util.*;

public class PromotionController {
    Validate validate = new Validate();
    Scanner sc =  new Scanner(System.in);
    public Stack<Customer> getCustomersUsedServiceByYear(Set<Booking> bookingSet){

        Stack<Customer> customers = new Stack<>();
        System.out.println("Enter year");
        String year = sc.nextLine();
        while (!validate.positiveNumberValidate(year)){
            System.out.println("Wrong format! Re-type");
            year = sc.nextLine();
        }
        for (Booking booking:
                bookingSet) {
            String[] date = booking.getStartsDay().split("/");
            if(year.equals(date[2])){
                customers.add(booking.getCustomer());
            }
        }

        if(customers.size()==0){
            System.out.println("This year no one used ours services");
        }
        return customers;
    }



    public int[] voucher(int customerNumber){
        int voucher10 = 0;
        int voucher20 = 0;
        int voucher50 = 0;
        System.out.println("Enter number voucher 10%");
            voucher10 = this.voucher10();
            if(voucher10 >= customerNumber){
                voucher10 = customerNumber;
            }
            voucher20 = this.voucher20();

            if(voucher10+voucher20 >= customerNumber){
                voucher20 = customerNumber - voucher10;
            }
            voucher50 = this.voucher50();

            if(voucher10+voucher20+voucher50 >= customerNumber){
                voucher50 = customerNumber - voucher10 - voucher20;
            }
//            voucher = new int[]{voucher10, voucher20, voucher50};

        return new int[]{voucher10,voucher20,voucher50};
    }

    public int voucher10(){
        System.out.println("Enter total voucher 10%:");
        String voucher10 = sc.nextLine();
//        while(!validate.positiveNumberValidate(voucher10)){
//            System.out.println("Wrong format, Please Re-type");
//            voucher10 = sc.nextLine();
//        }
        return Integer.parseInt(voucher10);
    }
    public int voucher20(){
        System.out.println("Enter total voucher 20%:");
        String voucher20 = sc.nextLine();
//        while(!validate.positiveNumberValidate(voucher20)){
//            System.out.println("Wrong format, Please Re-type");
//            voucher20 = sc.nextLine();
//        }
        return Integer.parseInt(voucher20);
    }
    public int voucher50(){
        System.out.println("Enter total voucher 50%:");
        String voucher50 = sc.nextLine();
//        while(!validate.positiveNumberValidate(voucher50)){
//            System.out.println("Wrong format, Please Re-type");
//            voucher50 = sc.nextLine();
//        }
        return Integer.parseInt(voucher50);
    }



}

package case_study_module2.controllers;

import case_study_module2.models.enums.Membership;
import case_study_module2.models.person.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerController extends PersonControllers{
    List<Customer> customerList = new ArrayList<>();
    protected Membership membership;
    protected String address;

    public Customer getCustomerInput(){
        super.getInformation();
        this.membership = membershipInput();
        this.address = addressInput();
        Customer customer = new Customer(id,fullName,dayOfBirth,gender,passportId,phoneNumber,email,membership,address);
        customerList.add(customer);
        return customer;
    }

    public Membership membershipInput(){
        for (int i = 0; i < Membership.values().length; i++) {
            System.out.print((i+1)+" : "+Membership.values()[i]);

        }
        int index = Integer.parseInt(sc.nextLine());
        return Membership.values()[index-1];
    }

    public String addressInput(){
        System.out.print("Enter his/her address:");
        return sc.nextLine();
    }

    public void searchByNameService(String name){

    }

}

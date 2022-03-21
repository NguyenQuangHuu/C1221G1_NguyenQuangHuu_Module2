package case_study_module2.controllers;

import case_study_module2.models.Booking;
import case_study_module2.models.Contract;
import case_study_module2.models.person.Customer;
import case_study_module2.models.person.Employee;
import case_study_module2.services.IContractService;
import case_study_module2.utils.ReadAndWriteFile;
import case_study_module2.utils.Validate;

import java.util.*;

public class ContractController  {
    Scanner sc  = new Scanner(System.in);
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    final String BOOKINGS_FILE = "src\\case_study_module2\\data\\bookings.csv";
    final String CUSTOMERS_FILE = "src\\case_study_module2\\data\\customers.csv";
    Validate validate = new Validate();
    List<Customer> customerList = readAndWriteFile.readFileCustomer(CUSTOMERS_FILE);
    Set<Booking> bookingList = readAndWriteFile.readFileBooking(BOOKINGS_FILE);


//    public void inputContract() {
//
//        String contractId = contractIdInput();
//        double customerDeposits = depositInput();
//        double totalPayment = totalPayment();
////        Contract contract = new Contract(contractId, booking, customerDeposits, totalPayment, customerId);
////        System.out.println("Create new contract completed " + contract.toString());
//
//    }


    public String contractIdInput(){
        System.out.println("Enter contract id");

        String contractId = sc.nextLine();
        while ("".equals(contractId)){
            contractId = sc.nextLine();
        }
        return contractId;
    }

    public Booking bookingInput(){
        System.out.println("Booking List ID: ");
        for (Booking booking:
             bookingList) {
            System.out.println(booking.getBookingId());
        }
        System.out.print("Your choice:");
        String bookingId = sc.nextLine();

        boolean exist = false;
        Booking bookingResult = null;
        while (!exist){
            while(bookingId==null || !validate.positiveNumberValidate(bookingId)){
                System.out.println("Wrong input! Re-type");
                bookingId = sc.nextLine();
            }
            for (Booking booking : bookingList) {
                if (Integer.parseInt(bookingId) == booking.getBookingId()) {
                    bookingResult = booking;
                    exist = true;
                    break;
                }
            }
            if(!exist){
                System.out.println("NO exist! Please re-type");
                bookingId = sc.nextLine();
            }
        }

        return bookingResult;

    }

    public double depositInput(){
        System.out.println("Enter customer's deposit");
        String deposit = sc.nextLine();
        while (!validate.positiveTensNumberValidate(deposit)){
            System.out.println("Wrong format! Please re-type!");
            deposit = sc.nextLine();
        }
        return Double.parseDouble(deposit);
    }

    public double totalPayment(){
        System.out.println("Enter total customer payment");
        String total = sc.nextLine();
        while (!validate.positiveTensNumberValidate(total)){
            total = sc.nextLine();
        }
        return Double.parseDouble(total);
    }

    public Customer customerInput(){
        System.out.println("Customer ID list:");
        customerList.forEach(System.out::println);
        System.out.print("Your input: ");
        String customerId = sc.nextLine();
        boolean exist = false;
        Customer customerResult = null;
        while (!exist){
            while (("").equals(customerId)){
                System.out.print("Wrong format ! Please Re-type: ");
                customerId = sc.nextLine();
            }
            for (Customer customer:
                 customerList) {
                if(customerId.equals(customer.getId())){
                    customerResult =customer;
                    exist = true;
                    break;
                }
            }
            if(!exist){
                System.out.println("No exist please re-type");
                customerId = sc.nextLine();
            }

        }
        return customerResult;
    }


    public void editContract(Contract contract){

        System.out.println("Edit menu: \n" +
                "1. Booking id\n" +
                "2. Deposit\n" +
                "3. Total payment\n" +
                "4. Customer Id\n"+
                "Choose field you wanna edit:");
        String choice = sc.nextLine();
        while (!validate.positiveNumberValidate(choice) || Integer.parseInt(choice) < 1 || Integer.parseInt(choice)>4){
            System.out.println("Wrong format! Please re-type");
            choice = sc.nextLine();
        }
        switch (choice){
            case "1":
                Booking bookingIdChange = bookingInput();
                contract.setBookingId(bookingIdChange);
                break;
            case "2":
                double depositChange = depositInput();
                contract.setCustomerDeposits(depositChange);
                break;
            case "3":
                double totalPaymentChange = totalPayment();
                contract.setTotalPayment(totalPaymentChange);
                break;
            case "4":
                Customer customerIdChange = customerInput();
                contract.setCustomerId(customerIdChange);
                break;
        }

    }


    public void displayContract(List<Contract> contractList){
        System.out.println("Contract list");
        for (Contract contract:
             contractList) {
            System.out.println(contract.getBookingId().getFacilityName().getServiceName()+", booking by :"+contract.getCustomerId().getFullName()+
                    ", on :"+contract.getBookingId().getStartsDay());
        }
    }

    public List<String> writeContractToCSV(List<Contract> contractList){
        List<String> stringList = new ArrayList<>();
        for (Contract contract:
                contractList) {
            stringList.add(contract.contractToString());
        }
        return stringList;
    }


}

package case_study_module2.controllers;

import case_study_module2.models.Booking;
import case_study_module2.models.Contract;
import case_study_module2.models.person.Customer;
import case_study_module2.models.person.Employee;
import case_study_module2.services.IContractService;
import case_study_module2.utils.ReadAndWriteFile;
import case_study_module2.utils.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ContractController  {
    Scanner sc  = new Scanner(System.in);
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    Validate validate = new Validate();
    final String BOOKINGS_FILE = "src\\case_study_module2\\data\\bookings.csv";
    final String CUSTOMERS_FILE = "src\\case_study_module2\\data\\customers.csv";
    Set<Booking> bookingList=  readAndWriteFile.readFileBooking(BOOKINGS_FILE);
    List<Customer> customerList = readAndWriteFile.readFileCustomer(CUSTOMERS_FILE);
    public Contract inputContract(){
        String contractId = contractIdInput();
        String bookingId = bookingIdInput();
        double customerDeposits = depositInput();
        double totalPayment = totalPayment();
        String customerId = customerId();
        return new Contract(contractId, bookingId, customerDeposits, totalPayment, customerId);
    }


    public String contractIdInput(){
        System.out.println("Enter contract id");

        String contractId = sc.nextLine();
        while ("".equals(contractId)){
            contractId = sc.nextLine();
        }
        return contractId;
    }

    public String bookingIdInput(){
        System.out.println("Booking List ID: ");
        for (Booking booking:
             bookingList) {
            System.out.println(booking.getBookingId());
        }
        System.out.print("Your choice:");
        String bookingId = sc.nextLine();

        boolean exist = false;
        while (!exist){
            while(bookingId==null){
                System.out.println("Wrong input! Re-type");
                bookingId = sc.nextLine();
            }
            for (Booking booking : bookingList) {
                if (bookingId.equals(booking.getBookingId())) {
                    exist = true;
                    break;
                }
            }
            if(!exist){
                System.out.println("NO exist! Please re-type");
                bookingId = sc.nextLine();
            }
        }

        return bookingId;

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
        return Double.parseDouble(total) - depositInput();
    }

    public String customerId(){
        System.out.println("Customer ID list:");
        customerList.forEach(System.out::println);
        System.out.print("Your input: ");
        String customerId = sc.nextLine();
        boolean exist = false;
        while (!exist){
            while (customerId.equals("")){
                System.out.print("Wrong format ! Please Re-type: ");
                customerId = sc.nextLine();
            }
            for (Customer customer:
                 customerList) {
                if(customerId.equals(customer.getId())){
                    exist = true;
                    break;
                }
            }
            if(!exist){
                System.out.println("No exist please re-type");
                customerId = sc.nextLine();
            }

        }
        return customerId;
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
                String bookingIdChange = bookingIdInput();
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
                String customerIdChange = customerId();
                contract.setContractId(customerIdChange);
                break;
        }

    }


    public void displayContract(List<Contract> contractList){
        System.out.println("Contract list");
        contractList.forEach(System.out::println);
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

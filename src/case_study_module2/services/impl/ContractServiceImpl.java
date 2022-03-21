package case_study_module2.services.impl;

import case_study_module2.controllers.ContractController;
import case_study_module2.models.Booking;
import case_study_module2.models.Contract;
import case_study_module2.models.facility.Facility;
import case_study_module2.models.facility.Room;
import case_study_module2.models.facility.Villa;
import case_study_module2.models.person.Customer;
import case_study_module2.services.IContractService;
import case_study_module2.utils.ReadAndWriteFile;

import java.util.*;

public class ContractServiceImpl implements IContractService {
    Scanner sc = new Scanner(System.in);
    final String CONTRACTS_FILE = "src\\case_study_module2\\data\\contracts.csv";
    final String BOOKINGS_FILE = "src\\case_study_module2\\data\\bookings.csv";
    final String CUSTOMERS_FILE = "src\\case_study_module2\\data\\customers.csv";
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    List<Contract> contractList = readAndWriteFile.readFileContract(CONTRACTS_FILE);
    Set<Booking> bookingList = readAndWriteFile.readFileBooking(BOOKINGS_FILE);
    Queue<Booking> bookingQueue = new LinkedList<>();
    ContractController contractController = new ContractController();

    @Override
    public void add() {
        for (Booking booking : bookingList
        ) {
            if(!(booking.getFacilityName() instanceof Room)){
                bookingQueue.add(booking);
            }
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("Creating contract booking for:"+booking.toString());
            System.out.println("Creating contract for: "+customer.toString());
            String id = contractController.contractIdInput();
            double deposit = contractController.depositInput();
            double total = contractController.totalPayment();
            Contract contract = new Contract(id, booking, deposit, total, customer);
            contractList.add(contract);
            readAndWriteFile.writeFile(CONTRACTS_FILE, contractController.writeContractToCSV(contractList));
            System.out.println("Create contract complete" + contract.toString());
        }


    }

    @Override
    public void show() {
        contractController.displayContract(contractList);
    }

    @Override
    public void update() {
        System.out.println("Contract list :");
        contractList.forEach(System.out::println);
        System.out.print("Enter contract id to edit:");
        String contractId = sc.nextLine();
        boolean exist = false;
        while (!exist) {
            while ("".equals(contractId)) {
                System.out.println("Wrong input! Please re-type");
                contractId = sc.nextLine();
            }
            for (Contract contract :
                    contractList) {
                if (contractId.equals(contract.getContractId())) {
                    exist = true;
                    contractController.editContract(contract);
                }
            }
            if (!exist) {
                System.out.print("No exist! Please Re-type: ");
                contractId = sc.nextLine();
            }
        }

    }
}

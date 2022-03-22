package case_study_module2.services.impl;

import case_study_module2.controllers.PromotionController;
import case_study_module2.models.Booking;
import case_study_module2.models.Promotion;
import case_study_module2.models.enums.Voucher;
import case_study_module2.models.person.Customer;
import case_study_module2.services.IPromotionServices;
import case_study_module2.utils.ReadAndWriteFile;

import java.util.*;

public class PromotionImpl implements IPromotionServices {
    Scanner sc = new Scanner(System.in);
    PromotionController controller = new PromotionController();
    final String BOOKINGS_FILE = "src\\case_study_module2\\data\\bookings.csv";
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    List<Promotion> promotionList = new ArrayList<>();
    Set<Booking> bookingSet = readAndWriteFile.readFileBooking(BOOKINGS_FILE);
    Stack<Customer> customerList = new Stack<>();
    Stack<Customer> customers = new Stack<>();

    @Override
    public void displayCustomer() {
        customerList = controller.getCustomersUsedServiceByYear(bookingSet);
        while (!customerList.isEmpty()){

            if(!customers.contains(customerList.peek())){
                customers.push(customerList.peek());
            }
            customerList.pop();
        }
    }

    @Override
    public void displayPromotionCode() {
        if(customers.size() > 0){
        int numberCustomer = customers.size();
        System.out.println("Numbers customer used ours services in this year :"+numberCustomer);
        int[] numberVoucher = controller.voucher(numberCustomer);

        while (!customers.isEmpty()){

            for (int i = 0; i < numberVoucher.length; i++) {
                while (numberVoucher[i]>0){
                    Customer customer = customers.pop();
                    Promotion promotion = new Promotion(customer,Voucher.values()[i]);
                    promotionList.add(promotion);
                    numberVoucher[i]--;
                }
            }


        }
        for (Promotion promotion:
                promotionList) {
            System.out.println(promotion.getCustomer()+" : "+promotion.getVoucher());
        }
        }else{
            System.out.println("No exist customer used our services. Re-type year at menu 1");
        }

    }

}

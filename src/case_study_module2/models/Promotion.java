package case_study_module2.models;

import case_study_module2.models.enums.Voucher;
import case_study_module2.models.person.Customer;

public class Promotion{
    private Customer customer;
    private Voucher voucher;

    public Promotion(Customer customer, Voucher voucher) {
        this.customer = customer;
        this.voucher = voucher;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "customer=" + customer.getFullName() +
                "customerId= "+customer.getPassportID()+
                ", voucher=" + voucher +
                '}';
    }
}

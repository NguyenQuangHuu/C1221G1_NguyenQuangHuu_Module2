package case_study_module2.models;

import case_study_module2.models.person.Customer;

public class Contract {
    private String contractId;
    private Booking bookingId;
    private double customerDeposits;
    private double totalPayment;
    private Customer customerId;


    public Contract() {
    }

    public Contract(String contractId, Booking bookingId, double customerDeposits, double totalPayment, Customer customerId) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.customerDeposits = customerDeposits;
        this.totalPayment = totalPayment;
        this.customerId = customerId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Booking getBookingId() {
        return bookingId;
    }

    public void setBookingId(Booking bookingId) {
        this.bookingId = bookingId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public double getCustomerDeposits() {
        return customerDeposits;
    }

    public void setCustomerDeposits(double customerDeposits) {
        this.customerDeposits = customerDeposits;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }


    @Override
    public String toString() {
        return "Contract{" +
                "contractId='" + contractId + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", customerDeposits=" + customerDeposits +
                ", totalPayment=" + totalPayment +
                ", customerId='" + customerId + '\'' +
                '}';
    }

    public String contractToString(){
        return customerId+
                " ,"+bookingId.getBookingId()+
                " ,"+customerDeposits+
                " ,"+totalPayment+
                " ,"+customerId.getId();
    }
}

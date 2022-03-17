package demo_case_study.models;

public class Contract {
    private String contractId;
    private String bookingId;
    private double customerDeposits;
    private double totalPayment;
    private String customerId;


    public Contract() {
    }

    public Contract(String contractId, String bookingId, double customerDeposits, double totalPayment, String customerId) {
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

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{}";
    }
}

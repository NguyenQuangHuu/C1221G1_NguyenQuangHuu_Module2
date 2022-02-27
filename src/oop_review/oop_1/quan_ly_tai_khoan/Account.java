package oop_review.oop_1.quan_ly_tai_khoan;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {

    private final double INTEREST_RATE_ANNUALLY = 0.035;
    private long accountNumber;
    private String accountName;
    private double amount;


    public Account() {
    }

    public Account(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.amount = 50000;
    }

    public Account(long accountNumber, String accountName, double amount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.amount = amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        //Lấy khu vực
        Locale locale = new Locale("vi","VN");
        //Lấy chuyển đổi tiền tệ theo khu vực
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        return "ACB Account{" +
                " Số tài khoản =" + accountNumber +
                ", Chủ sở hữu ='" + accountName + '\'' +
                ", Số dư =" + numberFormat.format(amount) +
                '}';
    }

    public void depositMoney(double rechargeMoney){
        if(rechargeMoney < 100000){
            System.out.println("Số tiền nạp tối thiểu là 100.000 đ");
        }else{
            this.setAmount(this.getAmount()+rechargeMoney);
        }

    }

    public void withdrawMoney (double moneyWithdraw){
        if(moneyWithdraw < 50000){
            System.out.println("Số tiền rút ra tối thiểu phải là 50.000 đ");
        }else{
            if(this.getAmount() >= moneyWithdraw){
                this.setAmount(this.getAmount() - moneyWithdraw);
            }else{
                System.out.println("Số dư tài khoản không đủ");
            }
        }
    }

    public void interestChargedPerMonth(){
        this.setAmount(this.getAmount()+(this.getAmount()*(INTEREST_RATE_ANNUALLY/12)));
    }

    public void transferMoney(double moneyTransfer, long accountNumber, Account[] account){
        boolean checkId = false;
        if(moneyTransfer < 50000){
            System.out.println("Số tiền tối thiểu cho mỗi lần chuyển tiền là 50.000đ");
        }
        for(int i = 0; i< account.length;i++){

            if(account[i] instanceof Account){

                if(account[i].getAccountNumber()==accountNumber){
                    checkId = true;
                    if(this.getAmount()>=moneyTransfer){
                        this.setAmount(this.getAmount() - moneyTransfer);
                        account[i].setAmount(account[i].getAmount()+moneyTransfer);
                    }else{
                        System.out.println("Số dư tài khoản không đủ để thực hiện thao tác");
                    }
                }

            }

        }
        if(!checkId){
            System.out.println("Không tồn tại số tài khoản này");
        }
    }

}

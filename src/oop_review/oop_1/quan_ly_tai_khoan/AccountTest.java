package oop_review.oop_1.quan_ly_tai_khoan;

public class AccountTest {

    public static void main(String[] args) {
        Account[] accounts = new Account[30];
        Account account1 = new Account(12345,"Nguyễn Quang HỮu");
        Account account2 = new Account(23456,"Ngô Hoàng Long");
        Account account3 = new Account(34567,"Nguyễn Xuân Hải");
        Account account4 = new Account(45678,"Phạm Việt Khoa");
        Account account5 = new Account(56789,"Trần Phương");
        Account account6 = new Account(67890,"Châu Mỹ");
        Account account7 = new Account(99999,"Nguyễn Nghĩa Trình");
        accounts[0] = account1;
        accounts[1] = account2;
        accounts[2] = account3;
        accounts[3] = account4;
        accounts[4] = account5;
        accounts[5] = account6;
        accounts[6] = account7;


        for (Account account: accounts
             ) {
            if(account instanceof Account){
                System.out.println(account);
            }
        }
        account1.depositMoney(300000000);
        account2.depositMoney(2000000);
        account3.depositMoney(8000000);
        account4.depositMoney(1000000);
        account5.depositMoney(40000000);
        account6.depositMoney(30000000);
        account7.depositMoney(60000000);
        for (Account account: accounts
        ) {
            if(account instanceof Account){
                System.out.println(account);
            }
        }

        account1.withdrawMoney(3000000.0);
        account1.interestChargedPerMonth();
        System.out.println(account1);
        account1.transferMoney(3000000,99999,accounts);
        System.out.println(account1);
        System.out.println(account7);

    }
}

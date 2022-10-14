package inheritance.application;

import inheritance.entities.Account;
import inheritance.entities.BussinessAcount;
import inheritance.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 1000.0);
        BussinessAcount bacc = new BussinessAcount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BussinessAcount(1003, "Bob", 500.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 500.0, 0.01);

        // DOWNCASTING

        BussinessAcount acc4 = (BussinessAcount) acc2;
        acc4.loan(100.0);

        // BussinessAcount acc5 = (BussinessAcount) acc3;
        if (acc3 instanceof BussinessAcount) {
            BussinessAcount acc5 = (BussinessAcount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        acc2.withdraw(50.0);
        acc3.withdraw(50.0);
        System.out.println(acc2.getBalance());
        System.out.println(acc3.getBalance());
    }

}

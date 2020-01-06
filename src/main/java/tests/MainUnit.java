package tests;

import Bank.Account;
import Bank.Transaction;

public class MainUnit {
    public static void main(String args[]) {
    test_does_balance_match_after_deposit();
    test_does_balance_match_after_withdrawal();
    test_does_balance_match_opening_balance();


    }
        static void test_does_balance_match_opening_balance(){
            Account a1 = new Account(1, "Jo", 300);
            double openingBalance = 56.78;
            Account acc = new Account(1, "Jo", openingBalance);
            if (openingBalance == acc.availiableBalance() && openingBalance == acc.currentbalance())
                System.out.println("It works!");
            else
                System.out.println("It does not work!");
        }


        static void test_does_balance_match_after_deposit() {
            double openingBalance = 56.78;
            double amountToDeposit = 44.00;
            Account acc = new Account(1, "Jo", openingBalance);
            acc.credit(amountToDeposit);
            if ((openingBalance + amountToDeposit) == acc.availiableBalance() && (openingBalance + amountToDeposit) == acc.currentbalance())
                System.out.println("It works!");
            else
                System.out.println("It does not work!");
        }


        static void test_does_balance_match_after_withdrawal(){
            double openingBalance = 56.78;
            double amountToWithdraw = 44.00;
            Account acc = new Account(1, "Jo", openingBalance);
            acc.debit(amountToWithdraw);
            if ((openingBalance - amountToWithdraw) == acc.availiableBalance() && (openingBalance - amountToWithdraw) == acc.currentbalance())
                System.out.println("It works!");
            else
                System.out.println("It does not work!");
    }
}

package tests;

import Bank.Account;
import Bank.CreditAccount;
import Bank.Interest;
import Bank.Transaction;

public class MainUnit {
    public static void main(String args[]) {
        test_does_balance_match_after_deposit();
        test_does_balance_match_after_withdrawal();
        test_does_balance_match_opening_balance();
        test_going_overdrawn_on_credit_account();


    }

    static void test_does_balance_match_opening_balance() {
        Account a1 = new Account(1, "Jo", 300);
        double openingBalance = 56.78;
        Account acc = new Account(1, "Jo", openingBalance);
        if (openingBalance == acc.availiableBalance() && openingBalance == acc.currentbalance())
            System.out.println("test_does_balance_match_opening_balance: PASSED");
        else
            System.out.println("test_does_balance_match_opening_balance: FAILED");
    }


    static void test_does_balance_match_after_deposit() {
        double openingBalance = 56.78;
        double amountToDeposit = 44.00;
        Account acc = new Account(1, "Jo", openingBalance);
        acc.credit(amountToDeposit);
        if ((openingBalance + amountToDeposit) == acc.availiableBalance() && (openingBalance + amountToDeposit) == acc.currentbalance())
            System.out.println("test_does_balance_match_after_deposit: PASSED");
        else
            System.out.println("test_does_balance_match_after_deposit: FAILED");
    }


    static void test_does_balance_match_after_withdrawal() {
        double openingBalance = 56.78;
        double amountToWithdraw = 44.00;
        Account acc = new Account(1, "Jo", openingBalance);
        acc.debit(amountToWithdraw);
        if ((openingBalance - amountToWithdraw) == acc.availiableBalance() && (openingBalance - amountToWithdraw) == acc.currentbalance())
            System.out.println("test_does_balance_match_after_withdrawal: PASSED");
        else
            System.out.println("test_does_balance_match_after_withdrawal: FAILED");
    }

    static void test_going_overdrawn_on_credit_account() {
        double openingBalance = 10;
        double amountToWithdraw = 44.00;
        Account acc = new CreditAccount(1, "Jo", openingBalance, Interest.HOME_LOAN);
        acc.debit(amountToWithdraw);
        if ((openingBalance - (amountToWithdraw + ((Interest.HOME_LOAN.rate() / 100) * amountToWithdraw)) == acc.availiableBalance() && (openingBalance - (amountToWithdraw + (Interest.HOME_LOAN.rate() / 100) * amountToWithdraw)) == acc.currentbalance()))
            System.out.println("test_going_overdrawn_on_credit_account: PASSED");
        else
            System.out.println("test_going_overdrawn_on_credit_account: FAILED");

    }
}

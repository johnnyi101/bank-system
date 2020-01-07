package Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DebitAccountTest {
    public DebitAccountTest()
        {
        }
        @Test
        public void test_does_balance_match_after_withdrawal() {
        double openingBalance = 56.78;
        double amountToWithdraw = 44.00;

        Account acc = new Account(1, "Jo", openingBalance);
        acc.debit(amountToWithdraw);

        double actualResult = (openingBalance - amountToWithdraw);

        assertEquals(actualResult, acc.availiableBalance());
        assertEquals(actualResult, acc.currentbalance());

    }
    @Test
    public void test_going_overdrawn_on_credit_account() {
        double initAmount = 40.00;
        double amountToWithdraw = 50.00;
        Account acc = new CreditAccount(1, "Jo", initAmount, Interest.HOME_LOAN);
        acc.debit(amountToWithdraw);
        double actualResult = (initAmount - (amountToWithdraw + ((Interest.HOME_LOAN.rate() / 100) * amountToWithdraw)));
        assertEquals(actualResult, acc.availiableBalance());
        assertEquals(actualResult, acc.currentbalance());

    }
}
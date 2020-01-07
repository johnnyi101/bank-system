package Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {
    public CreditAccountTest()
    {
    }
    @Test
    public void test_does_balance_match_after_deposit() {
        double openingBalance = 56.78;
        double amountToDeposit = 44.00;
        Account acc = new Account(1, "Jo", openingBalance);
        acc.credit(amountToDeposit);
        double actualResult = (openingBalance + amountToDeposit);
        assertEquals(actualResult, acc.availiableBalance());
        assertEquals(actualResult, acc.currentbalance());
    }

}

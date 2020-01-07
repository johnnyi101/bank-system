package Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    public AccountTest()
    {
    }
    @Test
    public void test_does_balance_match_opening_balance() {

        double openingBalance = 56.78;
        Account acc = new Account(1, "Jo", openingBalance);

        assertEquals(openingBalance, acc.availiableBalance());
        assertEquals(openingBalance, acc.availiableBalance());
    }
}
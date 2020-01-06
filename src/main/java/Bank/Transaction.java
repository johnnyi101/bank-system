package Bank;

import java.time.Instant;
import java.util.Date;

public class Transaction {
    private double amt;
    private Instant when = Instant.now();

    public Transaction(double amt) {
        this.amt = amt;
    }

    public double getAmt() {
        return amt;
    }

    public String getWhen() {
        return when.toString();
    }
}

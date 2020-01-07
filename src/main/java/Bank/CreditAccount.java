package Bank;

public class CreditAccount extends Account {
    Interest rate;

    public CreditAccount(int id, String name, double amt, Interest rate) {
        super(id, name, amt);
        this.rate = rate;
    }

    @Override
    public double debit (double amt) {
        if (super.availiableBalance() < amt) {
            amt += (rate.rate() / 100) * amt;
            System.out.println(amt);
        }
        super.debit(amt);
        return super.availiableBalance();
    }
}

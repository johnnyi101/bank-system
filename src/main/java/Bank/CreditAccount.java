package Bank;

public class CreditAccount extends Account{
    Interest rate;

    public CreditAccount(int id, String name, double amt, Interest rate){
        super(id,name,amt);
        this.rate = rate;
    }

    public double overDrawn(double amt){
        if (super.availiableBalance() - amt < 0) {
            double amountToDebit = amt + (rate.rate() / 100) * amt;
            super.debit(amountToDebit);
        }
        return super.availiableBalance();
    }
}

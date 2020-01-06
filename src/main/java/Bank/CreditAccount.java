package Bank;

public class CreditAccount extends Account{
    Interest rate;
    public CreditAccount(int id, String name, double amt, Interest rate){
        super(id,name,amt);
        this.rate = rate;

    }
}

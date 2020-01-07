package Bank;

import java.util.AbstractList;
import java.util.ArrayList;

public class Account {
    private int id;
    private String name;
    private double balance;
    private final AbstractList<Transaction> transaction = new ArrayList<>();

    public Account (int id, String name, double amt){
        this.id = id;
        this.name = name;
        credit(amt);
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double availiableBalance(){
        return balance;
    }



    public double currentbalance(){
        double balance = 0;
        for(Transaction txn : transaction)
            balance+= txn.getAmt();
        return balance;

    }
    public double credit (double amt){
        balance += amt;
        transaction.add(new Transaction(amt));
        return balance;

    }
    public double debit(double amt){
        balance += amt * -1;
        transaction.add((new Transaction(amt*-1)));
        return balance;
    }



}

package Bank;

public enum Interest {
    HOME_LOAN(0.3),
    BUSINESS_LOAN(0.7);

    private final double rate;
    Interest(double rate) {
        this.rate = rate;
    }
    public double rate(){
        return rate;
    }
}

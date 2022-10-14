package inheritance.entities;

public class BussinessAcount extends Account {

    private Double loanLimit;

    public BussinessAcount() {
        super();
    }

    public BussinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    // This is the original code, but it's not necessary to use the deposit method, because the balance is protected and can be accessed by the subclass.
    /*public void loan(double amount){
        if(amount <= loanLimit){
            deposit(amount);
        }*/

    public void loan(double amount){
        if(amount <= loanLimit){
            balance += amount;
        }
    }

}


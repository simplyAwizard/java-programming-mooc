public class Debt {
    private double balance;
    private double interestRate;

    Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println("balance: " + this.balance);
    }

    public void waitOneYear() {
        this.balance *= this.interestRate;
    }
}

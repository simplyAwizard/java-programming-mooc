public class YourFirstBankTransfer {
    public static void main(String[] args) {

        Account secondAccount = new Account("Matthew's account", 1000);
        Account thirdAccount = new Account("My account", 0);

        secondAccount.withdraw(100.0);
        thirdAccount.deposit(100.0);

        System.out.println(secondAccount.toString());
        System.out.println(thirdAccount.toString());

    }
}

package bankApp;

public abstract class Account implements RateInterface {

    private String name;
    private String sSN;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;


    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        index++;
        //Set account number
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String last2OfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return last2OfSSN + uniqueID + randomNumber;
    }

    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: " + accruedInterest);
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("DEPOSITING: " + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("WITHDRAWING: " + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " To " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now " + balance);
    }

    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE: " + balance +
                        "\nRATE: " + rate + " %"
        );
    }
}

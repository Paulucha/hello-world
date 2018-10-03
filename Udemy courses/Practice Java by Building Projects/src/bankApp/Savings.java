package bankApp;

public class Savings extends Account {

    private int safetyDepositBoxID;
    private int getSafetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        getSafetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {

        System.out.println("ACCOUNT TYPE: " + "savings.");
        super.showInfo();
        System.out.println(
                "Yours SAVINGS Account Features: " +
                        "\n Safety Deposit Box ID: " + safetyDepositBoxID +
                        "\n Safety Deposit Box Key: " + getSafetyDepositBoxKey
        );
    }
}

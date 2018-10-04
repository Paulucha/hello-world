import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BankAccount {


    private static String firstName;
    private static String lastName;
    private static int customerID = 0;
    private static double accountBalance;
    private static int accountNumber;
    private static List<String[]> customersAccounts = new LinkedList<>();

    public BankAccount() {

        customersAccounts.add(new String[]{"ID", "FIRST NAME", "LAST NAME", "ACCOUNT BALANCE", "ACCOUNT NUMBER"});
        customerID++;
        Scanner in = new Scanner(System.in);
        String[] customer = new String[5];
        System.out.println("WELCOME IN NEW ACCOUNT CREATOR" +
                "\nYOUR NAME: ");
        firstName = in.nextLine();
        customer[1] = firstName;
        System.out.println("YOUR LAST NAME: ");
        lastName = in.nextLine();
        customer[2] = lastName;

        System.out.println("YOUR INITIAL ACCOUNT BALANCE: ");
        accountBalance = in.nextInt();
        customer[3] = String.valueOf(accountBalance);

        customer[4] = String.valueOf(setAccountNumber());
        customer[0] = String.valueOf(customerID);
        System.out.println("NEW ACCOUNT HAS BEEN CREATED" +
                "\n YOUR ACOUNT NUMBER IS: " + accountNumber +
                "\n AND CUSTOMER ID: " + customerID);
        customersAccounts.add(customer);

        BankApp.actionInAccount();
    }


    public static void showCustomers() {
        System.out.println("CUSTOMERS OF BANK: ");
        iterateCustomers();

    }

    public static void iterateCustomers() {
        for (String[] customersAccount : customersAccounts) {
            System.out.println(Arrays.toString(customersAccount));
        }
    }

//    public showBankBalance() {
//
//    }

    public static void checkBalance() {
        System.out.println("YOUR ACCOUNT BALANCE IS: " + accountBalance);
    }

    private int setAccountNumber() {
        return accountNumber = (int) (Math.random() * Math.pow(10, 10));
    }
public static void withdraw(){
    System.out.println("WRITE AMOUNT TO WITHDRAW: ");
    Scanner in = new Scanner(System.in);
    int amount = in.nextInt();
    accountBalance = accountBalance - amount;
    checkBalance();
    BankApp.actionInAccount();
}
public static void deposit(){
    System.out.println("WRITE AMOUNT TO DEPOSIT: ");
    Scanner in = new Scanner(System.in);
    int amount = in.nextInt();
    accountBalance = accountBalance + amount;
    checkBalance();
    BankApp.actionInAccount();
}


    public static void showInfo() {
        System.out.println("WELCOME!" +
                "\n YOU ARE: " + lastName + " " + firstName +
                "\nCUSTOMER ID: " + customerID +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nACCOUNT BALANCE: " + accountBalance
        );
    }


}

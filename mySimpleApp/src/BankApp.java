import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApp {

    public static void startApp() {
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME IN OUR BANK" +
                "\nIF YOUR ARE A CUSTOMER PRESS - 1" +
                "\n ADMIN PRESS - 2" +
                "\n QUIT - 0");

        try {
            int userChoice = in.nextInt();
            if (userChoice == 0) {
                exitWindow();
            } else if (userChoice == 1) {
                initWindowForCustomer();
            } else if (userChoice == 2) {
                adminPanel();
            }
        } catch (InputMismatchException e) {

            System.out.println("WRONG CHOICE, TRY AGAIN");
            startApp();
        }

    }

    private static void adminPanel() {
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME IN ADMIN PANEL" +
                "\n SEE ALL CUSTOMERS - 1" +
                "\n SEE BANK BALANCE - 2" +
                "\n QUIT - 0"
        );
        try {
            int userChoice = in.nextInt();
            if (userChoice == 0) {
                exitWindow();
            } else if (userChoice == 1) {
                BankAccount.showCustomers();
            } else if (userChoice == 2) {

            }
        } catch (InputMismatchException e) {
            System.out.println("WRONG CHOICE, TRY AGAIN");
            adminPanel();
        }
    }

    public static void initWindowForCustomer() {
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME CUSTOMER" +
                "\nWHAT WOULD YOU LIKE TO DO?" +
                "\n 1 - create new account" +
                "\n 2 - check account balance" +
                "\n 0 - quit"
        );
        try {
            int userChoice = in.nextInt();

            if (userChoice == 0) {
                exitWindow();
            } else if (userChoice == 1) {
                new BankAccount();
            } else if (userChoice == 2) {
                BankAccount.checkBalance();
            }
        } catch (InputMismatchException e) {
            System.out.println("WRONG CHOICE, TRY AGAIN");
            initWindowForCustomer();
        }

    }

    public static void actionInAccount() {
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("WHAT WOULD YOU LIKE TO DO: " +
                "\n 1 - WITHDRAW" +
                "\n 2 - DEPOSIT" +
                "\n 4 - SHOW INFO" +
                "\n 5 - CHECK BALANCE" +
                "\n 0 - EXIT");
        try {
            int userChoice = in.nextInt();

            if (userChoice == 0) {
                startApp();
            } else if (userChoice == 1) {
                BankAccount.withdraw();
            } else if (userChoice == 2) {
                BankAccount.deposit();
            } else if (userChoice == 4) {
                BankAccount.showInfo();
            } else if (userChoice == 5) {
                BankAccount.checkBalance();
            }
        } catch (InputMismatchException e) {
            System.out.println("WRONG CHOICE, TRY AGAIN");
            initWindowForCustomer();
        }
    }

    public static void exitWindow() {
        System.out.println("SEE YOU SOON.");
    }
}

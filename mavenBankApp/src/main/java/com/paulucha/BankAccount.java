package com.paulucha;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class BankAccount {

    private static final Logger logger = LogManager.getLogger(BankAccount.class);

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
        logger.trace("New customer added to list");
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


    public static void checkBalance() {
        System.out.println("YOUR ACCOUNT BALANCE IS: " + accountBalance);
    }

    private int setAccountNumber() {
        return accountNumber = (int) (Math.random() * Math.pow(10, 10));
    }

    public static void withdraw() {
        System.out.println("WRITE AMOUNT TO WITHDRAW: ");
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        accountBalance = accountBalance - amount;
        checkBalance();
        BankApp.actionInAccount();
    }

    public static void deposit() {
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

    public static void save(String fileName) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {
            logger.warn("File not found ", e );

        }
        for (String[] customersAccount : customersAccounts) {
            pw.println(Arrays.toString(customersAccount));
        }
        pw.close();


        System.out.println("Customers have been saved to file.");
        logger.trace("Customers have been saved to file.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append('}');
        return sb.toString();
    }
}

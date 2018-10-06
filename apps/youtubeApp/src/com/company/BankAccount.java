package com.company;

import java.util.Scanner;

public class BankAccount {

int balance;
int previousTransaction;
String customerName;
String customerId;

    public BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposit(int amount){
    if (amount!=0){
        balance=balance + amount;
        previousTransaction = amount;
    }
}

void withdraw (int amount){
    if (amount!=0){
        balance = balance - amount;
        previousTransaction = -amount;
    }
}
void getPreviousTransaction(){
    if (previousTransaction>0){
        System.out.println(("Deposited: " + previousTransaction));
    }
    else if(previousTransaction<0){
        System.out.println("Withdrawed: " + Math.abs(previousTransaction));
            }
else System.out.println("No transaction occured");
}

void showMenu(){
   char option = '\0';
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome " + customerName);
    System.out.println("Your ID is: " + customerId);
    System.out.println("\n");
    System.out.println("A - Check balance");
    System.out.println("B - Deposit");
    System.out.println("C - Withdraw");
    System.out.println("D - Previous transaction");
    System.out.println("E - Exit");

do{

    System.out.println("ENTER AN OPTION: ");
    option = scanner.next().charAt(0);
    System.out.println("\n");
    switch (option){
        case 'A':
            System.out.println("Balance = " +balance);
break;
        case 'B':
            System.out.println("ENTER AMOUNT TO DEPOSIT: ");
            int amount = scanner.nextInt();
            deposit(amount);
            break;
        case 'D':
            getPreviousTransaction();
            break;

    default:
        System.out.println("NO");
    break;
    }

}while (option!='E');

    System.out.println("BYE");
}

}

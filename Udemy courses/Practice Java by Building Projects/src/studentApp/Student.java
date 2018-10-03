package studentApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int toitionBalance = 0;
    private int costOfCOurse = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER STUDENT'S FIRST NAME: ");
        this.firstName = in.nextLine();

        System.out.println("ENTER STUDENT'S LAST NAME: ");
        this.lastName = in.nextLine();

        System.out.println("1 - for Freshman, \n2 - for Saphmore, \n3 - for Junior, \n4 - for Senior. \nENTER STUDENT'S CLASS LEVEL: ");
        this.gradeYear = in.nextInt();
        setID();
    }

    private void setID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.println("Enter course to enroll (Q to quit): ");

            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                toitionBalance = toitionBalance + costOfCOurse;
            } else {
                break;
            }

        } while (true);

    }

    public void viewBalance() {
        System.out.println("YOUR BALANCE IS: " + toitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.println("ENTER YOUR PAYMENT:");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        toitionBalance = toitionBalance - payment;
        System.out.println("Thank you for your payment: " + payment);
        viewBalance();
    }

    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nGRADE LEVEL: " + gradeYear +
                "\nSTUDENT ID: " + studentID +
                "\nCOURSES ENROLLED: " + courses +
                "\nYOUR BALANCE to PAY: " + toitionBalance;
    }
}

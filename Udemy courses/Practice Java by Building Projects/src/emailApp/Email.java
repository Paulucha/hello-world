package emailApp;

import java.util.Scanner;

public class Email {
    private String firsName;
    private String lastName;
    private String password;
    private int defPassLenght = 8;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

    public Email(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
        System.out.println("EMail: " + this.lastName);

        this.department = setDepartment();
        System.out.println("Your department choice: " + this.department);

        this.password = setRandomPassword(defPassLenght);
        System.out.println("Your password is: " + this.password);

        email = firsName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    private String setDepartment() {
        System.out.println("\n 1:sales, \n2:development, \n3:accounting, \n0:none \nEnter the department: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "dev";
        } else if (departmentChoice == 3) {
            return "accounting";
        } else return "nothing";
    }

    private String setRandomPassword(int lenght) {
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUQWXYZ!@#$%^&*()1234567890";
        char[] password = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return
                "DISPLAY NAME: " + firsName + " " + lastName +
                "\nEMAIL: "+ email+
                "\nEMAILBOX CAPACITY: " + mailboxCapacity;
    }
}

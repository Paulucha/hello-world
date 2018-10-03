package studentApp;

import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {


        System.out.println("ENTER NUMBER OF STUDENTS TO ENROLL:");
        Scanner in = new Scanner(System.in);
        int numberOFStudents = in.nextInt();


        Student[] students = new Student[numberOFStudents];

        for (int n = 0; n < numberOFStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n]);
        }


    }
}

package StudentAPP;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[]Args){

        //ask them
        System.out.println("Enter number os students to enroll");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //create studants
        for (int i = 0; i < numOfStudents ; i++) {
            students[i] =new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
            
        }

    }
}

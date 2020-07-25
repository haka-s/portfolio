package StudentAPP;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int studentYear;
    private String studentID;
    private int inscriptions;
    private int balance = 0;
    private static int cost = 600;
    private String courses = null;
    private static int id = 1000;

    //constructor
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first name");
        this.firstName = in.nextLine();
        System.out.println("Enter Student last name");
        this.lastName = in.nextLine();
        System.out.println("1 - Freshman\n2 - Sophmore \n3 - Junior \n4 - Senior \nEnter student class level");
        this.studentYear = in.nextInt();

        setStudentID();
        System.out.println(firstName+ " " +lastName+ " " +studentYear+ " "+ studentID);
    }
    //generate id
    private void setStudentID() {
        id++;
        studentID = studentYear +""+ id;
    }


    //enrollment
    public void enroll() {
        //loop till hitting 0
        do {
            System.out.println("Enter a course to enroll (Q to exit)" );
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q" )) {
                courses = courses + "\n " + course;
                balance = balance + cost;

            } else {
                break;
            }
        } while (1 != 0);

    }
        //courses

        //balance
         public void viewBalance(){
            System.out.println("your balance is " + balance);
        }
        //payment
        public void payTuition(){
            viewBalance();
            Scanner in = new Scanner(System.in);
            System.out.println("enter ur payment");
            int payment = in.nextInt();
            balance = balance - payment;
            System.out.println("Thank you for ur payment of $"+ payment);
            viewBalance();

        }
    public String toString(){
        return "Name: " + firstName +" "+ lastName+
                "\nStudant ID"+ studentID+
                "\nCourses Enrolled: " + courses +
                "\nBalance: $"+ balance;
    }





}

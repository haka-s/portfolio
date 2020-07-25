package EmailApp;

import java.util.Scanner;

public class Email {
  private String firstName;
  private String lastName;
  private String department;
  private String password;
  private String email;
  private int defaultPasswordLenght = 10;
  private int mailboxCapacity = 500;
  private String companySuffix = "anycompany.com";
  private String alternateEmail;


    //constructor
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //call for te department
        this.department = setDepartment();
        // call for a random password
        this.password = randomPassword(defaultPasswordLenght);
        System.out.println("your password is;" + this.password);
        //generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "."+ companySuffix;

    }
    //Ask for the department
    private String setDepartment() {
            System.out.println("DEPARTMENT CODE\n1 for sales \n2 for Development \n3 for accounting \n0 for none\nEnter department code" );
            Scanner in = new Scanner(System.in);
            int deparmentChoice = in.nextInt();
            if(deparmentChoice == 1){return "Sales";}
            else if(deparmentChoice == 2){return "Dev";}
            else if (deparmentChoice == 3){return "Accounting";}
            else {return "-";}
    }

    //generate password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%&";
        char[] password = new char[length];
        for (int i = 0; i < length ; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }
    //set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //change password
    public void setPassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getPassword() {
        return password;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
public String showInfo(){
        return "DISPLAY NAME:" + firstName + " " +lastName +"\nCOMPANY EMAIL:" + email + "\nMAILBOX CAPACITY" + mailboxCapacity +"mb";


}
}

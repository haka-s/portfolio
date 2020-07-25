package testing;

import java.util.Scanner;

public class TestingApp {
    String output;
    public TestingApp(){
        System.out.println("etra algo");
        Scanner inpu = new Scanner(System.in);
        String inpute = inpu.nextLine();
        this.output = randomPassword(inpute);
        System.out.println(output);
    }

    private String randomPassword(String input) {
        String password = "";
        for (int i = input.length()-1; 0 <= i; i--) {
            password = password + input.charAt(i);


        }
        return password;
    }
}

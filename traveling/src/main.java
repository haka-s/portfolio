import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class main {
    public static void main (String[]Args) {
        System.out.println ("Welcome to vacation planner!");
        Scanner input = new Scanner(System.in);
        System.out.println ("What's your name?");
        String name = input.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.println ("Nice to meet you " + name + ", Where are you travelling to?");
        String ciudad = input2.nextLine();
        System.out.println ("Great! " + ciudad + " sounds like a great trip");
        System.out.println ("****************************************************************");
        part1();
        part2();
        part3();



    }
    public static void part1 () {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        int minutes = 60;
        int day = 24;
        Scanner input = new Scanner(System.in);
        System.out.println ("How many days are you going to spend travelling?");
        int days = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println ("How much money, in USD, are you planing to spend on your trip");
        double money = input2.nextDouble();
        Scanner input3 = new Scanner(System.in);
        System.out.println ("What is the three letter currency symbol for your travel destination?");
        String crurrencySymbol = input3.next();
        Scanner input4 = new Scanner(System.in);
        System.out.println ("How many " + crurrencySymbol + " are there in 1 USD");
        double exchange = input2.nextDouble();
        System.out.println ("If you are travelling for " + days + " days that is the same as " + days*day + " hours or " + (days*day)*minutes + " minutes");
        System.out.println ("If you are going to spend $" + money + " USD that means per day you can spend up to $" +numberFormat.format(money/days) + " USD");
        System.out.println ("your total budget in " + crurrencySymbol + " is " + numberFormat.format (money*exchange) + " " + crurrencySymbol +", which per day is " + numberFormat.format((money*exchange)/days) + " " + crurrencySymbol);
        System.out.println ("****************************************************************");

    }
    public static void part2 () {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        Scanner input = new Scanner(System.in);
        System.out.println("what is the difference,in hours, between your home and your destination? ");
        double difference = input.nextDouble();
        System.out.println("that means that when it is midnight at home it wil be " + numberFormat.format((24 + difference) % 24) + " In your travel destination and when it it noon at home it will be " + numberFormat.format(difference + 12));
    }
    public static void part3 () {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        Scanner input = new Scanner(System.in);
        System.out.println("What is the square area of your destination country in km2?");
        double km2 = input.nextDouble();
        System.out.println("in miles2 that is " + numberFormat.format(km2*1.609344));






}

}*/
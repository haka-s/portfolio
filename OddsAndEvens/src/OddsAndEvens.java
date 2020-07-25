import java.util.*;

public class OddsAndEvens {
    public static void main(String[] Args) {

        //intro
        System.out.println("Let’s play a game called “Odds and Evens”");
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        String oe = input.nextLine();
        //ODDS
        if (oe.toUpperCase().startsWith("o".toUpperCase())) {
            System.out.println(name + " has picked odds! The computer will be evens.");
            System.out.println("-----------------------------------------------");
            Scanner input3 = new Scanner(System.in);
            System.out.println("How many \"fingers\" do you put out?");
            int finger = input.nextInt();
            if (finger % 2 != 0) {
                System.out.println("Error you must pick an ODD number");
                System.out.println("-----------------------------------------------");
            }
            Random rand = new Random();
            int computer = rand.nextInt(5);
            if (computer % 2 == 0) {
                int resultado3 = computer + finger;
                System.out.println("the computer plays " + computer + " \"fingers\"");
                System.out.println("-----------------------------------------------");
                System.out.println(finger + " + " + computer + " = " + resultado3);
                if (resultado3 % 2 == 0){
                    System.out.println(resultado3 + " is ...even!");
                    System.out.println("That means the computer wins! :)");
                }else{
                    System.out.println(resultado3 + " is ...odd!");
                    System.out.println("That means " + name + " wins! :)");}
                System.out.println("-----------------------------------------------");
            } else {
                int sum = computer + 1;
                int resultado4 = sum+finger;
                System.out.println("the computer plays " + sum + " \"fingers\"");
                System.out.println("-----------------------------------------------");
                System.out.println(finger + " + " + sum + " = " + resultado4);
                if (resultado4 % 2 == 0){
                    System.out.println(resultado4 + " is ...even!");
                    System.out.println("That means the computer wins! :)");
                }else{
                    System.out.println(resultado4 + " is ...odd!");
                    System.out.println("That means " + name + " wins! :)");}
                System.out.println("-----------------------------------------------");
            }
        }

            //EVENS
            if (oe.toUpperCase().startsWith("e".toUpperCase())) {
                System.out.println(name + " has picked evens! The computer will be odds.");
            Scanner input4 = new Scanner(System.in);
            System.out.println("How many \"fingers\" do you put out?");
            int fingeI = input.nextInt();
            if (fingeI % 2 == 1) {
                System.out.println("Error you must pick an EVEN number");
                System.out.println("-----------------------------------------------");
            }
            Random ranE = new Random();
            int computeE = ranE.nextInt(6);
            if (computeE % 2 == 1) {
                int resultado = computeE+fingeI;
                System.out.println("the computer plays " + computeE +  " \"fingers\"");
                System.out.println("-----------------------------------------------");
                System.out.println(fingeI + " + " + computeE + " = " + resultado);
                if (resultado % 2 == 0){
                    System.out.println(resultado + " is --- even!");
                    System.out.println("That means " + name + " wins! :)");
                }else{
                    System.out.println(resultado + " is --- odd!");
                    System.out.println("That means the computer wins! :)");}
                System.out.println("-----------------------------------------------");
            }else {
                int resta = computeE - 1;
                int resultado2 = resta + fingeI;
                System.out.println("the computer plays " + resta + " \"fingers\"");
                System.out.println("-----------------------------------------------");
                System.out.println(fingeI + " + " + resta + " = " + resultado2);
                if (resultado2 % 2 == 0){
                    System.out.println(resultado2 + " is --- even!");
                    System.out.println("That means " + name + " wins! :)");
                }else{
                    System.out.println(resultado2 + " is --- odd!");
                    System.out.println("That means the computer wins! :)");}
                System.out.println("-----------------------------------------------");
            }



            }
 }
}

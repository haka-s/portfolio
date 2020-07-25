package BankApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main (String[]Args){
        List<Account> accounts = new LinkedList<Account>();
        /*
        Checking chkacc1 = new Checking("Thomas Wilson","231415234",1500);
        Savings svacc1 = new Savings("Maria Alba","12342134",2500);
        svacc1.compound();
        svacc1.showInfo();
        System.out.println("*******************");
        chkacc1.showInfo();
*/
        //read a csv file then create new accounts based on that date
        String file = "C:\\Users\\santi\\Desktop\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = Utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders){
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            //System.out.println(name + " " + sSN + " " + accountType + " " +"$"+ initDeposit);
            if (accountType.equals("Savings")){
                accounts.add(new Savings(name,sSN,initDeposit));
            }
            else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name,sSN,initDeposit));
            }
            else {System.out.println("Error reading account type");
            }

        }
        for (Account acc : accounts){
            System.out.println("*************************");
            acc.showInfo();
            System.out.println("*************************");

        }

        accounts.get((int) Math.random()* accounts.size()).deposit(Math.random()*Math.pow(20,2));
        accounts.get((int) Math.random()* accounts.size()).withdraw(Math.random()*Math.pow(20,4));
        accounts.get((int) Math.random()* accounts.size()).transfer((int)Math.random()*accounts.size(),(double) Math.random() *Math.pow(20,5) );

    }
}

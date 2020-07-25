package BankApp;

import java.sql.PseudoColumnUsage;

public abstract class Account implements IBaseRate {
    //list common properties for savings and checking
    private String name;
    private String sSN;
    protected String accountNumber;
    private static int index = 10000;
    private double balance;
    protected double rate;

    //constructor for base properties
    public Account(String name,String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        //set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }
    public abstract void setRate();

    private String setAccountNumber( ){
        String lastTwoSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow (10,3));
        return lastTwoSSN + uniqueID + randomNumber;
    }
    public void compound(){
        double accruedInterest = balance * rate/100;
        balance = balance + accruedInterest;
        System.out.println("Accrued interest $" + accruedInterest);
        printBalance();
    }

    //common methods - transactions
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();

    }
    public void transfer(int toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transfering $"+ amount + " to " + toWhere);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balanace is $"+balance);
    }
    //showInfo
    public void showInfo(){
        System.out.println("NAME: "+ name + "\nBALANCE: " + balance + "\nACCOUNT NUMBER: " + accountNumber+"\nRATE: " + rate + "%");
    }
}

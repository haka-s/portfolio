package BankApp;

public class Checking extends Account {
    //properties specific to checking
    private int debitCardPIN;
    private int debitCardNumber;
    //constructor
    public Checking(String name, String sSN,double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() *  Math.pow(10,12));
        debitCardPIN = (int) (Math.random() *  Math.pow(10,4));
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking account info" + "\nDebit card number: "+ debitCardNumber +"\nDebit Card PIN: " + debitCardPIN);
    }
    //methods specific to checking
}

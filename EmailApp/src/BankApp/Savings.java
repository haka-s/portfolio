package BankApp;

public class Savings extends Account {
    //properties specific to savings
    private int safetyDepositBoxID;
    private int getSafetyDepositBoxKey;

    //constructor
    public Savings(String name, String sSN,double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();


    }
    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() *  Math.pow(10,3));
        getSafetyDepositBoxKey = (int) (Math.random() *  Math.pow(10,4));

    }

    //methods specific to savings
    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("your savings account features"+"\nSafety deposit box id: "+ safetyDepositBoxID + "\nsafety deposit box key: " + getSafetyDepositBoxKey);

    }

}

package exercise09_07;
import java.util.Date;

public class Account {
    private int accountId;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    Account(){
        accountId = 0;
        balance =0;
        annualInterestRate=0;
        dateCreated = new Date();
    }
    
    Account(int newAccountId,double newBalance){
        accountId = newAccountId;
        balance = newBalance;
        dateCreated = new Date();
    }
    
    public void setAccountId(int newAccountID){
        accountId = newAccountID;
}
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    public void setAnnualInterestRate(double newInterest){
        annualInterestRate = newInterest;
    }
    public int getAccountID(){
    return accountId;
    }
    public double getBalance(){
    return balance;
    }
    public double getAnnualInterestRate(){
    return annualInterestRate;
    }
    public String getDateCreated(){
    return dateCreated.toString();
    }
    public double getMonthlyInterestRate(){
    return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
    return balance *getMonthlyInterestRate()/100;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
    balance+= amount;
    }
}

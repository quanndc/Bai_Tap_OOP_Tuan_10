package Bai2;

public class BankAccount {
    private static Integer accNumberDefault = 0;


    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private double balance;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    private String accNumber;
    public String getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public BankAccount(String name, double balance){
        try{
            this.name = name;
            if(balance <= 0){
                throw new Exception();
            }
            this.balance = balance;
            this.accNumber = ("0081" + PaddingMethod.padLeft((++accNumberDefault).toString(), 7, '0'));
        }catch(Exception e){
            System.out.println("Balance khong the < 0");
        }
    }

    public String displayAccount() {
        return String.format("%-20s %-20s %-15.2f",getAccNumber(),this.getName(),this.getBalance());
    }



}

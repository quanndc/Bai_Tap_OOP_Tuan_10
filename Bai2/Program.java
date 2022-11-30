package Bai2;

import java.sql.Array;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(new BankAccount("Chuyen", 0));
        list.add(new BankAccount("Chuyen", 0));
        list.add(new BankAccount("Chuyen", 0));


        // BankAccount acc = new BankAccount("Pham Ich Chuyen", 0);
        // BankAccount acc2 = new BankAccount("Tran Minh Quan", 100);
        // BankAccount acc3 = new BankAccount("Tran Minh Quan", 100);
        //System.out.println(acc.getAccNumber());
        //System.out.println(acc2.getAccNumber());
        //System.out.println(acc2.getAccNumber());
        //System.out.println(acc.displayAccount());
    }
}

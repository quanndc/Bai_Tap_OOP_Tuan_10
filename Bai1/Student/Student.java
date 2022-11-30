package Bai1.Student;

import java.util.Scanner;

import Bai1.UserDefinedExceptions.*;

public class Student implements Comparable<Student>{
    private Scanner input = new Scanner(System.in);
    public String iD;

    public String getiD() {
        return iD;
    }
    public void setiD(String iD){
        try{
            if(iD.matches("[a-zA-Z]{2}[0-9]{7}")){
                this.iD = iD;
            }
            else{
                throw new IDException();
            }
        }catch(IDException e){
            System.out.println(e.getMessage());
        }
    }

    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name){
        try{
            if(name.split("\\s+").length < 2){
                throw new NameException();
            }
            else{
                this.name = name;
            }
        }catch(NameException e){
            System.out.println(e.getMessage());
        }
    }


    public String getFirstName(){
        String[] fname  = new String[this.getName().split("\\s+").length]; 
        fname = this.getName().split("\\s+");
        return fname[this.getName().split("\\s+").length-1];

    }

    public String getLastName(){
        return this.getName().substring(0,this.getName().length() - this.getFirstName().length());
    }

    public String getEmail(){
        String subArr = "";
        for (int i=0;i<getLastName().length();i++){
            char ch;
            if(Character.isUpperCase(ch = getLastName().charAt(i))){
                subArr += ch;if(Character.isUpperCase(ch));
            }
        }
        return getFirstName() + "." + subArr + getiD().substring(5) + "@sinhvien.hoasen.edu.vn"; 
    }


    public Student(){
        this.iD = "";
        this.name = "";
    }

    public Student(String iD, String name){
        try{
            if(iD.matches("[a-zA-Z]{2}[0-9]{7}")){
                this.iD = iD;
            }
            else{
                throw new IDException();
            }
        }catch(IDException e){
            System.out.println(e.getMessage());
        }

        try{
            if(name.split("\\s+").length < 2){
                throw new NameException();
            }
            else{
                this.name = name;
            }
        }catch(NameException e){
            System.out.println(e.getMessage());
        }
    }

    public void inputID(){
        do{
            try{
                System.out.print("Nhap ID: ");
                this.iD = input.nextLine();
                if(!(this.getiD().matches("[a-zA-Z]{2}[0-9]{7}"))){
                    throw new IDException();
                }
            }
            catch(IDException e){
                System.out.println(e.getMessage());
            }
        }while(!(this.getiD().matches("[a-zA-Z]{2}[0-9]{7}")));
    }

    public void inputName(){
        do{
            try{
                System.out.print("Nhap ten: ");
                this.name = input.nextLine();
                if(this.getName().split("\\s+").length < 2){
                    throw new NameException();
                }
            }catch(NameException e){
                System.out.println(e.getMessage());
            }
        }while(this.getName().split("\\s+").length < 2);
    }

    public void input(){

        this.inputID();
        this.inputName();
        // do{
        //     System.out.print("Nhap ID: ");
        //     this.iD = input.nextLine();
        //     if(!(this.getiD().matches("[a-zA-Z]{2}[0-9]{7}"))){
        //         System.out.println("ID khong hop le!");
        //     }
        // }while(!(this.getiD().matches("[a-zA-Z]{2}[0-9]{7}")));

        // do{
        //     System.out.print("Nhap ten: ");
        //     this.name = input.nextLine();
        //     if(this.getName().split("\\s+").length < 2){
        //         System.out.println("Ten khong hop le!");
        //     }
        // }while(this.getName().split("\\s+").length < 2);
        
    }

    public String output(){
        return String.format("%-10s%-10s%15s%37s\n", this.getiD(), this.getLastName(), this.getFirstName(), this.getEmail());
    }

    @Override
    public int compareTo(Student o) {
        int temp = this.getiD().compareTo(o.getiD());
        if(temp < 0){
            return 1;
        }else if(temp == 0){
            return 0;
        }
        else{
            return -1;
        }
    }
}

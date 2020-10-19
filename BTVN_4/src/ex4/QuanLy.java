package ex4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class QuanLy {
    Scanner sc = new Scanner(System.in);
    private String qLCode;
    private String qLName;

    public QuanLy(){

    }

    public QuanLy(String qLCode, String qLName) {
        this.qLCode = qLCode;
        this.qLName = qLName;
    }

    public String getqLCode() {
        return qLCode;
    }

    public void setqLCode(String qLCode) {
        this.qLCode = qLCode;
    }

    public String getqLName() {
        return qLName;
    }

    public void setqLName(String qLName) {
        this.qLName = qLName;
    }
    public void Input(){
        System.out.print("Input Quan Ly Code: ");
        qLCode = sc.nextLine();
        System.out.print("Input Quan Ly Name: ");
        qLName = sc.nextLine();
    }
    public void Output(){
        System.out.println("Quan Ly Code: " + getqLCode());
        System.out.println("Quan Ly Name: " + getqLName());
    }
}

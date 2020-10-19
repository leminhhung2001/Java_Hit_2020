package ex2;

import java.util.Scanner;

public class NhanSu {
    Scanner sc = new Scanner(System.in);
    private String nhanSuCode;
    private String name;
    Date d = new Date();
    public  NhanSu(){

    }
    public NhanSu(String nhanSuCode, String name) {
        this.nhanSuCode = nhanSuCode;
        this.name = name;
    }

    public String getNhanSuCode() {
        return nhanSuCode;
    }

    public void setNhanSuCode(String nhanSuCode) {
        this.nhanSuCode = nhanSuCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Input(){
        System.out.print("Input Nhan Su Code: ");
        nhanSuCode = sc.nextLine();
        System.out.print("Input Nhan Su Name: ");
        name = sc.nextLine();
        d.Input();
    }
    public void Output(){
        System.out.println(" Nhan Su Code: " + getNhanSuCode());
        System.out.print(" Input Nhan Su Name: " + getName());
        d.Output();
    }
}

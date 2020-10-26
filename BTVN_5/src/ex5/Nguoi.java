package ex5;

import java.util.Scanner;

public class Nguoi {
    Scanner sc = new Scanner(System.in);
    private String hoTen;
    private String ngaySinh;
    private String queQuan;

    public Nguoi(){

    }
    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public void Input(){
        System.out.print("Ho Ten: ");
        hoTen = sc.nextLine();
        System.out.print("Ngay Sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Que Quan: ");
        queQuan = sc.nextLine();
    }

    public void Output(){
        System.out.println("Ho Ten: " + getHoTen());
        System.out.println("Ngay Sinh: " + getNgaySinh());
        System.out.println("Que Quan: " + getQueQuan());
    }
}

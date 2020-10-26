package ex3;

import java.util.Scanner;

public class DateTime {
    Scanner sc = new Scanner(System.in);
    private int ngay, thang, nam;


    public DateTime(){
        this.ngay = 0;
        this.thang = 0;
        this.nam = 0;
    }
    public DateTime(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void InputDate(){
        System.out.print("Ngay: ");
        ngay = sc.nextInt();
        System.out.print("Thang: ");
        thang = sc.nextInt();
        System.out.print("Nam: ");
        nam = sc.nextInt();
    }
    public void OutputDate(){
        System.out.println("Ngay: " + getNgay());
        System.out.println("Thang: " + getThang());
        System.out.println("Nam: " + getNam());
    }
}

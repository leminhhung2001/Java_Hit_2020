package buoi_4;

import java.util.Scanner;

public class Date {
    private int d, m, y;

    public Date(){

    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        d = sc.nextInt();
        System.out.print("Nhap thang: ");
        m = sc.nextInt();
        System.out.println("Nhap nam: ");
        y = sc.nextInt();
    }
    public void HienThi(){
        System.out.println(d + "  " + m + " "  + y);
    }
    public Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

package ex2;

import java.util.Scanner;

public class Date {
    Scanner sc = new Scanner(System.in);
    private int dd, mm, yy;

    public Date(){

    }
    public Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }

    public void Input(){
        System.out.print("Input Day: ");
        dd = sc.nextInt();
        System.out.print("Input Month: ");
        mm = sc.nextInt();
        System.out.print("Input Year: ");
        yy = sc.nextInt();
    }

    public void Output(){
        System.out.println(" Day: " + getDd());
        System.out.println(" Month: " + getMm());
        System.out.println(" Year: " + getYy());
    }
}

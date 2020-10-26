package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class PHIEU {
        Scanner sc = new Scanner(System.in);
        DateTime a = new DateTime();
        ArrayList<SANPHAM> x = new ArrayList<>();
        int n;
        private String maPhieu;
        private String tenPhieu;

    public PHIEU(){

    }
    public PHIEU(Scanner sc, DateTime a, ArrayList<SANPHAM> x, int n, String maPhieu, String tenPhieu) {
        this.sc = sc;
        this.a = a;
        this.x = x;
        this.n = n;
        this.maPhieu = maPhieu;
        this.tenPhieu = tenPhieu;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public DateTime getA() {
        return a;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public ArrayList<SANPHAM> getX() {
        return x;
    }

    public void setX(ArrayList<SANPHAM> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getTenPhieu() {
        return tenPhieu;
    }

    public void setTenPhieu(String tenPhieu) {
        this.tenPhieu = tenPhieu;
    }

    public void InputPhieu(){
        System.out.print("Ma Phieu: ");
        maPhieu = sc.nextLine();
        System.out.print("Ten Phieu: ");
        tenPhieu = sc.nextLine();
        a.InputDate();
        System.out.print("Nhap SL SP n = ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            SANPHAM k = new SANPHAM();
            k.InputSP();
            x.add(k);
        }
    }

    public void OutputPhieu(){
        System.out.println("========================================================");
        System.out.println("Ma Phieu: " + getMaPhieu());
        System.out.println("Ten Phieu: " + getTenPhieu());
        a.OutputDate();
        for (int i = 0; i < x.size(); i++) {
            x.get(i).OutputSP();
        }
    }
}

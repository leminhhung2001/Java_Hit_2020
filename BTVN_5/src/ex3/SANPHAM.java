package ex3;

import java.util.Scanner;

public class SANPHAM {
    Scanner sc = new Scanner(System.in);
    private String maSP;
    private String tenSP;
    private int soLuong;
    private float donGia;


    public SANPHAM() {
        this.maSP = "";
        this.tenSP = "";
        this.soLuong = 0;
        this.donGia = 0;
    }
    public SANPHAM(String maSP, String tenSP, int soLuong, float donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    public void InputSP(){
        System.out.print("Ma SP: ");
        maSP = sc.nextLine();
        System.out.print("Ten SP: ");
        tenSP = sc.nextLine();
        System.out.print("So Luong: ");
        soLuong = sc.nextInt();
        System.out.print("Don Gia: ");
        donGia = sc.nextFloat();
    }
    public void OutputSP(){
        System.out.println("Ma SP: " + getMaSP());
        System.out.println("Ten SP: " + getTenSP());
        System.out.println("So Luong: " + getSoLuong());
        System.out.println("Don Gia: " + getDonGia());
        System.out.println("Thanh tien: " + getDonGia()*getSoLuong());
    }
}

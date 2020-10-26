package ex1;

import java.util.Scanner;

public class SanPham {
    Scanner sc = new Scanner(System.in);
    private String maSP;
    private String tenSP;
    private String tenHangSX;
    private String ngayNhap;

    public SanPham(){
        this.maSP = "";
        this.tenSP = "";
        this.tenHangSX = "";
        this.ngayNhap = "";
    }

    public SanPham(String maSP, String tenSP, String tenHangSX, String ngayNhap) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.tenHangSX = tenHangSX;
        this.ngayNhap = ngayNhap;
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

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void Nhap(){
        System.out.print("Ma SP: ");
        maSP = sc.nextLine();
        System.out.print("Ten SP: ");
        tenSP = sc.nextLine();
        System.out.print("Ten Hang SX: ");
        tenHangSX = sc.nextLine();
        System.out.print("Ngay Nhap: ");
        ngayNhap = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma SP: " + getMaSP());
        System.out.println("Ten SP: " + getTenSP());
        System.out.println("Ten Hang SX: " + getTenHangSX());
        System.out.println("Ngay Nhap: " + getNgayNhap());
    }
}

package hang;

import java.util.Scanner;

public class SanPham {
    Scanner sc = new Scanner(System.in);
    private String maSP;
    private String tenSP;
    private String tenHang;
    private String ngayNhap;

    public SanPham(){

    }
    public SanPham(String maSP, String tenSP, String tenHang, String ngayNhap) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.tenHang = tenHang;
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

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

//    @Override
//    public String toString() {
//        return "SanPham{" +
//                "maSP='" + maSP + '\'' +
//                ", tenSP='" + tenSP + '\'' +
//                ", tenHang='" + tenHang + '\'' +
//                ", ngayNhap='" + ngayNhap + '\'' +
//                '}';
//    }

    public void nhap(){
        System.out.print("Nhap ma SP: ");
        maSP = sc.nextLine();
        System.out.print("Nhap ten Sp");
        tenSP = sc.nextLine();
        System.out.print("Nhap ten HangSX: ");
        tenHang = sc.nextLine();
        System.out.print("Ngay nhap: ");
        ngayNhap = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Nhap ma SP: " + getMaSP());
        System.out.println("Nhap ten Sp" + getTenSP());
        System.out.println("Nhap ten HangSX: " + getTenHang());
        System.out.println("Ngay nhap: " + getNgayNhap());
    }
}

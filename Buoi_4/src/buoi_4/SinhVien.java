package buoi_4;

import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private Date ngaySinh;


    public void InputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        ngaySinh = new Date();
        ngaySinh.Input();
    }
    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public SinhVien(String maSinhVien, String hoTen, Date ngaySinh) {
        this.ngaySinh = ngaySinh;
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
    }
    public SinhVien(){

    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void HienTHi(){
        System.out.print("Ma SV: " + maSinhVien);
        System.out.println("   Ho Ten: " + hoTen);
        ngaySinh.HienThi();
    }

    public void HienTHi(int stt){
        System.out.println("STT: " + stt);
        System.out.print("Ma SV: " + maSinhVien);
        System.out.println("   Ho Ten: " + hoTen);
    }
}

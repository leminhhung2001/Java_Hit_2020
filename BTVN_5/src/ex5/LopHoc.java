package ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
    Scanner sc = new Scanner(System.in);
    private String maLH;
    private String tenLH;
    private String ngayMo;
    ArrayList<SinhVien> SV = new ArrayList<>();
    int n;
    private String tenGiaoVien;

    public LopHoc(){

    }
    public LopHoc(String maLH, String tenLH, String ngayMo, ArrayList<SinhVien> SV, int n, String tenGiaoVien) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.SV = SV;
        this.n = n;
        this.tenGiaoVien = tenGiaoVien;
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public ArrayList<SinhVien> getSV() {
        return SV;
    }

    public void setSV(ArrayList<SinhVien> SV) {
        this.SV = SV;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getTenGiaoVien() {
        return tenGiaoVien;
    }

    public void setTenGiaoVien(String tenGiaoVien) {
        this.tenGiaoVien = tenGiaoVien;
    }

    public void Input(){
        System.out.print("Ma lop hoc: ");
        maLH = sc.nextLine();
        System.out.print("Ten lop hoc: ");
        tenLH = sc.nextLine();
        System.out.print("Ngay mo: ");
        ngayMo = sc.nextLine();
        System.out.print("Nhap so SV n = ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien();
            x.Input();
            SV.add(x);
        }
        sc.nextLine();
        System.out.print("Ten GV: ");
        tenGiaoVien = sc.nextLine();
    }
    public void Output(){
        System.out.println("Ma lop hoc: " + getMaLH());
        System.out.println("Ten lop hoc: " + getTenLH());
        System.out.println("Ngay mo: " + getNgayMo());
        for (int i = 0; i < SV.size(); i++) {
            SV.get(i).Output();
        }
        System.out.println("Ten GV: " + getTenGiaoVien());
    }
    public void Dem_k14(){
        int d = 0;
        for (int i = 0; i < SV.size(); i++) {
            if(SV.get(i).getKhoaHoc() == 14) d++;
        }
        if(d == 0) System.out.println("======Khong co SV K14 nao trong lop");
        else System.out.println("Co " + d + " SV K14 trong lop");
    }
    public void SapXep(){
        for (int i = 0; i < SV.size()-1; i++) {
            for (int j = SV.size()-1; j > i ; j--) {
                if(SV.get(j).getKhoaHoc() < SV.get(j-1).getKhoaHoc()){
                    SinhVien k = SV.get(j);
                    SV.set(j, SV.get(j-1));
                    SV.set(j-1, k);
                }
            }
        }
    }
}

package main;


public class SinhVien {
    private static int code = 1;
    private String maSinhVien;
    private String hoTen;

    public SinhVien(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public SinhVien(){
        maSinhVien = hoTen = " ";
    }
    public SinhVien(String hoTen){
        this.hoTen = hoTen;
    }
    public SinhVien(String hoTen, String maSinhVien){
        this.hoTen = hoTen;
        this.maSinhVien = maSinhVien;
    }
    public void HienThi(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Code: " + code);
    }
    public String getMaSinhVien(){
        return maSinhVien;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setMaSinhVien(String x){
        this.maSinhVien = x;
    }
    public void setHoTen(String k){
        this.maSinhVien = k;
    }

}

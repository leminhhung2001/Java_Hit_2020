package bai3;

public class HangHoa {
    private String maHang;
    private String tenHang;
    private float donGia;
    private int soLuong;

    public HangHoa(String maHang, String tenHang, float donGia, int soLuong) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public HangHoa() {
        this.maHang = "";
        this.tenHang = "";
        this.donGia = 0;
        this.soLuong = 0;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void Xuat(){
        System.out.println("  Ma Hang: " + maHang);
        System.out.println("  Ten Hang: " + tenHang);
        System.out.println("  So Luong: " + soLuong);
        System.out.println("  Don Gia: " + donGia);
        System.out.println("  Thanh Tien: " + soLuong * donGia);
    }
}

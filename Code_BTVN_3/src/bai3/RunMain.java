package bai3;

public class RunMain {
    public static void main(String[] args) {
        HangHoa h1 = new HangHoa("can", "thuoc la", 500, 400);
        HangHoa h2 = new HangHoa();

        h2.setMaHang("gfdg");
        h2.setTenHang("fdsg");
        h2.setDonGia(4);
        h2.setSoLuong(56);

        h1.Xuat();;
        h2.Xuat();


    }
}

package buoi_4;

public class RunMain {
    public static void main(String[] args) {
        SinhVien [] arrSV = new SinhVien[2];
        for (int i = 0; i <arrSV.length ; i++) {
            arrSV[i] = new SinhVien();
            arrSV[i].InputInfor();
            //arrSV[i].setHoTen("hung" + i);
            //arrSV[i].setMaSinhVien("" + (i+1));
        }
        for (SinhVien x: arrSV) {
            x.HienTHi();
        }
    }
}

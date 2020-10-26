package ex5;

public class SinhVien extends Nguoi{
    private String maSV;
    private String nganh;
    private int khoaHoc;

    public SinhVien() {
        this.maSV = "";
        this.nganh = "";
        this.khoaHoc = 0;
    }

    public SinhVien(String hoTen, String ngaySinh, String queQuan, String maSV, String nganh, int khoaHoc) {
        super(hoTen, ngaySinh, queQuan);
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.print("Ma SV: ");
        maSV = sc.nextLine();
        System.out.print("Nganh hoc: ");
        nganh = sc.nextLine();
        System.out.print("Khoa hoc: ");
        khoaHoc = sc.nextInt();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Ma SV: " + getMaSV());
        System.out.println("Nganh hoc: " + getNganh());
        System.out.println("Khoa hoc: " + getKhoaHoc());
    }
}

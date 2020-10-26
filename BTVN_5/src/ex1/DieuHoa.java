package ex1;

public class DieuHoa extends SanPham{
    private float congSuat;
    private float giaBan;

    public DieuHoa(){
        super();
        this.congSuat = 0;
        this.giaBan = 0;
    }

    public DieuHoa(String maSP, String tenSP, String tenHangSX, String ngayNhap, float congSuat, float giaBan) {
        super(maSP, tenSP, tenHangSX, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public float getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    public void Nhap(){
        super.Nhap();
        System.out.print("Cong Suat: ");
        congSuat = sc.nextFloat();
        System.out.print("Gia Ban: ");
        giaBan = sc.nextFloat();
    }

    public void Xuat(){
        super.Xuat();
        System.out.println("Cong Suat: " + getCongSuat());
        System.out.println("Gia Ban: " + getGiaBan());
    }
}

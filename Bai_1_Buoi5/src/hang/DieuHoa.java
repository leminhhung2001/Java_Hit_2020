package hang;

public class DieuHoa extends SanPham{
    private float congSuat;
    private float giaBan;

    public DieuHoa() {

    }

    public DieuHoa(String maSP, String tenSP, String tenHang, String ngayNhap, float congSuat, float giaBan) {
        super(maSP, tenSP, tenHang, ngayNhap);
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

    public void nhap(){
        super.nhap();
        System.out.print("Cong Suat: ");
        congSuat = sc.nextFloat();
        System.out.print("Gia Ban: ");
        giaBan = sc.nextFloat();
    }
    public void xuat(){
        super.xuat();
        System.out.println("Cong Suat: " + getCongSuat());
        System.out.println("Gia Ban: " + getGiaBan());
    }
}

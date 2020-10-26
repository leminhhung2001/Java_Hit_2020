package ex2;

public class RunMain {
    public static void main(String[] args) {
        SoPhuc u = new SoPhuc();
        SoPhuc v = new SoPhuc();
        u.Nhap();
        v.Nhap();

        SoPhuc k = new SoPhuc();
        k = u.Cong(v);
        k.Xuat();

        k = u.Tru(v);
        k.Xuat();
    }
}

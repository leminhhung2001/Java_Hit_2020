package ex5;

public class RunMain {
    public static void main(String[] args) {
        LopHoc L = new LopHoc();
        L.Input();
        L.Output();
        L.Dem_k14();

        System.out.println("==========SAP XEP DANH SACH THEO CHIEU TANG DAN KHOA HOC==============");
        L.SapXep();
        L.Output();
    }



}

package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DieuHoa> dieuHoas = new ArrayList<>();
        int n;
        System.out.print("Nhap SL Dieu Hoa n =  ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            DieuHoa x = new DieuHoa();
            x.Nhap();
            dieuHoas.add(x);
        }
        for (int i = 0; i < dieuHoas.size(); i++) {
            dieuHoas.get(i).Xuat();
        }
        float giaThapNhat = 0;
        System.out.println("==================================================");
        for (int i = 0; i < n; i++) {
            int k = dieuHoas.get(i).getTenHangSX().compareTo("Electrolux");
            if(k == 0){
                giaThapNhat = dieuHoas.get(i).getGiaBan();
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            int k = dieuHoas.get(i).getTenHangSX().compareTo("Electrolux");
            if(k == 0 && dieuHoas.get(i).getGiaBan() < giaThapNhat){
                giaThapNhat = dieuHoas.get(i).getGiaBan();
            }
        }
        System.out.println("Gia thap nhat: " + giaThapNhat);
        for (int i = 0; i < n; i++) {
            if(dieuHoas.get(i).getTenHangSX().compareTo("Electrolux") == 0 && dieuHoas.get(i).getGiaBan() == giaThapNhat){
                    dieuHoas.get(i).Xuat();
            }
        }
    }
}

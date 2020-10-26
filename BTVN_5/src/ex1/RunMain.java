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

        float min = 100000000f;
        for (int i = 0; i < dieuHoas.size(); i++) {
            if(dieuHoas.get(i).getGiaBan() < min){
                min = dieuHoas.get(i).getGiaBan();
            }
        }
        System.out.println("==================================================");
        for (int i = 0; i < n; i++) {
            if(dieuHoas.get(i).getTenHangSX().equals("Electrolux") && dieuHoas.get(i).getGiaBan() == min){
                dieuHoas.get(i).Xuat();
            }
        }

    }
}

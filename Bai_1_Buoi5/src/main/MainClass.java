package main;

import hang.DieuHoa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dieu hoa n = ");
        int n = sc.nextInt();
        ArrayList<DieuHoa> dieuHoas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            DieuHoa dh = new DieuHoa();
            dh.nhap();
            dieuHoas.add(dh);
        }
        float min = 1000000.4f;
        for (int i = 0; i <dieuHoas.size() ; i++){
            if(dieuHoas.get(i).getGiaBan() > min){
                min = dieuHoas.get(i).getGiaBan();
            }
        }
        for (int i = 0; i <dieuHoas.size() ; i++) {
            if(dieuHoas.get(i).getTenHang() == "Electronlux" &&
            dieuHoas.get(i).getGiaBan() > min){
                System.out.println(dieuHoas);
            }
        }
    }

}

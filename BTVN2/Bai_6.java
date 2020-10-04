package Main;

import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S;
        System.out.println("Nhap chuoi S = ");
        S = scanner.nextLine();
        //S = S.trim(); // xoa khoang trang dau va cuoi
        S = S.trim().replaceAll(" +", " ");
        System.out.println(S);
    }
}

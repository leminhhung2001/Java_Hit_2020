package Main;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n, p;
        System.out.println("Nhap n = ");
        n = scanner.nextInt();
        System.out.println("Nhap m = ");
        m = scanner.nextInt();
        System.out.println("Nhap p = ");
        p = scanner.nextInt();
        System.out.println("Max cua 3 so la: " + timMax(n, m, p));
    }
    public static int timMax(int a, int b, int c){
        int max = (a > b) ? a : b;
        int max1 = (max > c) ? max : c;
        return max1;
    }

}

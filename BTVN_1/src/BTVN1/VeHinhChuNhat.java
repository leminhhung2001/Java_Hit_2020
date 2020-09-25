package main;

import java.util.Scanner;

public class VeHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        System.out.println("Nhập chiều dài hình chữ nhật n = ");
        n = scanner.nextInt();
        System.out.println("Nhập chiều rộng hình chữ nhật m = ");
        m = scanner.nextInt();
        for (int i = 1; i <= m ; i++) {
            System.out.print("*");
            if(i == 1 || i == m){
                int k = n;
                while (k != 1){
                    System.out.print("*");
                    k--;
                }
                System.out.println("");
            }
            else
                for (int j = 2; j <= n ; j++) {
                    if(j == n){
                        System.out.println("*");
                    }
                    else
                        System.out.print(" ");
                }
        }
    }
}

package Main;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu cua mang: ");
        n = scanner.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sapXep(a, n);
        System.out.println("");
        maxMinArray(a, n);

    }
    public static void sapXep(int a[], int n){
        for (int i = 0; i < n - 1; i++) {
            for (int j = n-1; j > i ; j--) {
                if(a[j-1] > a[j]){
                    int k = a[j];
                    a[j] = a[j-1];
                    a[j-1] = k;
                }
            }
        }
    }

    public static void maxMinArray(int a[], int n){
        System.out.println("Max = " + a[n-1]);
        System.out.println("Min = " + a[0]);
    }
}

package Main;

import java.util.Scanner;

public class Bai_4 {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean isPrime(int k){
        if(k < 2) return false;
        else {
            for(int i=2; i*i <= k; i++){
                if (k % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu n = ");
        int n = scanner.nextInt();
        int[] prime = new int[n];
        int[] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n ; i++) {
            do{
                a[i] = scanner.nextInt();
            }while (a[i] < 0);
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(a[i])){
                prime[j] = a[i];
                j++;
            }
        }
        int S = 0;
        for (int i = 0; i <= a.length-1 ; i++) {
            S += (isPrime(a[i]) ? a[i] + prime[i] - i : a[i]);
        }
        System.out.println(S);
    }
}

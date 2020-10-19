package bai4;

import com.sun.istack.internal.localization.NullLocalizable;

import java.util.Scanner;

public class Array {
    Scanner scanner = new Scanner(System.in);
    private int n;
    private int[] a;

    public Array(int n, int[] a) {
        this.n = n;
        this.a = a;
    }

    public Array() {
        this.n = 0;
        this.a = a;
    }


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void InputData(){
        System.out.print("Nhap so luong phan tu cua mang n = ");
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("  a[" + i +"] = ");
            a[i] = scanner.nextInt();
        }
    }
    public void Show(){
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
    }
    public int Sum(){
        int S = 0;
        for (int i = 0; i < n; i++) {
            S += a[i];
        }
        return S;
    }
}

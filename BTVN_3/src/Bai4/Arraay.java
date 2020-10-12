/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Arraay {
    Scanner sc = new Scanner(System.in);
    private int [] a;
    private int n;

    public Arraay() {
    }

    public Arraay(int[] a, int n) {
        this.a = a;
        this.n = n;
    }
    
    
    public void InputData(){
        System.out.printf("Nhập số phần tử mảng n = ");
        n = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = sc.nextInt();
    }
    
    public void Show(){
        for (int i=0; i<n; i++)
            System.out.printf(a[i] + " ");
    }
    
    public int Sum(){
        int T = 0;
        for (int i=0; i<n; i++)
            T += a[i];
        return T;
    }
    
    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        Arraay arr1 = new Arraay();
        Arraay arr2 = new Arraay();
        System.out.println("Nhập mảng 1:");
        arr1.InputData();
        System.out.println("Nhập mảng 2:");
        arr2.InputData();
        
        if (arr1.Sum()/arr1.getN() > arr2.Sum()/arr2.getN()){
            System.out.printf("Mảng có TBC các phần tử lớn hơn là: ");
            arr1.Show();
        }
        else if (arr1.Sum()/arr1.getN() < arr2.Sum()/arr2.getN()){
            System.out.printf("Mảng có TBC các phần tử lớn hơn là: ");
            arr2.Show();
        }
        else{
            System.out.println("Hi");
        }
        System.out.println(" ");
    }
}

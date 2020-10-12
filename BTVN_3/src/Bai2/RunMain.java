/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        Dog cun = new Dog();
        cun.InputName("Bông");
        
        for (int i=0; i<3; i++){
            System.out.println("*Lần " + (i + 1) +": ");
            cun.Bark();
            cun.ShowMP();
        }
    }
}

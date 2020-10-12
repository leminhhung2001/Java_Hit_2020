/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        Person DoanXinhGai = new Person("Doan Xinh Gái", "1/1/2000", "Nữ", "Viết code");
        Person DiepBueDe = new Person("DiepBueDe", "2/1/2000", "Tím", "code xuyên đêm");
        System.out.println("Hiển thị thông tin người 1: ");
        System.out.println("    Tên: " + DoanXinhGai.getName());
        System.out.println("    Ngày sinh: " + DoanXinhGai.getDateOfBirth());
        System.out.println("    Giới tính: " + DoanXinhGai.getGender());
        System.out.println("    Sở thích: " + DoanXinhGai.getHoppy());
        System.out.println("Hiển thị thông tin người 2: ");
        System.out.println("    Tên: " + DiepBueDe.getName());
        System.out.println("    Ngày sinh: " + DiepBueDe.getDateOfBirth());
        System.out.println("    Giới tính: " + DiepBueDe.getGender());
        System.out.println("    Sở thích: " + DiepBueDe.getHoppy());
    }
}

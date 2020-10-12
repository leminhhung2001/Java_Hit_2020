/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        Guns g1 = new Guns("Nobita", 1000);
        Guns g2 = new Guns("Jaian", 1000);

        while(g1.getAmmoNumber() > 0 && g2.getAmmoNumber() > 0){
            g1.Shoot(50);
            g1.Load(20);
            g2.Shoot(100);
            g2.Load(30);
        }
        System.out.println("KẾT THÚC TRÒ CHƠI");
        if (g1.getAmmoNumber() == 0){
            System.out.println(g1.getWeaponName() + " đã thua");
            System.out.println("Điểm: " + g1.getAmmoNumber());
            System.out.println(g2.getWeaponName() + " đã thắng");
            System.out.println("Điểm: " + g2.getAmmoNumber());
        }
        else {
            System.out.println(g2.getWeaponName() + " đã thua");
            System.out.println("Điểm: " + g2.getAmmoNumber());
            System.out.println(g1.getWeaponName() + " đã thắng");
            System.out.println("Điểm: " + g1.getAmmoNumber());
        }
    }
}

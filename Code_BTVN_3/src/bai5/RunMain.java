package bai5;

public class RunMain {
    public static void main(String[] args) {
        Guns a = new Guns("Sung Luc", 0);
        Guns b = new Guns("Sung tia", 100);


        a.Load(100);
        b.Load(500);

        while (a.getAmmoNumber() != 0 && b.getAmmoNumber() != 0) {
            a.Shoot(100);
            b.Shoot(20);
            if(a.getAmmoNumber() == 0){
                System.out.println("Sung luc thua");
                break;
            }
            if(b.getAmmoNumber() == 0){
                System.out.println("Sung tia thua");
                break;
            }
        }
    }
}

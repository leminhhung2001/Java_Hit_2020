package bai5;

public class Guns {
    private String weaponName;
    private int ammoNumber;


    public Guns(String weaponName, int ammoNumber) {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public Guns() {
    }


    public void Load(int x){
        ammoNumber += x;
    }

    public void Shoot(int x){
        if(ammoNumber == 0){
            System.out.println(weaponName + "Het dan");
        }
        if(ammoNumber - x >= 0) ammoNumber -= x;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
}

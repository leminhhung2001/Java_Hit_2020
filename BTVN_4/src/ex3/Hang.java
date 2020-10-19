package ex3;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Hang {
    Scanner sc = new Scanner(System.in);
    private String hangCode;
    private String hangName;
    private float price;

    public String gethangCode() {
        return hangCode;
    }

    public void sethangCode(String hangCode) {
        this.hangCode = hangCode;
    }

    public String gethangName() {
        return hangName;
    }

    public void sethangName(String hangName) {
        this.hangName = hangName;
    }
    public Hang(){

    }
    public Hang(String hangCode, String hangName, float price) {
        this.hangCode = hangCode;
        this.hangName = hangName;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void Input(){
        System.out.print("Hang Code: ");
        hangCode = sc.nextLine();
        System.out.print("Hang Name: ");
        hangName = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextFloat();
    }
    public void Output(){
        System.out.println("Hang Code: " + gethangCode());
        System.out.println("Hang Name: " + gethangName());
        System.out.println("Price: " + getPrice());
    }
}

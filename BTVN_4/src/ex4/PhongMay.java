package ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongMay {
    Scanner sc = new Scanner(System.in);
    private String phongCode;
    private String phongName;
    private float areaOfARoom;
    QuanLy q = new QuanLy();
    ArrayList<May> m = new ArrayList<>();
    private int n;

    public PhongMay(){

    }
    public PhongMay(String phongCode, String phongName, float areaOfARoom, QuanLy q, ArrayList<May> m, int n) {
        this.phongCode = phongCode;
        this.phongName = phongName;
        this.areaOfARoom = areaOfARoom;
        this.q = q;
        this.m = m;
        this.n = n;
    }

    public String getPhongCode() {
        return phongCode;
    }

    public void setPhongCode(String phongCode) {
        this.phongCode = phongCode;
    }

    public String getPhongName() {
        return phongName;
    }

    public void setPhongName(String phongName) {
        this.phongName = phongName;
    }

    public float getAreaOfARoom() {
        return areaOfARoom;
    }

    public void setAreaOfARoom(float areaOfARoom) {
        this.areaOfARoom = areaOfARoom;
    }

    public QuanLy getQ() {
        return q;
    }

    public void setQ(QuanLy q) {
        this.q = q;
    }

    public ArrayList<May> getM() {
        return m;
    }

    public void setM(ArrayList<May> m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void Input(){
        System.out.println("============INPUT INFOR==============");
        System.out.print("Input Phong Code: ");
        phongCode = sc.nextLine();
        System.out.print("Input Phong Name: ");
        phongName = sc.nextLine();
        System.out.print("Input Area Of The Room: ");
        areaOfARoom = sc.nextFloat();
        q.Input();
        System.out.print("Input The Number Of May In Room n = ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            May x = new May();
            x.Input();
            m.add(x);
        }
    }
    public void Output(){
        System.out.println("===========PRINT INFOR============");
        System.out.println("Phong Code: " + getPhongCode());
        System.out.println("Phong Code: " + getPhongName());
        System.out.println("Area Of The Room: " + getAreaOfARoom());
        q.Output();
        for (int i = 0; i < m.size(); i++) {
            m.get(i).Output();
        }

    }
}

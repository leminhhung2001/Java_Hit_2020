package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    Scanner sc = new Scanner(System.in);
    private String phieuCode;
    ArrayList<Hang> h = new ArrayList<>();
    private int n;

    public Phieu(){

    }

    public Phieu(String phieuCode, ArrayList<Hang> h, int n) {
        this.phieuCode = phieuCode;
        this.h = h;
        this.n = n;
    }

    public String getPhieuCode() {
        return phieuCode;
    }

    public void setPhieuCode(String phieuCode) {
        this.phieuCode = phieuCode;
    }

    public ArrayList<Hang> getH() {
        return h;
    }

    public void setH(ArrayList<Hang> h) {
        this.h = h;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void Input(){
        System.out.println("=============INPUT INFOR==============");
        System.out.print("Phieu Code: ");
        phieuCode = sc.nextLine();
        System.out.print("The number of Hangs n = ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Hang x = new Hang();
            x.Input();
            h.add(x);
        }
    }
    public void Output(){
        System.out.println("==============PRINT INFOR===============");
        System.out.println("Phieu Code: " + getPhieuCode());
        for (int i = 0; i < h.size(); i++) {
            h.get(i).Output();
        }
    }


}

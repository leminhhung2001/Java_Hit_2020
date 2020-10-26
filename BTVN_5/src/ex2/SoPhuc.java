package ex2;

import java.util.Scanner;

public class SoPhuc {
    Scanner sc = new Scanner(System.in);
    private float thuc_a;
    private float ao_b;

    public SoPhuc(float thuc_a, float ao_b) {
        this.thuc_a = thuc_a;
        this.ao_b = ao_b;
    }
    public SoPhuc(){
        this.thuc_a = 0;
        this.ao_b = 0;
    }

    public float getthuc_a() {
        return thuc_a;
    }

    public void setthuc_a(float thuc_a) {
        this.thuc_a = thuc_a;
    }

    public float getao_b() {
        return ao_b;
    }

    public void setao_b(float ao_b) {
        this.ao_b = ao_b;
    }
    public void Nhap(){
        System.out.print("Phan thuc_a = ");
        thuc_a = sc.nextFloat();
        System.out.print("Phan ao_b = ");
        ao_b = sc.nextFloat();
    }
    public void Xuat(){
        System.out.println("So Phuc la: " + getthuc_a() + " + i*" + getao_b());
    }
    public SoPhuc Cong(SoPhuc k){
        SoPhuc x = new SoPhuc();
        x.thuc_a = thuc_a + k.thuc_a;
        x.ao_b = ao_b + x.ao_b;
        return x;
    }
    public SoPhuc Tru(SoPhuc k){
        SoPhuc x = new SoPhuc();
        x.thuc_a = thuc_a - k.thuc_a;
        x.ao_b = ao_b - x.ao_b;
        return x;
    }
}

package ex4;

import sun.plugin2.message.JavaScriptCallMessage;

import java.util.Scanner;

public class SinhVien {
    Scanner sc = new Scanner(System.in);
    private String id;
    private String name;
    private int age;
    private String address;
    private float gpa;

    public  SinhVien(){

    }
    public SinhVien(String id, String name, int age, String address, float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public void InputSV(){
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Gpa: ");
        gpa = sc.nextFloat();
    }
    public void OutputSV(){
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Gpa: " + getGpa());
    }
}

package ex2;

import java.util.Scanner;

public class Document {
    Scanner sc = new Scanner(System.in);
    private String id;
    private String publisher;
    private String name;
    private float price;


    public Document(){

    }
    public Document(String id, String publisher, String name, float price) {
        this.id = id;
        this.publisher = publisher;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void Input(){
        System.out.print("Input ID: ");
        id = sc.nextLine();
        System.out.print("Input Publisher: ");
        publisher = sc.nextLine();
        System.out.print("Input Name: ");
        name = sc.nextLine();
        System.out.print("Input Price: ");
        price = sc.nextFloat();
    }

    public void Output(){
        System.out.println("Input ID: " + getId());
        System.out.println("Input Publisher: " + getPublisher());
        System.out.println("Input Name: " + getName());
        System.out.println("Input Price: " + getPrice());
    }
}

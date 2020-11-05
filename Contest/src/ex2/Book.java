package ex2;

import java.util.Scanner;

public class Book extends Document{
    Scanner sc = new Scanner(System.in);
    private int numberOfPage;
    private String author;

    public Book() {

    }

    public Book(String id, String publisher, String name, float price, int numberOfPage, String author) {
        super(id, publisher, name, price);
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void Input(){
        super.Input();
        System.out.print("The number of the Page: ");
        numberOfPage = sc.nextInt();
        System.out.print("Author Name: ");
        sc.nextLine();
        author = sc.nextLine();
    }
    public void Output(){
        super.Output();
        System.out.println("The number of the Page: " + getNumberOfPage());
        System.out.println("Author Name: " + getAuthor());
    }
}

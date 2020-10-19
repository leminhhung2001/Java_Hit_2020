package ex1;

import java.util.Scanner;

public class Book {
    Scanner sc = new Scanner(System.in);
    private String bookCode;
    private String bookName;
    private String pCompany;
    private int numberOfPages;
    private float prices;

    public Book(){

    }
    public Book(String bookCode, String bookName, String pCompany, int numberOfPages, float prices) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.pCompany = pCompany;
        this.numberOfPages = numberOfPages;
        this.prices = prices;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getpCompany() {
        return pCompany;
    }

    public void setpCompany(String pCompany) {
        this.pCompany = pCompany;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getPrices() {
        return prices;
    }

    public void setPrices(float prices) {
        this.prices = prices;
    }
    public void Input(){
        System.out.print("Book Code: ");
        bookCode = sc.nextLine();
        System.out.print("Book Name: ");
        bookName = sc.nextLine();
        System.out.print("Publishing Copany: ");
        pCompany = sc.nextLine();
        System.out.print("Number Of Pages: ");
        numberOfPages = sc.nextInt();
        System.out.print("Price: ");
        prices = sc.nextFloat();
    }
    public void Output(){
        System.out.println("Book Code: " + getBookCode());
        System.out.println("Book Name: " + getBookName());
        System.out.println("Publishing Copany: " + getpCompany());
        System.out.println("Number Of Pages: " + getNumberOfPages());
        System.out.println("Price: " + getPrices());
    }
}

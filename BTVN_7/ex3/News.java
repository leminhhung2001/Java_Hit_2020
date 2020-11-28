package ex3;

import java.util.Scanner;

public class News implements INews{
    Scanner sc = new Scanner(System.in);
    protected int id;
    protected String title;
    protected String publishDate;
    protected String author;
    protected String content;
    protected float averageRate;

    int[] rateLish = new int[3];


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }


    @Override
    public void Display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Publish Date: " + getPublishDate());
        System.out.println("Author: " + getAuthor());
        System.out.println("Content: " + getContent());
        System.out.println("Average Rate: " + getAverageRate());
    }
    public void InputRate(){
        for (int i = 0; i < rateLish.length; i++) {
            rateLish[i] = sc.nextInt();
        }
        sc.nextLine();
    }
    public void Calculate(){
        averageRate = 0;
        for(int i=0; i<rateLish.length; i++){
            averageRate += rateLish[i];
        }
        averageRate /= 3;
    }

}

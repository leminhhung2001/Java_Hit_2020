package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<News> arrayList = new ArrayList<>();
        int choice;
        do{
            System.out.println("===========Hello Everyone============");
            System.out.println("1 - Insert News");
            System.out.println("2 - View List News");
            System.out.println("3 - Average Rate");
            System.out.println("4 - Exit");
            System.out.print("Please, choose: ");
            choice = sc.nextInt();
            switch (choice){
                case 1: Create(arrayList); break;
                case 2: Show(arrayList); break;
                case 3: ShowResult(arrayList); break;
                case 4: System.exit(0);
            }
        }while (true);
    }
    public static void Create(ArrayList<News> arrayList){
        News news = new News();
        System.out.print("Input ID: ");
        news.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Input Title: ");
        news.setTitle(sc.nextLine());
        System.out.print("Input Publish Date: ");
        news.setPublishDate(sc.nextLine());
        System.out.print("Input Author: ");
        news.setAuthor(sc.nextLine());
        System.out.print("Input Content: ");
        news.setContent(sc.nextLine());
        System.out.println("======Input rate list=====");
        news.InputRate();
        arrayList.add(news);
    }
    public static void Show(ArrayList<News> arrayList){
        for (News x: arrayList ) {
            x.Display();
        }
    }
    public static void ShowResult(ArrayList<News> arrayList){
        for (News x: arrayList) {
            x.Calculate();
            x.Display();
        }
    }
}

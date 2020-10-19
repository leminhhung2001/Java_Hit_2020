package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("The Number Of Books n = ");
        n = sc.nextInt();
        System.out.println("==========INPUT INFOR=============");
        ArrayList<Book> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            Book x = new Book();
            x.Input();
            a.add(x);
        }
        System.out.println("==========PRINT INFOR============");
        for (int i = 0; i < a.size(); i++) {
            a.get(i).Output();
        }

    }

}

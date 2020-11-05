package ex1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int d = 0, kq = 0;
        for (int i = 0; i < k.length(); i++) {
            char h = k.charAt(i);
            if(Character.isDigit(h)){
                d++;
                kq += Integer.parseInt(k.valueOf(h));
            }
        }
        int m = 1;
        for (int i = 0; i < k.length(); i++) {
            char h = k.charAt(i);
            if(Character.isDigit(h)){
                int p = Integer.parseInt(k.valueOf(h));
                if(p != 0) {
                    if (kq % p == 0) {
                        m *= p;
                    }
                }
            }
        }
        System.out.println(d);
        System.out.println(m);
    }
}

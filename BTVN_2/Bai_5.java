package Main;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S;
        System.out.println("Nhap chuoi S = ");
        S = scanner.nextLine();
        double k = 0;
        int dem = 0;
        for(int i=0; i<S.length(); i++){
            char charI = S.charAt(i);
            if(Character.isDigit(charI)){
                k += Integer.parseInt(S.valueOf(charI));
                dem++;
            }
        }
        System.out.println("TBC cac so trong chuoi: " + k /dem);
    }
}

package Main;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S;
        System.out.println("Nhap chuoi S = ");
        //scanner.nextInt();
        S = scanner.nextLine();
        int k = 0, dem = 0;
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) > '0' && S.charAt(i) < '9'){
                k += Integer.parseInt(String.valueOf(S.charAt(i)));
                dem++;
            }
        }
        System.out.println("TBC cac so trong chuoi: " + 1.0 * k /dem);
    }
}

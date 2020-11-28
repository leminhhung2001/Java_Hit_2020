package ex6;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.trim().replaceAll(" +", " ");//xóa khoảng trắng ở đầu, ở cuối và ở giữa


        String result = "";
        String[] arrString = str.split(" ");//tách chuỗi tại dấu cách và trả về mảng chuỗi
        for (int i = 0; i < arrString.length ; i++) {//chuẩn hóa các kí tự đầu viết hoa
            result += Character.toUpperCase(arrString[i].charAt(0)) + arrString[i].substring(1);
            if(i < arrString.length - 1){
                result += " ";
            }
        }
        System.out.println(result);
    }




}

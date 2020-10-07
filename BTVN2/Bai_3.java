package ex3;

import java.util.Scanner;

public class MainClass {
    public static void ShowArray(int a[]){
        for(int k: a){
            System.out.print(k + " ");
        }
    }
    public static int[] AddElement(int a[]){
        Scanner scanner = new Scanner(System.in);
        int index = a.length + 1;
        int [] b = new int[index];
        System.out.print("Nhập phần tử cân chèn d = ");
        int d = scanner.nextInt();
        System.out.print("Chèn tại vị trí: j = ");
        int j = scanner.nextInt();
        int k = 0;
        for (int i = 0; i < index ; i++) {
            if(i == j){
                b[i] = d;
            }
            else {
                b[i] = a[k++];
            }
        }
        return b;
    }
    public static int[] DeleteElement(int[] a){
        Scanner scanner = new Scanner(System.in);
        int index = a.length - 1;
        int[] b = new int[index];
        System.out.print("Nhập vị trí cần xóa k = ");
        int k = scanner.nextInt();
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (i + 1 != k) {
                b[j++] = a[i];
            }
        }
        return b;
    }

    public static int[] ReverseArray(int[] a){
        int[] b = new int[a.length];
        int k = 0;
        for (int i = a.length-1; i >= 0; i--) {
            b[k++] = a[i];
        }
        return b;
    }

    public static void ShowDividedNumbers(int[] a){
        int b = a[1];
        System.out.println(b);
        for (int i = 0; i < a.length; i++) {
            if(a[i] % b == 0) System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+ i +"] = ");
            a[i] = scanner.nextInt();
        }
        int choice;
        do {

            System.out.println("\n----------------------MENU----------------------");
            System.out.println("1. Hiển thị mảng vừa tạo");
            System.out.println("2. Thêm một phần tử vào vị trí thứ k");
            System.out.println("3. Xóa một phần tử ở vị trí thứ k");
            System.out.println("4. Đảo ngược mảng");
            System.out.println("5. Hiển thị số a[1] và các số chia hết cho a[1]");
            System.out.println("6. Thoát.");

            System.out.print("Lựa chọn: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    ShowArray(a);
                    break;
                case 2:
                    a = AddElement(a);
                    break;
                case 3:
                    a = DeleteElement(a);
                    break;
                case 4:
                    a = ReverseArray(a);
                    break;
                case 5:
                    ShowDividedNumbers(a);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (choice != 7);
    }
}

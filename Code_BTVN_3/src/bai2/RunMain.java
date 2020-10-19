package bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog();
        System.out.println("Nhap ten: ");
        dog.InputName(scanner.nextLine());
        dog.Bark();
        dog.ShowMP();
        dog.Bark();
        dog.ShowMP();
        dog.Bark();
        dog.ShowMP();
    }
}

package ex4;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerStudent managerStudent = new ManagerStudent();
        SortStudentByName sortStudentByName = new SortStudentByName();
        int choose;
        while (true){
            System.out.println("-----------Menu------------");
            System.out.println("1. Add student.");
            System.out.println("2. Edit student by id.");
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort student by gpa.");
            System.out.println("5. Sort student by name.");
            System.out.println("6. Show student.");
            System.out.println("0. exit.");
            System.out.println("---------------------------");
            System.out.print("Please choose: ");
            choose = sc.nextInt();
            switch (choose){
                case 1: managerStudent.add(); break;
                case 2: managerStudent.Edit_Student_ID(); break;
                case 3: managerStudent.DeleteSTD_ID(); break;
                case 4: managerStudent.SortSTD_Gpa(); break;
                case 5: managerStudent.SortSTD_Name(); break;
                case 6: managerStudent.show(); break;
                case 0: return;
            }
        }

    }
}

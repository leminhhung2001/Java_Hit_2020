package ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
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
                case 1: AddNewStudent(list); break;
                case 2: EditStudentByID(list); break;
                case 3: DeleteStudentById(list); break;
                case 4: SortStudentByGpa(list); break;
                case 5: SortStudentByName(list); break;
                case 6: ShowStudent(list); break;
                case 0: return;
            }
        }
    }
    private static void AddNewStudent(ArrayList<Student> list){
        boolean checkExistsId = false;
        String id = "";
        do{
            System.out.print("Input new ID: ");
            id = sc.nextLine();
            checkExistsId = CheckExistsId(list, id);
            if(checkExistsId){
                System.out.println("Id already exists");
            }
            else break;
        }while (true);
        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Input address: ");
        String address = sc.nextLine();
        System.out.print("Input gpa: ");
        float gpa = sc.nextFloat();
        
        Student student = new Student(id,name, age, address, gpa);
        list.add(student);
        System.out.println("Added new student");
    }
    private static void EditStudentByID(ArrayList<Student> list){
        String name;
        int age;
        String address;
        float gpa;

        boolean checkExistsId = false;
        String id = "";
        System.out.print("Input Id Student need to edit: ");
        id = sc.nextLine();
        checkExistsId = CheckExistsId(list, id);
        if(checkExistsId){
            Student student = GetStudentById(list, id);
            int choice;
            do{
                System.out.println("1. Edit name.");
                System.out.println("2. Edit age.");
                System.out.println("3. Edit address.");
                System.out.println("4. Edit gpa.");
                System.out.print("Your choice: ");

                choice = sc.nextInt();

                switch (choice){
                    case 1:
                        System.out.print("Input name to edit: ");
                        sc.nextLine();
                        name = sc.nextLine();
                        student.setName(name);
                        System.out.println("Edited student name");
                        break;
                    case 2:
                        System.out.print("Input age to edit: ");
                        age = sc.nextInt();
                        student.setAge(age);
                        System.out.println("Edited student age");
                        break;
                    case 3:
                        System.out.print("Input address to edit: ");
                        sc.nextLine();
                        address = sc.nextLine();
                        student.setAddress(address);
                        System.out.println("Edited student address");
                        break;
                    case 4:
                        System.out.print("Input gpa to edit: ");
                        gpa = sc.nextFloat();
                        student.setGpa(gpa);
                        System.out.println("Edited student gpa");
                        break;
                }
            }while (choice >= 5 || choice <= 0);
        }
        else {
            System.out.println("Id does not exist");
        }
    }
    public static void SortStudentByGpa(ArrayList<Student> list){
        for(int i=0; i<list.size()-1; i++){
            for(int j=list.size()-1; j>i; j++){
                if(list.get(j).getGpa() < list.get(j-1).getGpa()){
                    Student x = list.get(j-1);
                    list.set(j-1, list.get(j));
                    list.set(j, x);
                }
            }
        }
    }
    private static void DeleteStudentById(ArrayList<Student> list){
        boolean checkExistsId = false;
        String id = "";
        System.out.print("Input Id Student need to remove: ");
        sc.nextLine();
        id = sc.nextLine();
        checkExistsId = CheckExistsId(list, id);
        if(checkExistsId){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getId().compareTo(id) == 0){
                    list.remove(i);
                    break;
                }
            }
            System.out.println("Removed student has id " + id);
        }
        else {
            System.out.println("Id does not exist");
        }
    }
    public static void ShowStudent(ArrayList<Student> list){
        for (Student x : list) {
            System.out.println(x);
        }
    }
    public static void SortStudentByName(ArrayList<Student> list){
        for(int i=0; i < list.size() - 1; i++){
            for(int j = list.size() - 1; j > i; j++){
                if(list.get(j).getName().compareTo(list.get(j-1).getName()) > 0){
                    Student x = list.get(j-1);
                    list.set(j-1, list.get(j));
                    list.set(j, x);
                }
            }
        }
    }
    public static boolean CheckExistsId(ArrayList<Student> list, String id){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId().compareTo(id) == 0){
                return true;
            }
        }
        return false;
    }
    public static Student GetStudentById(ArrayList<Student> list, String id){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId().compareTo(id) == 0) {
                return list.get(i);
            }
        }
        return null;
    }
}

package ex4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerStudent {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> SV = new ArrayList<>();
    public void add(){
        SinhVien x = new SinhVien();
        x.InputSV();
        SV.add(x);
    }
    public void show(){
        for (int i = 0; i < SV.size(); i++) {
            SV.get(i).OutputSV();
        }
    }
    public void Edit_Student_ID(){
        String S;
        System.out.print("Input ID Of Student need to edit: ");
        S = sc.nextLine();
        for (int i = 0; i < SV.size(); i++) {
            if(SV.get(i).getId().equals(S)){
                System.out.print("New ID: ");
                SV.get(i).setId(sc.nextLine());
                System.out.print("New Name: ");
                SV.get(i).setName(sc.nextLine());
                System.out.print("New Age: ");
                SV.get(i).setAge(sc.nextInt());
                sc.nextLine();
                System.out.print("New Address: ");
                SV.get(i).setAddress(sc.nextLine());
                System.out.print("New GPA: ");
                SV.get(i).setGpa(sc.nextFloat());
            }
        }
    }
    public void DeleteSTD_ID(){
        String k;
        System.out.println("Input ID need to remove: ");
        k = sc.nextLine();
        for(int i=0; i<SV.size(); i++){
            if(SV.get(i).getId().equals(k)){
                SV.remove(i);
            }
        }
    }
    public void SortSTD_Gpa(){
        Collections.sort(SV, Comparator.comparingDouble(SinhVien::getGpa));
    }
    public void SortSTD_Name(){
        Collections.sort(SV, new SortStudentByName());
    }
}

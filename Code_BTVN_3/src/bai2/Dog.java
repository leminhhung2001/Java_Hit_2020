package bai2;

public class Dog {
    private String name;
    private int MP = 100;
    public void InputName(String name){
        this.name = name;
    }
    public void ShowMP(){
        System.out.println("  Remaining MP:  " + MP);
    }
    public void Bark(){
        if(name != ""){
            System.out.println(name + " gau gau");
            MP -= 20;
        }
        else System.out.println("Xin loi ban chua nhap ten");
    }
}

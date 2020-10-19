package bai4;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();

        arr1.InputData();
        arr1.Show();


        arr2.InputData();
        arr2.Show();

        float d = (float)arr1.Sum()/arr1.getN();
        float c = (float)arr2.Sum()/arr2.getN();


        if(d > c) System.out.println("TBC cua ARR1 > ARR2");
        else if(d < c) System.out.println("TBC cua ARR1 < ARR2");
        else System.out.println("HIIIII");
    }
}

package bai1;

public class RunMain {
    public static void main(String[] args) {
        Person DoanXinhGai = new Person();
        Person DiepBueDe = new Person();

        DoanXinhGai.setName("Doan Xinh Gai");
        DoanXinhGai.setDateOfBirth("15");
        DoanXinhGai.setGender("Nam");
        DoanXinhGai.setHobby("Boi , choi");


        DiepBueDe.setName("Diep Xinh Gai");
        DiepBueDe.setDateOfBirth("15");
        DiepBueDe.setGender("Nu");
        DiepBueDe.setHobby("Boi , choi");

        System.out.println("  Ten:  " +  DoanXinhGai.getName());
        System.out.println("  Tuoi:  " +  DoanXinhGai.getDateOfBirth());
        System.out.println("  Gender:  " +  DoanXinhGai.getGender());
        System.out.println("  Ten:  " +  DoanXinhGai.getHobby());

        System.out.println("  Ten:  " +  DiepBueDe.getName());
        System.out.println("  Tuoi:  " +  DiepBueDe.getDateOfBirth());
        System.out.println("  Gender:  " +  DiepBueDe.getGender());
        System.out.println("  Ten:  " +  DiepBueDe.getHobby());

    }


}

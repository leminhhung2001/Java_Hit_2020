package ex1;

public class RunMain {
    public static void main(String[] args) {
        Person person1 = new Employee("Hung", "Thanh Hoa", 1000000000);
        Person person2 = new Customer("Nguyen", "Thanh Hoa", 1000000000);
        person1.Display();
        person2.Display();
    }
}

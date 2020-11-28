package ex1;

public class Employee extends Person{
    private int salary;

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void Display(){
        System.out.println("Employee name: " + getName());
        System.out.println("Employee address: " + getName());
        System.out.println("Employee salary: " + getSalary());
    }
}

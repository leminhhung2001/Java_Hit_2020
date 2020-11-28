package ex1;

public class Customer extends Person{
    private int balance;

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void Display(){
        System.out.println("Customer name: " + getName());
        System.out.println("Customer address: " + getAddress());
        System.out.println("Customer balance: " + getBalance());
    }
}

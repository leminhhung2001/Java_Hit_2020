package ex2;


import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> b = new ArrayList<>();
        int choice;
        do{
            System.out.println("1 - Add book");
            System.out.println("2 - Edit book by id");
            System.out.println("3 - Delete book by id. ");
            System.out.println("4 - Sort book by name (ascending)");
            System.out.println("5 - Sort book by price (descending)");
            System.out.println("6 - Show all books.");
            System.out.println("0 - Exit");
            System.out.print("Input choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1: addNewBook(b); break;
                case 2: editBookByID(b); break;
                case 3: deleteBookByID(b); break;
                case 4: sortBookByName_A(b); break;
                case 5: sortBookByPrice(b); break;
                case 6: show(b); break;
                case 0: return;
            }
        }while (true);

    }
    public static void addNewBook(ArrayList<Book> b){
        String id;
        do{
            System.out.print("Input ID need to add: ");
            id = sc.nextLine();
            boolean checkBook = checkExists(b, id);
            if(checkBook){
                System.out.println("ID already exists");
            }
            else {
                break;
            }
        }while (true);
        System.out.print("Input Publisher: ");
        String publisher = sc.nextLine();
        System.out.print("Input Name: ");
        String name = sc.nextLine();
        System.out.print("Input Price: ");
        float price = sc.nextFloat();
        System.out.print("The number of the Page: ");
        int numberOfPage = sc.nextInt();
        System.out.print("Author Name: ");
        sc.nextLine();
        String author = sc.nextLine();
        Book k = new Book(id, publisher, name, price, numberOfPage, author);
        b.add(k);
        System.out.println("Added new Book");
    }
    public static void editBookByID(ArrayList<Book> b){
        String id;
        System.out.print("Input ID need to edit: ");
        id = sc.nextLine();
        boolean check = checkExists(b, id);
        if(check){
            Book k = returnBook(b, id);
            System.out.print("Edit Publisher: ");
            String publisher = sc.nextLine();
            k.setPublisher(publisher);
            System.out.print("Input Name: ");
            String name = sc.nextLine();
            k.setName(name);
            System.out.print("Input Price: ");
            float price = sc.nextFloat();
            k.setPrice(price);
            System.out.print("The number of the Page: ");
            int numberOfPage = sc.nextInt();
            k.setNumberOfPage(numberOfPage);
            System.out.print("Author Name: ");
            sc.nextLine();
            String author = sc.nextLine();
            k.setAuthor(author);
        }
        else {
            System.out.println("ID already exitst");
        }
    }
    public static void deleteBookByID(ArrayList<Book> b){
        String id;
        System.out.print("Input ID need to delete: ");
        id = sc.nextLine();
        for (int i = 0; i < b.size(); i++) {
            if(b.get(i).getId().compareTo(id) == 0){
                b.remove(i);
            }

        }
    }
    public static void sortBookByName_A(ArrayList<Book> b){
        for (int i = 0; i < b.size()-1; i++) {
            for (int j = b.size()-1; j > i ; j--) {
                if(b.get(j).getName().compareTo(b.get(j-1).getName()) < 0){
                    Book x = b.get(j-1);
                    b.set(j-1, b.get(j));
                    b.set(j, x);
                }
            }
        }
    }
    public static void sortBookByPrice(ArrayList<Book> b){
        for (int i = 0; i < b.size()-1; i++) {
            for (int j = b.size()-1; j > i ; j--) {
                if(b.get(j).getPrice() > b.get(j-1).getPrice()){
                    Book x = b.get(j-1);
                    b.set(j-1, b.get(j));
                    b.set(j, x);
                }
            }
        }
    }
    public static void show(ArrayList<Book> b){
        for (int i = 0; i < b.size(); i++) {
            b.get(i).Output();
        }
    }
    public static boolean checkExists(ArrayList<Book> b, String id){
        for (int i = 0; i < b.size(); i++) {
            if(b.get(i).getId().compareTo(id) == 0){
                return true;
            }
        }
        return false;
    }
    public static Book returnBook(ArrayList<Book> b, String id){
        for (int i = 0; i < b.size(); i++) {
            if(b.get(i).getId().compareTo(id) == 0){
                return b.get(i);
            }
        }
        return null;
    }
}

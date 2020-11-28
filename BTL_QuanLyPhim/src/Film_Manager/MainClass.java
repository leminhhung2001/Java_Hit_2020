package Film_Manager;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Film> F = new ArrayList<>();
        int choice;
        do{
            System.out.println("====================================================================");
            System.out.println("1 - Search Film By ID");
            System.out.println("2 - Manage Film");
            System.out.println("3 - Search Film By Attribute");
            System.out.println("4 - Show Film");
            System.out.println("0 - Exit");
            System.out.print("Please, choose: ");
            choice = sc.nextInt();
            switch (choice){
                case 1: SearchFilmById(F); break;
                case 2: ManageFilm(F); break;
                case 3: SearchFilmByName(F); break;
                case 4: ShowFilm(F); break;
                case 0: System.exit(0);
            }
        }while (true);
    }

    public static void SearchFilmById(ArrayList<Film> F){
        boolean check = false;
        sc.nextLine();
        String id;
        System.out.print("Input ID Of Film to Search: ");
        id = sc.nextLine();
        check = checkExistsIdOfFilm(F, id);
        if(check){
            System.out.println("*********Display Information Of Film***********");
            for (Film k : F) {
                if(k.getFilmID().compareTo(id) == 0){
                    System.out.println(k);
                    return;
                }
            }
        }
        else System.out.println("=================Film dose not exist===============");
    }
    public static void SearchFilmByName(ArrayList<Film> F){
        boolean check = false;
        sc.nextLine();
        String name;
        System.out.print("Input Name Of Film to Search: ");
        name = sc.nextLine();
        check = checkExistsNameOfFilm(F, name);
        if(check){
            System.out.println("*********Display Information Of Film***********");
            for (Film k : F) {
                if(k.getFilmID().compareTo(name) == 0){
                    System.out.println(k);
                    return;
                }
            }
        }
        else
            System.out.println("==============Film dose not exist=============");
    }

    public static void ManageFilm(ArrayList<Film> F){
        int choice;
        do{
            System.out.println("1 - Upload Film");
            System.out.println("2 - Update Film");
            System.out.println("3 - Delete Film");
            System.out.println("0 - Exit");
            System.out.print("Please, choose: ");
            choice = sc.nextInt();
            switch (choice){
                case 1: UploadFilm(F); break;
                case 2: UpdateFilm(F); break;
                case 3: DeleteFilmById(F); break;
            }
        } while(choice >= 1 && choice <= 3);
    }

    public static void UploadFilm(ArrayList<Film> F){
        sc.nextLine();
        System.out.println("===Input Account Of Film===");
        String filmAccount = sc.nextLine();
        System.out.println("===Input ID Of Film===");
        String filmID = sc.nextLine();
        System.out.println("===Input Name Of Film===");
        String filmName = sc.nextLine();
        System.out.println("===Input Category Of Film===");
        String filmCategory = sc.nextLine();
        System.out.println("===Input Type Of Film===");
        String filmType = sc.nextLine();
        System.out.println("===Input Nation Of Film===");
        String national = sc.nextLine();
        System.out.println("===Input Release Date===");
        String release = sc.nextLine();
        System.out.println("===Input Time Of Film===");
        String timeOfFilm = sc.nextLine();
        System.out.println("===Input Language Of Film===");
        String language = sc.nextLine();
        Film x = new Film(filmAccount, filmID, filmName, filmCategory, filmType, national, release, timeOfFilm, language);
        F.add(x);
        System.out.println("**************Uploaded New Film**************");
    }
    public static void UpdateFilm(ArrayList<Film> F){
        sc.nextLine();
        boolean check = false;
        String id;
        System.out.print("Input ID Of Film to Update: ");
        id = sc.nextLine();
        check = checkExistsIdOfFilm(F, id);
        if(check){
            Film film = getFilm(F, id);
            int k;
            do{
                System.out.println("1 - Set account of film");
                System.out.println("2 - Set name of film");
                System.out.println("3 - Set category of film");
                System.out.println("4 - Set type of film");
                System.out.println("5 - Set nation of film");
                System.out.println("6 - Set release date of film");
                System.out.println("7 - Set time of film");
                System.out.println("8 - Set language of film");
                System.out.println("0 - Exit");
                System.out.print("Please, choose: ");
                k = sc.nextInt();
                switch (k){
                    case 1:
                        System.out.print("Input name to edit: ");
                        sc.nextLine();
                        System.out.print("Input account: ");
                        String filmAccount = sc.nextLine();
                        film.setFilmAccount(filmAccount);
                        System.out.println("===Updated Successfully===");
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.print("Input name: ");
                        String filmName = sc.nextLine();
                        film.setFilmName(filmName);
                        System.out.println("===Updated Successfully===");
                        break;
                    case 3:
                        sc.nextLine();
                        System.out.print("Input category: ");
                        String filmCategory = sc.nextLine();
                        film.setFilmCategory(filmCategory);
                        System.out.println("===Updated Successfully===");
                        break;
                    case 4:
                        sc.nextLine();
                        System.out.print("Input type: ");
                        String filmType = sc.nextLine();
                        film.setFilmType(filmType);
                        System.out.println("===Updated Successfully===");
                        break;
                    case 5:
                        sc.nextLine();
                        System.out.print("Input nation: ");
                        String national = sc.nextLine();
                        film.setNational(national);
                        System.out.println("===Updated Successfully===");
                        break;
                    case 6:
                        sc.nextLine();
                        System.out.print("Input release date: ");
                        String release = sc.nextLine();
                        film.setFilmCategory(release);
                        System.out.println("===Updated Successfully===");
                        break;
                    case 7:
                        sc.nextLine();
                        System.out.print("Input time: ");
                        String time = sc.nextLine();
                        film.setTimeOfFilm(time);
                        System.out.println("===Updated Successfully===");
                        break;
                    case 8:
                        sc.nextLine();
                        System.out.print("Input language: ");
                        String language = sc.nextLine();
                        film.setLanguage(language);
                        System.out.println("===Updated Successfully===");
                        break;
                }
            }while (k >= 1 && k <= 8);
        }
        else {
            System.out.println("=====Film dose not exist====");
        }
    }
    public static void DeleteFilmById(ArrayList<Film> F){
        sc.nextLine();
        String id;
        System.out.print("Input ID film need to delete: ");
        id = sc.nextLine();
        boolean check = checkExistsIdOfFilm(F, id);
        if(check){
            for (int i = 0; i < F.size(); i++) {
                if(F.get(i).getFilmID().compareTo(id) == 0){
                    F.remove(i);
                    break;
                }
            }
            System.out.println("*******Removed film has id " + id + "*********");
        }
        else {
            System.out.println("=====Film dose not exist====");
        }

    }
    public static void ShowFilm(ArrayList<Film> F){
        System.out.println("**************SHOW INFORMATION OF FILMS*****************");
        for (Film x : F) {
            System.out.println(x);
        }
    }
    public static boolean checkExistsIdOfFilm(ArrayList<Film> F, String id){
        for (int i = 0; i < F.size(); i++) {
            if(F.get(i).getFilmID().compareTo(id) == 0){
                return true;
            }
        }
        return false;
    }
    public static boolean checkExistsNameOfFilm(ArrayList<Film> F, String name){
        for (int i = 0; i < F.size(); i++) {
            if(F.get(i).getFilmID().compareTo(name) == 0){
                return true;
            }
        }
        return false;
    }
    public static Film getFilm(ArrayList<Film> F, String id){
        for (int i = 0; i < F.size(); i++) {
            if(F.get(i).getFilmID().compareTo(id) == 0){
                return F.get(i);
            }
        }
        return null;
    }
}

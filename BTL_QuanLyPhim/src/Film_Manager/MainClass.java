package Film_Manager;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static Scanner sc = new Scanner(System.in);
        public static DataManager dataManager = new DataManager();
        public static String filmFileName = "FILM.txt";
        public static ArrayList<Film> films = new ArrayList<>();
        public static void main(String[] args) {
        int choice;
        do{
            System.out.println("====================================================================");
            System.out.println("1 - Search Films By Attributes");
            System.out.println("2 - Films Management");
            System.out.println("3 - Show Off Films");
            System.out.println("0 - Exit");
            System.out.print("Please, choose: ");
            choice = sc.nextInt();
            switch (choice){
                case 1: FilmSeeker(); break;
                case 2: ManageFilm(); break;
                case 3: ShowAllFilms(); break;
                case 0: System.exit(0);
            }
        }while (true);
    }

    public static void FilmSeeker(){
        films = dataManager.ReadFilmFromFile(filmFileName);
        int choice;
        do{
            System.out.println("1 - Search film by ID");
            System.out.println("2 - Search film by Name");
            System.out.println("3 - Search film by Category");
            System.out.println("0 - Exit");
            System.out.print("Please, choose: ");
            choice = sc.nextInt();
            switch (choice){
                case 1: SearchFilmByID(films); break;
                case 2: SearchFilmByName(films); break;
                case 3: SearchFilmByCategory(films); break;
            }
        }while (choice <= 0 || choice >= 4);
    }
    public static void SearchFilmByID(ArrayList<Film> films){
        boolean check = false;
        sc.nextLine();
        String id;
        System.out.print("Input ID Of Film to Search: ");
        id = sc.nextLine();
        check = checkExistsIdOfFilm(films, id);
        if(check){
            System.out.println("*********Display Information Of Film***********");
            for (Film k : films) {
                if(k.getFilmID().compareTo(id) == 0){
                    System.out.println(k);
                    break;
                }
            }
        }
        else System.out.println("=================Film dose not exist===================");
    }
    public static void SearchFilmByName(ArrayList<Film> films){
        boolean check = false;
        sc.nextLine();
        String name;
        System.out.print("Input Name Of Film to Search: ");
        name = sc.nextLine();
        check = checkExistsNameOfFilm(films, name);
        if(check){
            System.out.println("*********Display Information Of Film***********");
            for (Film k : films) {
                if(k.getFilmName().compareTo(name) == 0){
                    System.out.println(k);
                }
            }
        }
        else
            System.out.println("==============Film dose not exist=============");
    }

    public static void SearchFilmByCategory(ArrayList<Film> films){
        boolean check = false;
        sc.nextLine();
        String category;
        System.out.print("Input Category Of Film to Search: ");
        category = sc.nextLine();
        check = checkExistsCategoryOfFilm(films, category);
        if(check){
            System.out.println("*********Display Information Of Film***********");
            for (Film k : films) {
                if(k.getFilmCategory().compareTo(category) == 0){
                    System.out.println(k);
                }
            }
        }
        else
            System.out.println("==============Film dose not exist=============");
    }

    public static void ManageFilm(){
        int choice;
        do{
            System.out.println("1 - Upload Film");
            System.out.println("2 - Update Film");
            System.out.println("3 - Delete Film");
            System.out.println("0 - Exit");
            System.out.print("Please, choose: ");
            choice = sc.nextInt();
            switch (choice){
                case 1: UploadFilm(dataManager, filmFileName); break;
                case 2: UpdateFilm(dataManager, filmFileName); break;
                case 3: DeleteFilmById(dataManager, filmFileName); break;
            }
        } while(choice >= 1 && choice <= 3);
    }

    public static void UploadFilm(DataManager dataManager, String filmFileName){
        sc.nextLine();
        ArrayList<Film> films = dataManager.ReadFilmFromFile(filmFileName);
        String filmAccount;
        String filmID;
        String filmName;
        String filmCategory;
        String filmType;
        String national;
        String release;
        String timeOfFilm;
        String language;
        String regexFilmID = "^\\d{5,}l{1,}m{1,}h{1,}$";
        String regexFilmAccount = "^\\d{5,}H{1,}I{1,}T{1,}$";
        do{
            System.out.print("Input ID Of Film: ");
            filmID = sc.nextLine();
            boolean check = checkExistsIdOfFilm(films, filmID);
            if(filmID.matches(regexFilmID)){
                if(check){
                    System.out.println("***Film already existed***");
                }
                else{
                    break;
                }
            }
            else {
                System.out.println("Invalid film's ID");
            }
        }while (true);

        filmAccount = "";
        int choicee;
        do{
            System.out.println("******Do you want to set up type of account???*****");
            System.out.println("1 - Very Important Person(VIP) Account");
            System.out.println("2 - Normal Account");
            System.out.println("0 - Exit");
            System.out.print("Please, Let's set up: ");
            choicee = sc.nextInt();
            switch (choicee){
                case 1: sc.nextLine();
                        do{
                            System.out.print("Input VIP Account Of Film: ");
                            String account = sc.nextLine();
                            if(account.matches(regexFilmAccount)){
                                filmAccount = new String(account);
                                break;
                            }
                            else {
                                System.out.println("Invalid film's VIP account");
                            }
                        }while (true);
                        break;

                case 2: sc.nextLine();
                    System.out.print("Input Normal Account Of Film: ");
                    filmAccount = sc.nextLine();
                    break;
            }
        }while (choicee <= 0 || choicee >= 3);

        System.out.print("Input Name Of Film: ");
        filmName = sc.nextLine();

        int choice;
        String[] category = {"Documentary film", "Experimental film", "Abstract animation", "Afrofuturist films", "Horror comedy"};
        System.out.println("============Input Category Of Film============ ");
        do{
            System.out.println("1 - Documentary film");
            System.out.println("2 - Experimental film");
            System.out.println("3 - Abstract animation");
            System.out.println("4 - Afrofuturist films");
            System.out.println("5 - Horror comedy");
            System.out.print("Please, choose: ");
            choice = sc.nextInt();
        }while(choice <= 0 || choice >= 6);
        filmCategory = category[choice - 1];

        String[] type = {"Action films", "Comedies", "Romantic films", "Adventure films", "Historical dramas"};
        System.out.println("============Input Type Of Film==============");
        do{
            System.out.println("1 - Action films");
            System.out.println("2 - Comedies");
            System.out.println("3 - Romantic films");
            System.out.println("4 - Adventure films");
            System.out.println("5 - Historical dramas");
            System.out.print("Please, choose: ");
            choice = sc.nextInt();
        }while(choice <= 0 || choice >= 6);
        filmType = type[choice - 1];
        sc.nextLine();

        System.out.print("Input Nation Of Film: ");
        national = sc.nextLine();
        System.out.print("Input Release Date: ");
        release = sc.nextLine();
        System.out.print("Input Time Of Film: ");
        timeOfFilm = sc.nextLine();
        System.out.print("Input Language Of Film: ");
        language = sc.nextLine();
        Film film = new Film(filmID, filmAccount, filmName, filmCategory, filmType, national, release, timeOfFilm, language);
        dataManager.WriteFilmToFile(filmFileName, film);
        System.out.println("**************Uploaded New Film**************");
    }
    public static void UpdateFilm(DataManager dataManager, String filmFileName){
        sc.nextLine();
        int getIndex;
        String id;
        ArrayList <Film> films = dataManager.ReadFilmFromFile(filmFileName);
        do{
            System.out.print("Input ID Of Film to Update: ");
            id = sc.nextLine();
            getIndex = getIndexOfFilm(films, id);
            System.out.println("Size of film: " + films.size());
            if(getIndex != -1){
                break;
            }
            else {
                System.out.println("=====Film dose not exist====");
            }
        }while (true);

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
                    sc.nextLine();
                    System.out.print("Input new account: ");
                    String filmAccount = sc.nextLine();
                    films.get(getIndex).setFilmAccount(filmAccount);
                    System.out.println("===Updated Successfully===");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Input new name: ");
                    String filmName = sc.nextLine();
                    films.get(getIndex).setFilmName(filmName);
                    System.out.println("===Updated Successfully===");
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Input new category: ");
                    String filmCategory = sc.nextLine();
                    films.get(getIndex).setFilmCategory(filmCategory);
                    System.out.println("===Updated Successfully===");
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Input new type: ");
                    String filmType = sc.nextLine();
                    films.get(getIndex).setFilmType(filmType);
                    System.out.println("===Updated Successfully===");
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Input new nation: ");
                    String national = sc.nextLine();
                    films.get(getIndex).setNational(national);
                    System.out.println("===Updated Successfully===");
                    break;
                case 6:
                    sc.nextLine();
                    System.out.print("Input release date: ");
                    String release = sc.nextLine();
                    films.get(getIndex).setFilmCategory(release);
                    System.out.println("===Updated Successfully===");
                    break;
                case 7:
                    sc.nextLine();
                    System.out.print("Input new time: ");
                    String time = sc.nextLine();
                    films.get(getIndex).setTimeOfFilm(time);
                    System.out.println("===Updated Successfully===");
                    break;
                case 8:
                    sc.nextLine();
                    System.out.print("Input new language: ");
                    String language = sc.nextLine();
                    films.get(getIndex).setLanguage(language);
                    System.out.println("===Updated Successfully===");
                    break;
            }
        }while (k >= 1 && k <= 8);
        dataManager.UpdateFilmToFile(films, filmFileName);
    }
    public static void DeleteFilmById(DataManager dataManager, String filmFileName){
        ArrayList<Film> films = dataManager.ReadFilmFromFile(filmFileName);
        sc.nextLine();
        String id;
        System.out.print("Input ID film need to delete: ");
        id = sc.nextLine();
        boolean check = checkExistsIdOfFilm(films, id);
        if(check){
            for (int i = 0; i < films.size(); i++) {
                if(films.get(i).getFilmID().compareTo(id) == 0){
                    films.remove(i);
                    break;
                }
            }
            System.out.println("*******Removed film has id " + id + "*********");
            dataManager.UpdateFilmToFile(films, filmFileName);
        }
        else {
            System.out.println("=====Film dose not exist====");
        }

    }
    public static void ShowAllFilms(){
        System.out.println("**************SHOW INFORMATION OF FILMS*****************");
        ArrayList<Film> films = dataManager.ReadFilmFromFile(filmFileName);
        for (Film film: films) {
            System.out.println(film);
        }
    }
    public static boolean checkExistsIdOfFilm(ArrayList<Film> films, String id){
        for (int i = 0; i < films.size(); i++) {
            if(films.get(i).getFilmID().compareTo(id) == 0){
                return true;
            }
        }
        return false;
    }

    public static boolean checkExistsNameOfFilm(ArrayList<Film> films, String name){
        for (int i = 0; i < films.size(); i++) {
            if(films.get(i).getFilmName().compareTo(name) == 0){
                return true;
            }
        }
        return false;
    }
    public static boolean checkExistsCategoryOfFilm(ArrayList<Film> films, String category){
        for (int i = 0; i < films.size(); i++) {
            if(films.get(i).getFilmCategory().compareTo(category) == 0){
                return true;
            }
        }
        return false;
    }
    public static int getIndexOfFilm(ArrayList<Film> films, String name){
        for (int i = 0; i < films.size(); i++) {
            if(films.get(i).getFilmID().compareTo(name) == 0){
                return i;
            }
        }
        return -1;
    }
}

package Film_Manager;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DataManager {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public void OpenFileToWrite(String fileName){
        try{
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void CloseFileAfterWrite(){
        try{
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void OpenFileToRead(String fileName){
        try{
            File file = new File(fileName);
            if(!file.exists()){
                file.createNewFile();
            }
            scanner = new Scanner(Paths.get(fileName), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void CloseFileAfterRead(){
        try{
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Film> ReadFilmFromFile(String fileName){
        OpenFileToRead(fileName);
        ArrayList<Film> films = new ArrayList<>();
        while (scanner.hasNext()){
            String data = scanner.nextLine();
            Film film = CreateFilmFromData(data);
            films.add(film);
        }
        CloseFileAfterRead();
        return films;
    }
    public void WriteFilmToFile(String fileName, Film film){
        OpenFileToWrite(fileName);
        printWriter.println(film.getFilmID() + " | " + film.getFilmAccount() + " | " + film.getFilmName() + " | " + film.getFilmCategory() + " | " +
                            film.getFilmType() + " | " + film.getNational() + " | " + film.getRelease() + " | " +
                            film.getTimeOfFilm() + " | " + film.getLanguage());
        CloseFileAfterWrite();
    }

    private Film CreateFilmFromData(String data){
        String[] datas = data.split("\\|");
        Film film = new Film(datas[0], datas[1], datas[2], datas[3], datas[4], datas[5], datas[6], datas[7], datas[8]);
        return film;
    }

    public void UpdateFilmToFile(ArrayList<Film> films, String filmFileName){
        File file = new File(filmFileName);
        if(file.exists()){
            file.delete();
        }
        OpenFileToWrite(filmFileName);
        for (Film film : films) {
            printWriter.println(film.getFilmID() + " | " + film.getFilmAccount() + " | " + film.getFilmName() + " | " + film.getFilmCategory() + " | " +
                    film.getFilmType() + " | " + film.getNational() + " | " + film.getRelease() + " | " +
                    film.getTimeOfFilm() + " | " + film.getLanguage());
        }
        CloseFileAfterWrite();
    }
}

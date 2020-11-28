package Film_Manager;

public class Film {
    private String filmAccount;
    private String filmID;
    private String filmName;
    private String filmCategory;
    private String filmType;
    private String national;
    private String release;
    private String timeOfFilm;
    private String language;


    public Film(String filmAccount, String filmID, String filmName, String filmCategory, String filmType, String national, String release, String timeOfFilm, String language) {
        this.filmAccount = filmAccount;
        this.filmID = filmID;
        this.filmName = filmName;
        this.filmCategory = filmCategory;
        this.filmType = filmType;
        this.national = national;
        this.release = release;
        this.timeOfFilm = timeOfFilm;
        this.language = language;
    }

    public String getFilmAccount() {
        return filmAccount;
    }

    public void setFilmAccount(String filmAccount) {
        this.filmAccount = filmAccount;
    }

    public String getFilmID() {
        return filmID;
    }

    public void setFilmID(String filmID) {
        this.filmID = filmID;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(String filmCategory) {
        this.filmCategory = filmCategory;
    }

    public String getFilmType() {
        return filmType;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getTimeOfFilm() {
        return timeOfFilm;
    }

    public void setTimeOfFilm(String timeOfFilm) {
        this.timeOfFilm = timeOfFilm;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Film_Manager{" +
                "filmAccount='" + filmAccount + '\'' +
                ", filmID='" + filmID + '\'' +
                ", filmName='" + filmName + '\'' +
                ", filmCategory='" + filmCategory + '\'' +
                ", filmType='" + filmType + '\'' +
                ", national='" + national + '\'' +
                ", release='" + release + '\'' +
                ", timeOfFilm='" + timeOfFilm + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}

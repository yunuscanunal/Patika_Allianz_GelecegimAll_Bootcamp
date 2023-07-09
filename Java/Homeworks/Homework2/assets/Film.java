package Homeworks.Homework2.assets;

import java.util.ArrayList;

public class Film {

    /*
     * Film objesi için kullanılacak alanlar tanımlandı. Kategori adı ve platform
     * adı haricindeki alanları kullanıcıdan
     * Scanner ile veri aldıktan sonra oluşturulacak yeni Film objemiz için
     * kullanabilmek için bir Constructor oluşturuldu.
     * Kategori adına ve platform adına erişebilmek için, kategori ve platform
     * objelerini içinde barındaracak iki tane
     * ArrayList oluşturuldu.
     * 
     * Private alanlara erişim için Getter ve Setter methodları eklendi. Son olarak
     * film objemizi yazdırırken kullanabilmek
     * için "toString" methodu override edildi.
     */

    private String filmName;
    private int year;
    private String director;
    private double imdbPoint;
    private String runTime;
    private ArrayList<Category> catArrayList = new ArrayList<>();
    private ArrayList<Platform> platArrayList = new ArrayList<>();

    public Film(String filmName, int year, String director, double imdbPoint, String runTime) {
        this.filmName = filmName;
        this.year = year;
        this.director = director;
        this.imdbPoint = imdbPoint;
        this.runTime = runTime;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getImdbPoint() {
        return imdbPoint;
    }

    public void setImdbPoint(double imdbPoint) {
        this.imdbPoint = imdbPoint;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public ArrayList<Category> getCatArrayList() {
        return catArrayList;
    }

    public void setCatArrayList(ArrayList<Category> catArrayList) {
        this.catArrayList = catArrayList;
    }

    public ArrayList<Platform> getPlatArrayList() {
        return platArrayList;
    }

    public void setPlatArrayList(ArrayList<Platform> platArrayList) {
        this.platArrayList = platArrayList;
    }

    @Override
    public String toString() {
        return "Film{" +
                "Film='" + filmName + '\'' +
                ", Yıl=" + year +
                ", Yönetmen='" + director + '\'' +
                ", Imdb Puanı=" + imdbPoint +
                ", Süre='" + runTime + '\'' +
                ", Kategori=" + catArrayList +
                ", Platform=" + platArrayList +
                '}';
    }

}
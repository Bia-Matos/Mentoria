package entities;

public class Album {
    public String title;
    public Integer year;
    public String band;

    public Album(String title, Integer year, String band) {
        this.title = title;
        this.year= year;
        this.band = band;
    }

    @Override
    // function Object Class
    public String toString() {
        return "\n album: " + this.title + ", " + "year: " + this.year + ", " + "band: " + this.band + "," + "\n";
    }
}

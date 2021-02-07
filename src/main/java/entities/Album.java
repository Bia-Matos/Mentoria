package entities;

import java.util.ArrayList;

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

    public static ArrayList addAlbum(String title, Integer year, String band) {
        Album album = new Album(title, year, band);
        ArrayList<Album> newAlbum = new ArrayList<>();
        newAlbum.add(album);
        return newAlbum;
    }
}

package model;

import entities.Album;
import entities.Music;
import org.javatuples.Pair;

import java.util.ArrayList;

public class crudAlbum {
    public static void main(String[] args) {

        Pair<ArrayList, ArrayList> pair =
                new Pair<ArrayList, ArrayList>(createAlbum(), addMusic());

        System.out.println(pair);
    }

    public static ArrayList createAlbum() {
        Album album = new Album("Metallica: Black Album", 1991, "Metallica");

        ArrayList<Album> albumList = new ArrayList<>();
        albumList.add(album);
        return albumList;
    }

    public static ArrayList addMusic() {
        Music music1 = new Music("Enter Sandman", 5.31, true);
        Music music2 = new Music("The Unforgiven", 6.27, true);
        Music music3 = new Music("Nothing Else Matters", 6.29, true);

        ArrayList<Music> music = new ArrayList<>();
        music.add(music1);
        music.add(music2);
        music.add(music3);
        return music;
    }

}

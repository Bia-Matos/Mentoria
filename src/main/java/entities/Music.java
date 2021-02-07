package entities;

import java.util.ArrayList;

public class Music {

    String name;
    Double time;
    Boolean favorite;

    public Music(String name, Double time, Boolean favorite) {
        this.name = name;
        this.time = time;
        this.favorite = favorite;
    }

    @Override
    // function Object Class
    public String toString() {
        return "\n music: " + this.name + ", " + "time: " + this.time + ", " + "favorite: " + this.favorite + "," + "\n";
    }

    public static ArrayList addMusic(String name, Double time, Boolean favorite) {
        Music music = new Music(name, time, favorite);
        ArrayList<Music> newMusic = new ArrayList<>();
        newMusic.add(music);
        return newMusic;
    }
}
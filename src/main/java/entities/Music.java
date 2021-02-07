package entities;

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

}
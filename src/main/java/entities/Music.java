package entities;

public class Music {

    String nome;
    Double time;
    Boolean favorite;

    public Music(String nome, Double time, Boolean favorite) {
        this.nome = nome;
        this.time = time;
        this.favorite = favorite;
    }

    @Override
    // function Object Class
    public String toString() {
        return "\n music: " + this.nome + ", " + "time: " + this.time + ", " + "favorite: " + this.favorite + "," + "\n";
    }
}
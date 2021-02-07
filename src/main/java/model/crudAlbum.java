package model;

import entities.Album;
import entities.Music;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class crudAlbum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        var pair = new Pair<>(createAlbum(), addMusic());
        System.out.println(pair);

    }

    public static ArrayList createAlbum() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o titulo do album: ");
        String title = sc.nextLine();

        System.out.println("Digite o nome da banda: ");
        String band = sc.nextLine();

        System.out.println("Digite o ano de criação do album: ");
        int year = sc.nextInt();

        return Album.addAlbum(title, year, band);
    }

    public static ArrayList<Music> addMusic() {

        ArrayList<Music> newMusic = new ArrayList<>();
        System.out.println("---------------------------------");
        System.out.println("Agora adicione musicas ao seu album ...");

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome da música: ");
            String name = sc.nextLine();

            System.out.println("Digite o tempo de duração da música [min.seg]: ");
            Double time = sc.nextDouble();;

            System.out.println("Deseja adicionar essa musica como favorita? [true or false]: ");
            Boolean favorite = sc.nextBoolean();

            Music music = new Music(name, time, favorite);
            newMusic.add(music);

            System.out.println("Deseja adicionar mais musicas? [s] [n]");
            String exit = sc.next();

            if(exit.equals("n")) {
                System.out.println("break");
                break;
            }
        }
        return newMusic;
    }
}


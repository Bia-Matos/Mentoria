package model;

import entities.Album;
import entities.Music;
import org.javatuples.Pair;

import java.util.Locale;
import java.util.Scanner;

public class crudAlbum {
    public static void main(String[] args) {}

    public static void createAlbum() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String title = "Metallica: Black Album";
        int year = 1991;
        String band = "Metallica";
        var album = Album.addAlbum(title, year, band);

        String music = "Nothing Else Matters";
        Double time = 6.29;
        var musicData = Music.addMusic(music, time, true);

        var pair = new Pair<>(album, musicData);

        System.out.println(pair);
    }

    public static void albumData() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------");
        while(true) {
            System.out.println("Digite um numero aleatorio");
            int x = sc.nextInt();
            System.out.printf("O numero digitado foi %d \n", x);

            System.out.println("Deseja sair ? [s] [n]");
            String exit = sc.next();
            System.out.printf("Opção selecionada foi %s \n", exit);

            if(exit.equals("s")) {
                System.out.println("break");
                break;
            } else {
                System.out.println("not break");
            }
        }
    }
    
}

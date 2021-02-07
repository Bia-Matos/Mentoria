import model.crudAlbum;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n");
            System.out.println("**********************************");
            System.out.println("Bem-vindo ao aplicativo de músicas!");
            System.out.println("**********************************");
            System.out.println("Menu: ");
            System.out.println("Digite um numero e pressione ENTER");
            System.out.println("1- Cadastrar Album\n2- Listar Albuns\n3- Listar Musicas\n4- Gerar Playlist\n5- Sair");

            System.out.println("Selecione uma opção: ");
            int option = sc.nextInt();
            System.out.println("\nA opção selecionada foi :");

            switch (option){
                case 1:
                    System.out.println("1- Cadastrar Album");
                    crudAlbum.createAlbum();
                    break;
                case 2:
                    System.out.println("2- Listar Albuns");
                    break;
                case 3:
                    System.out.println("3- Listar Musicas");
                    break;
                case 4:
                    System.out.println("4- Gerar Playlist");
                    break;
                case 5:
                    System.out.println("5- Sair");
                    System.exit(0);
                default:
                    System.out.println("Tente novamente");
            }

        }

    }
}



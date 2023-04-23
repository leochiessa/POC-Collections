import enums.Genre;
import lists.BasicList;
import lists.PremiumList;
import models.Album;
import models.Artist;
import models.Menu;
import models.Song;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Artist a = new Artist("Artista", 30, "Argentino");
        Album al = new Album(2023, "Album", a);
        Song s1 = new Song("Canción0", 100, Genre.CLASICA.getDescription(), al, null);
        Song s2 = new Song("Canción1", 200, Genre.HIPHOP.getDescription(), al, null);
        Song s3 = new Song("Canción2", 300, Genre.JAZZ.getDescription(), al, null);

        String i;
        Scanner s = new Scanner(System.in);
        Menu m;

        i = "0";
        while (!i.equals("3")) {
            System.out.println("Tipo de Cuenta: 1) Básica - 2) Premium - 3) Salir.");
            i = s.nextLine();
            switch (i) {
                case "1":
                    m = new Menu(new BasicList("Lista Básica", new Stack<>()));
                    m.getMyList().addSong(s1);
                    m.getMyList().addSong(s2);
                    m.getMyList().addSong(s3);
                    m.runBasicList();
                    break;
                case "2":
                    m = new Menu(new PremiumList("Lista Premium", new LinkedList<>()));
                    m.getMyList().addSong(s1);
                    m.getMyList().addSong(s2);
                    m.getMyList().addSong(s3);
                    m.runPremiumList();
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Seleccione una Opción Válida!");
                    break;
            }
        }
    }
}
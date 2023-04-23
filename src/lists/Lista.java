package lists;

import interfaces.Play;
import models.Song;

import java.util.List;
import java.util.Scanner;

public abstract class Lista implements Play {

    private String name;
    private List<Song> myList;

    public Lista(String name, List<Song> myList) {
        this.name = name;
        this.myList = myList;
    }

    public List<Song> getMyList() {
        return myList;
    }

    @Override
    public void addSong(Song s) {
        getMyList().add(s);
    }

    public Song playSong(Song s, Lista l) {
        System.out.println("Reproduciendo: " + s.getName() + "... A) Anterior - S) Siguiente - P) Pausar.");
        String p = "";
        Scanner sc = new Scanner(System.in);
        while (!p.equalsIgnoreCase("p")) {
            p = sc.nextLine();
            if (p.equalsIgnoreCase("a") || p.equalsIgnoreCase("s")) {
                if (l instanceof BasicList) {
                    System.out.println("Para acceder a esta opción, compre el paquete PREMIUM.");
                } else {
                    Integer i = myList.indexOf(s);
                    if (p.equalsIgnoreCase("a") && i > 0) {
                        return myList.get(i - 1);
                    } else if (p.equalsIgnoreCase("s") && i < myList.size() - 1) {
                        return myList.get(i + 1);
                    }
                }
            }
        }
        return null;
    }

}
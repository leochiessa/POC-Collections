package lists;

import models.Song;

import java.util.LinkedList;
import java.util.Scanner;

public class PremiumList extends Lista {

    public PremiumList(String name, LinkedList<Song> myList) {
        super(name, myList);
    }

    @Override
    public void play() {
        viewList();
        System.out.println("Seleccione Canción:");
        Scanner sc = new Scanner(System.in);
        String i = String.valueOf(super.getMyList().size());
        while (Integer.valueOf(i) < 0 || Integer.valueOf(i) >= super.getMyList().size()) {
            i = sc.nextLine();
            Boolean exists = false;
            for (int x = 0; x < super.getMyList().size(); x++) {
                if (i.equals(String.valueOf(x))) {
                    exists = true;
                }
            }
            if (exists) {
                break;
            }
            i = String.valueOf(super.getMyList().size());
        }
        Song s = super.getMyList().get(Integer.valueOf(i));
        while(s != null) {
            s = super.playSong(s, this);
        }
    }

    @Override
    public void deleteSong() {
        viewList();
        System.out.println("Seleccione Canción: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        s.nextLine();
        super.getMyList().remove(i);
    }

    @Override
    public void viewList() {
        Integer i = super.getMyList().size();
        for (int x = 0; x < i; x++) {
            Song s = super.getMyList().get(x);
            System.out.println(x + " - " + s.getAlbum().getArtist().getName() + ", " + s.getName());
        }
    }

}
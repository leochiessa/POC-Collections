package lists;

import models.Song;

import java.util.Stack;

public class BasicList extends Lista {

    public BasicList(String name, Stack<Song> myList) {
        super(name, myList);
    }

    @Override
    public void play() {
        Song s = ((Stack<Song>) super.getMyList()).pop();
        Stack<Song> aux = new Stack<>();
        while (!super.getMyList().isEmpty()) {
            aux.add(((Stack<Song>) super.getMyList()).pop());
        }
        super.getMyList().clear();
        super.getMyList().add(s);
        while (!aux.isEmpty()) {
            super.getMyList().add(aux.pop());
        }
        super.playSong(s, this);
    }

    @Override
    public void deleteSong() {
        System.out.println("Para acceder a esta opción, compre el paquete PREMIUM.");
    }

    @Override
    public void viewList() {
        Object aux = ((Stack<Song>) super.getMyList()).clone();
        while (!((Stack<Song>) aux).isEmpty()) {
            Song s = ((Stack<Song>) aux).pop();
            System.out.println(s.getAlbum().getArtist().getName() + ", " + s.getName());
        }
    }

}
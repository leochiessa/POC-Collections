package models;

public class Song {

    private String name;
    private Integer duration;
    private String genre;
    private Album album;
    private Artist guestArtist;

    public Song(String name, Integer duration, String genre, Album album, Artist guestArtist) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
        this.guestArtist = guestArtist;
    }

    public String getName() {
        return name;
    }

    public Album getAlbum() {
        return album;
    }

}
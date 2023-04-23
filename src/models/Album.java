package models;

public class Album {

    private Integer year;
    private String title;
    private Artist artist;

    public Album(Integer year, String title, Artist artist) {
        this.year = year;
        this.title = title;
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

}
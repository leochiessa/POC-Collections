package models;

public class Artist {

    private String name;
    private Integer age;
    private String nationality;

    public Artist(String name, Integer age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

}
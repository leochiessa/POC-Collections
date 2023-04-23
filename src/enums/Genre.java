package enums;

public enum Genre {

    ROCK("Rock"), TRAP("Trap"), JAZZ("Jazz"), HIPHOP("Hip Hop"), POP("Pop"), METAL("Metal"), CLASICA("Clasica");
    private String description;

    private Genre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

}
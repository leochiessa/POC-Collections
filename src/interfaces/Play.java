package interfaces;

import models.Song;

public interface Play {

    public void play();
    public void addSong(Song s);
    public void deleteSong();
    public void viewList();

}
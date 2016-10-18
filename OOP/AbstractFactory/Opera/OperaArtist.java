package AbstractFactory.Opera;

import AbstractFactory.Artist;

public class OperaArtist implements Artist {
    @Override
    public void play() {
        System.out.println("Opera artist play opera game");
    }
}

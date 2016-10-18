package AbstractFactory.Comedy;

import AbstractFactory.Artist;

public class ComedyArtist implements Artist {
    @Override
    public void play() {
        System.out.println("Comedy artist play in comedy film");
    }
}

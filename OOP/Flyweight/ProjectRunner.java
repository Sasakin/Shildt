

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String args[]) {
        MusicianFactory musicianFactory = new MusicianFactory();

        List<Musician> musicians = new ArrayList<>();

        musicians.add(musicianFactory.getMusicianBySpecialty("piano"));
        musicians.add(musicianFactory.getMusicianBySpecialty("piano"));
        musicians.add(musicianFactory.getMusicianBySpecialty("piano"));
        musicians.add(musicianFactory.getMusicianBySpecialty("piano"));
        musicians.add(musicianFactory.getMusicianBySpecialty("piano"));

        musicians.add(musicianFactory.getMusicianBySpecialty("guitar"));
        musicians.add(musicianFactory.getMusicianBySpecialty("guitar"));
        musicians.add(musicianFactory.getMusicianBySpecialty("guitar"));
        musicians.add(musicianFactory.getMusicianBySpecialty("guitar"));


        for(Musician musician : musicians) {
            musician.playMusic();
        }

    }
}

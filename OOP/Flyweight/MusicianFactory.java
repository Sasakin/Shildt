
import java.util.HashMap;
import java.util.Map;

public class MusicianFactory {
    private static final Map<String,Musician> musicians = new HashMap<>();

    public Musician getMusicianBySpecialty(String specialty) {
        Musician musician = musicians.get(specialty);

        if(musician == null) {
            switch (specialty) {
                case "guitar":
                    System.out.println("Hiring guitar musician... ");
                    musician = new GuitarMusician();
                case "piano" :
                    System.out.println("Hiring piano musician... ");
                    musician = new PianoMusician();
            }
            musicians.put(specialty,musician);
        }
        return musician;
    }
}

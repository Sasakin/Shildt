

public class Orchestra {
    public static void main(String args[]) {
        Team team = new Team();

        Player firstGuitarPlayer = new GuitarPlayer();
        Player secondGuitarPlayer = new GuitarPlayer();
        Player pianoPlayer = new PianoPlayer();

        team.addPlayer(firstGuitarPlayer);
        team.addPlayer(secondGuitarPlayer);
        team.addPlayer(pianoPlayer);

        team.createOrchestra();

    }
}


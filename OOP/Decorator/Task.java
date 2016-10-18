

public class Task {
    public static void main(String args[]) {
        Feudal feudal = new BaronFeudal(new BaronFeudal( new KnightFeudal()));

        System.out.println(feudal.makeWar());
    }
}

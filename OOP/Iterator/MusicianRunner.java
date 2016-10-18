package Iterator;

public class MusicianRunner {
    public static void main(String[] args) {
        String[] skils = {"piano", "guitar", "flute", "accordion"};

        Musician musician = new Musician("Serje", skils);

        Iterator iterator = musician.getIterator();
        System.out.println("Musician : " + musician.getName());
        System.out.println("Skils: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() +" ");
        }
    }
}

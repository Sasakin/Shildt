
public class Main {
    public static void main(String args[]) {
        AnimalFactory aFacrory = new AnimalFactory();
        Animal cat = aFacrory.createAnimal("CAT");
        cat.voice();
        Animal dog = aFacrory.createAnimal("DOG");
        dog.voice();
    }
}

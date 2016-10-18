
public class AnimalFactory {
    public Animal createAnimal(String kind){
        if(kind.equalsIgnoreCase("cat")) return new Cat();
        if(kind.equalsIgnoreCase("dog")) return new Dog();
        return null;
    }
}

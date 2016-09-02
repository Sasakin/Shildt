/**
 * Created by Student on 31.08.2016.
 */
public class Main {
    public static void main(String args[]) {
        GrowCollection collection = new GrowCollection();
        collection.addToEnd(1);
        collection.addToEnd(2);
        collection.addToEnd(3);
        System.out.println(collection);
        collection.addByIndex(4,2);
        System.out.println(collection);
        collection.removeByIndex(collection.getSize()-1);
        System.out.println(collection);
    }
}

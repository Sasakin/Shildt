/**
 * Created by Student on 01.09.2016.
 */
public class Main {
    public static void main(String args[]) {
     GrowCollection collection = new GrowCollection();
        collection.add(1);
        collection.add("2");
        collection.add(3);
        collection.add(0,3);
        collection.add(1);
        System.out.println(collection);
        collection.remove(2);
        System.out.println(collection);
        collection.remove("3");
        System.out.println(collection);
    }
}

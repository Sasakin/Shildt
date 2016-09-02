/**
 * Created by Student on 01.09.2016.
 */
public class Main {
    public static void main(String args[]) {
     GrowCollection<Integer> collection = new GrowCollection<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        System.out.println(collection);
    }
}

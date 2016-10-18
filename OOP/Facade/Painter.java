
public class Painter {
    public void doJobWithInspiration(Inspiration inspiration) {
        if(inspiration.isInspiration()) {
            System.out.println("Painter writes painting...");
        }
        else {
            System.out.println("Painter walks in the park...");
        }
    }
}

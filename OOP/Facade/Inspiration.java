

public class Inspiration {
    private boolean inspiration;

    public boolean isInspiration() {
        return inspiration;
    }

    public void activeInspiration() {
        System.out.println("Inspiration is active");
        this.inspiration=true;
    }

    public void lowInspiration() {
        System.out.println("Inspiration is very low..");
        this.inspiration=false;
    }

}

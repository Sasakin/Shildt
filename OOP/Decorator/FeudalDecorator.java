

public class FeudalDecorator implements Feudal {
    Feudal feudal;

    public FeudalDecorator(Feudal feudal) {
       this.feudal = feudal;
    }

    @Override
    public String makeWar() {
        return feudal.makeWar();
    }
}

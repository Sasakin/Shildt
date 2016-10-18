

public class BaronFeudal extends FeudalDecorator {
    public BaronFeudal(Feudal feudal) {
        super(feudal);
    }


    public String makeRecruitment() {
        return "make recruitment wariors";
    }

    @Override
    public String makeWar() {
        return super.makeWar() + makeRecruitment();
    }
}

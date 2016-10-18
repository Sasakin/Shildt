

public class DukeFeudal extends FeudalDecorator {
    public DukeFeudal(Feudal feudal) {
        super(feudal);
    }

    public String armyManagement() {
        return "organizing army management" ;
    }
    @Override
    public String makeWar() {
        return super.makeWar() + armyManagement();
    }
}

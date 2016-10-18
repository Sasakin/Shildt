
public class CottageBuilder extends HauseBuilder {
    @Override
    void buildNumberOfFloors() {
        hause.setNumberOfFloors(NumberOfFloors.THREE);
    }

    @Override
    void buildName() {
        hause.setName("Cottage");
    }

    @Override
    void buildArea() {
        hause.setArea(500);
    }
}

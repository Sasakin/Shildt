

public class Architect {
    HauseBuilder builder;

    public void setBuilder(HauseBuilder builder) {
        this.builder = builder;
    }

    Hause buildHause() {
        builder.createHause();
        builder.buildName();
        builder.buildNumberOfFloors();
        builder.buildArea();

        Hause hause = builder.getHause();

        return hause;
    }

}

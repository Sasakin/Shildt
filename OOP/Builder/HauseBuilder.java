
public abstract class HauseBuilder {
    Hause hause;

    void createHause() {
        hause = new Hause();
    }

    abstract  void buildName();

    abstract void buildArea();

    abstract void buildNumberOfFloors();

    Hause getHause(){
        return hause;
    }
}

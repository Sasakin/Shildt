

public class Hause {
    private int area;
    private NumberOfFloors numberOfFloors;
    private String name;

    public void setArea(int area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfFloors(NumberOfFloors numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Hause: \n" + "name:"+name+"\n" +
                "area:" + area + "\n"+ "number of floors:" + numberOfFloors +"\n";
    }
}

package AbstractFactory.Comedy;


import AbstractFactory.Producer;

public class ComedyProducer implements Producer{
    @Override
    public void Produce() {
        System.out.println("Comedy producer produce comedy film");
    }
}

package AbstractFactory.Opera;


import AbstractFactory.Producer;

public class OperaProducer implements Producer {
    @Override
    public void Produce() {
        System.out.println("Opera producer produce opera");
    }
}

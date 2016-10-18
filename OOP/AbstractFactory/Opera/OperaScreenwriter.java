package AbstractFactory.Opera;


import AbstractFactory.Screenwriter;

public class OperaScreenwriter implements Screenwriter {
    @Override
    public void writeScreenplay() {
        System.out.println("Opera screenwriter writes screenplay");
    }
}

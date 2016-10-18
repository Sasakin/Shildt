package AbstractFactory.Comedy;

import AbstractFactory.Screenwriter;

public class ComedyScreenwriter implements Screenwriter {
    @Override
    public void writeScreenplay() {
        System.out.println("Comedy screenwriter write comedy screenplay");
    }
}

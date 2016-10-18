package Observer;

import java.util.List;

/**
 * Created by Student on 06.10.2016.
 */
public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear "+ name + "\nwe have some changes in vacancies " + vacancies);
    }
}

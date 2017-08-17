package chapte14;

/**
 * Created by sasakin on 21.07.2017.
 */
public interface TestInterface {
    void rowFilled(String e);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

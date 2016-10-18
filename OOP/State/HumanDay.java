package State;

public class HumanDay {

    public static void main(String args[]) {
        Activity activity = new Sleeping();

        Human human = new Human();
        human.setActivity(activity);

        for(int i=0;i<5;i++) {
            human.justDoIt();
            human.changeActivity();
        }


    }
}

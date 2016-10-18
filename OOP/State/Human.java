package State;

public class Human {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if(activity instanceof Sleeping)
            setActivity(new Reading());
        if(activity instanceof Reading)
            setActivity(new Coding());
        if(activity instanceof Coding)
            setActivity(new Sleeping());
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}

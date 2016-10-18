package Observer;

public class JobSerach {
    public static void main(String args[]) {
        ArhitectJobSite jobSite = new ArhitectJobSite();

        jobSite.addVacancy("First vacancy");
        jobSite.addVacancy("Second vacancy");

        Observer firstSubscriber = new Subscriber("FirstSubscriber");
        Observer secondSubscriber = new Subscriber("SecondSubscriber");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Arhitect vacancy");
    }
}

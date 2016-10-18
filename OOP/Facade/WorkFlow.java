

public class WorkFlow {
    Job job = new Job();
    Inspiration inspiration = new Inspiration();
    Painter painter = new Painter();

    public void runWorks() {
        job.doJob();
        inspiration.activeInspiration();
        painter.doJobWithInspiration(inspiration);

    }
}


public class BuildHauseRunner {
    public static void main(String args[]) {
        Architect architect = new Architect();

        architect.setBuilder(new CottageBuilder());
        Hause hause = architect.buildHause();

        System.out.println(hause);
    }
}

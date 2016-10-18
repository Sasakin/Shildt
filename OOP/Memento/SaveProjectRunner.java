package Memento;

public class SaveProjectRunner {
    public static void main(String args[]) {
        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to github..");
        github.setSave(project.save());

        project.setVersionAndDate("version 1.1");

        System.out.println(project);

        project.load(github.getSave());

        System.out.println(project);
    }
}

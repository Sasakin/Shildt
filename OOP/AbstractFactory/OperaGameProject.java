package AbstractFactory;


import AbstractFactory.Opera.OperaTeamFactory;

public class OperaGameProject {
    public static void main(String args[]) {
        ProjectTeamFactory TeamFactory = new OperaTeamFactory();
        Artist artist = TeamFactory.getArtist();
        Producer producer = TeamFactory.getProducer();
        Screenwriter screenwriter = TeamFactory.getScreenwriter();

        System.out.println("Create project");

        artist.play();
        producer.Produce();
        screenwriter.writeScreenplay();
    }
}

package AbstractFactory;
public interface ProjectTeamFactory {
    Artist getArtist();

    Producer getProducer();

    Screenwriter getScreenwriter();
}

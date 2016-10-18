package AbstractFactory.Comedy;


import AbstractFactory.Artist;
import AbstractFactory.Producer;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Screenwriter;

public class ComedyTeamFactory implements ProjectTeamFactory {
    @Override
    public Artist getArtist() {
        return new ComedyArtist();
    }

    @Override
    public Producer getProducer() {
        return new ComedyProducer();
    }

    @Override
    public Screenwriter getScreenwriter() {
        return new ComedyScreenwriter();
    }
}

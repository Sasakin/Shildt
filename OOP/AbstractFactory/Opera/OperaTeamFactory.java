package AbstractFactory.Opera;

import AbstractFactory.Artist;
import AbstractFactory.Producer;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Screenwriter;

public class OperaTeamFactory  implements ProjectTeamFactory{
    @Override
    public Artist getArtist() {
        return new OperaArtist();
    }

    @Override
    public Producer getProducer() {
        return new OperaProducer();
    }

    @Override
    public Screenwriter getScreenwriter() {
        return new OperaScreenwriter();
    }
}

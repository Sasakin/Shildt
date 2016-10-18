
public class MusicCreator {
    public static void main(String args[]) {
        Music[] musics = { new InstrumentalStudio(new InstrumentalComposer()) ,
            new ElectroStudio(new ElectroComposer())};

        for(Music music:musics) {
            music.composerMusic();
        }
    }
}

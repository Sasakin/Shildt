

public class InstrumentalStudio extends Music {
    protected InstrumentalStudio(Composer composer) {
        super(composer);
    }

    @Override
    public void composerMusic() {
        System.out.println("Instrumental studio design in progress...");
        composer.writeMusic();
    }
}

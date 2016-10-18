


public class ElectroStudio extends Music  {
    protected ElectroStudio(Composer composer) {
        super(composer);
    }

    @Override
    public void composerMusic() {
        System.out.println("Electro studio design in progress...");
        composer.writeMusic();
    }
}

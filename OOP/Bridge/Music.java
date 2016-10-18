

public abstract class Music {
    protected Composer composer;

    protected Music(Composer composer) {
        this.composer=composer;
    }

    public abstract void composerMusic();
}

public abstract class VideoAbstraction {

    protected IVideoMod videoMod;

    public IVideoMod getVideoMod() {
        return videoMod;
    }

    public abstract void showScreen();
}

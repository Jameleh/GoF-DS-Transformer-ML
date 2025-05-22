public class Direct3DMode implements IVideoMod{

    private static final String ModeName  = "Direct3D Mode";
    @Override
    public String getScreen() {
        return "video started with:" + ModeName;
    }
}

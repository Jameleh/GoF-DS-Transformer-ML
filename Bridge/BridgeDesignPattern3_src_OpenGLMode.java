public class OpenGLMode implements IVideoMod{

 private static final String ModeName  = "OpenGL Mode";
    @Override
    public String getScreen() {
        return "video started with:" + ModeName;
    }
}

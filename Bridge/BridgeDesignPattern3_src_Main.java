public class Main {
    public static void main(String[] args) {
        VideoAbstraction video = new VideoRefinedAbstraction();
        IVideoMod videoMod = new OpenGLMode();
        video.videoMod = new OpenGLMode();
        video.showScreen();
    }
}
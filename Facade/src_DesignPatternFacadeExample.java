import facade.VideoConversionFacade;

import java.io.File;

public class DesignPatternFacadeExample {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
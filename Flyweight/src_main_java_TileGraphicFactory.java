import javafx.scene.image.Image;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<String, Image> images = new HashMap<>();

    public static Image getTileImage(String type) {
        if (!images.containsKey(type)) {
            String path = "/" + type + ".png";
            InputStream is = TileGraphicFactory.class.getResourceAsStream(path);
            if (is == null) {
                throw new RuntimeException("Image not found at path: " + path);
            }
            images.put(type, new Image(is));
        }
        return images.get(type);
    }
}

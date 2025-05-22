/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class ImageProxy implements IImage {
    private String fileName;
    Image image = null;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new Image(fileName);
        }
        image.display();
    }
}

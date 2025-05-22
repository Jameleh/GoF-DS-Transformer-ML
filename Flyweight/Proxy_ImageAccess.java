package Proxy;

public class ImageAccess implements EstateImage {
    private HighImage highImage;
    private String path;
    private boolean isAuthenticated; // for protection
    private boolean isPreviewCached; // caching preview state
    private int loadCount;           //  tracking load frequency

    public ImageAccess(String imagePath, boolean isAuthenticated) {
        this.path = path;
        this.isAuthenticated = isAuthenticated;
        this.isPreviewCached = false;
        this.loadCount = 0;
    }

    @Override
    public void showPreview() {
        if (!isPreviewCached) {
            System.out.println("loading and caching preview for " + path + "");
            isPreviewCached = true;
        } else {
            System.out.println("showing cached preview for " + path + "");
        }
    }

    @Override
    public void showHighRes() {
        if (highImage == null) {
            highImage = new HighImage(path);
            loadCount++;
        }
        highImage.showHighRes();
        System.out.println("High image loaded " + loadCount + " time");
    }

 //upload or replace image with authentication check
    public void replaceImage(String newImagePath) {
        if (isAuthenticated) {
            System.out.println("Agent replaced image with: " + newImagePath);
            this.path = newImagePath;
            this.highImage = null; // reset to load new image
            this.isPreviewCached = false; // reset preview cache
        } else {
            System.out.println("Access denied - you don't authenticated !");
        }
    }
}

public class Colors implements Cloneable{
    private String nameColor;
    private String rgbColor;
    private String hexadecimalColor;
    private String colorType;

    public Colors(String nameColor, String rgbColor, String hexadecimalColor, String colorType) {
        this.nameColor = nameColor;
        this.rgbColor = rgbColor;
        this.hexadecimalColor = hexadecimalColor;
        this.colorType = colorType;
    }

    public String getNameColor() {
        return nameColor;
    }

    public void setNameColor(String nameColor) {
        this.nameColor = nameColor;
    }

    public String getRgbColor() {
        return rgbColor;
    }

    public void setRgbColor(String rgbColor) {
        this.rgbColor = rgbColor;
    }

    public String getHexadecimalColor() {
        return hexadecimalColor;
    }

    public void setHexadecimalColor(String hexadecimalColor) {
        this.hexadecimalColor = hexadecimalColor;
    }

    public String getColorType() {
        return colorType;
    }

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }
    public Colors clone() throws CloneNotSupportedException{
        Colors colorClone = (Colors) super.clone();
        return colorClone;
    }
    @Override
    public String toString() {
        return "Colors{" +
                "nameColor='" + nameColor + '\'' +
                ", rgbColor='" + rgbColor + '\'' +
                ", hexadecimalColor='" + hexadecimalColor + '\'' +
                ", colorType='" + colorType + '\'' +
                '}';
    }

}

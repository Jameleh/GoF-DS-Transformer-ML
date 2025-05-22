import static org.junit.jupiter.api.Assertions.*;

class ColorsTest {

    @org.junit.jupiter.api.Test
    void deveCriarCoresPrimarias() throws CloneNotSupportedException {
        Colors color = new Colors("red", "(255,0,0)", "#FF0000","primary");

        Colors colorClone = color.clone();
        colorClone.setNameColor("blue");
        colorClone.setRgbColor("(0,0,255)");
        colorClone.setHexadecimalColor("#0000FF");

        assertEquals("Colors{nameColor='red', rgbColor='(255,0,0)', hexadecimalColor='#FF0000', colorType='primary'}", color.toString());
        assertEquals("Colors{nameColor='blue', rgbColor='(0,0,255)', hexadecimalColor='#0000FF', colorType='primary'}", colorClone.toString());
    }

    @org.junit.jupiter.api.Test
    //Acredito que este teste faria mais sentido para a classe, tendo em vista que só existem 3 cores primárias
    void deveCriarCoresSecundarias() throws CloneNotSupportedException {
        Colors color = new Colors("pink", "(255,0,255)", "#FF00FF","secondary");

        Colors colorClone = color.clone();
        colorClone.setNameColor("cyan");
        colorClone.setRgbColor("(0,255,255)");
        colorClone.setHexadecimalColor("#00FFFF");

        assertEquals("Colors{nameColor='pink', rgbColor='(255,0,255)', hexadecimalColor='#FF00FF', colorType='secondary'}", color.toString());
        assertEquals("Colors{nameColor='cyan', rgbColor='(0,255,255)', hexadecimalColor='#00FFFF', colorType='secondary'}", colorClone.toString());
    }
}
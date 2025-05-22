package factory.method;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author Ygor
 */
public abstract class Personagem {
        public int str,dex,con,inte,wit,men;
        public String armadura,arma;
	private BufferedImage imagem;

	public Personagem(int str, int dex, int con, int inte, int wit, int men, String armadura, String arma, String nomeDoArquivo) {
            this.str = str;
            this.dex = dex;
            this.con = con;
            this.inte = inte;
            this.wit = wit;
            this.men = men;
            this.armadura = armadura;
            this.arma = arma;
		try{
			imagem = ImageIO.read(getClass().getClassLoader()
					.getResourceAsStream("img/" + nomeDoArquivo));
		} catch (IOException e){
			e.printStackTrace();
			System.out.println("Nome da imagem não encontrada..."+ nomeDoArquivo);
		}
	}

	public Image getImagem(){
		return imagem;
	}
}

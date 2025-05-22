package factory.method;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Ygor
 */
public abstract class PersonagemFactory {
	List<Personagem> personagem = new ArrayList<Personagem>();

	public abstract void criarPersonagem();

	public void exibirPersonagem(){

		JFrame frame = new JFrame();
                
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < personagem.size(); i++){

			frame.getContentPane().setLayout(new FlowLayout());

			frame.add(new JLabel(new ImageIcon(personagem.get(i).getImagem())));
		}

		frame.pack();

		frame.setVisible(true);
	}
}

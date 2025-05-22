package dp_facade;
import java.util.Scanner;

public class Pedido {

	public static void main(String[] args) {
		System.out.println("Selecione seu combo:\n1 - Combo Padrão\n2 - Combo Deluxe ");
		Scanner input = new Scanner(System.in);

		int numero = input.nextInt();
		Combo combo = new Combo();
		combo.criarCombo(numero);
		System.out.println(combo);
		input.close();
	}
}

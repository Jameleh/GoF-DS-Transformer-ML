package forma;

import cores.Cores;

public class Circulo extends CriaForma {
	
	public Circulo(Cores c) {
		super(c);
	}

	@Override
	public void pintaForma(){
		this.c.setColor("circulo");
		System.out.println("Forma: "+c.getColor());
	}
	
}

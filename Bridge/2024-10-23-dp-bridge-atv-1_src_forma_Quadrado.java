package forma;

import cores.Cores;

public class Quadrado extends CriaForma {
	
	public Quadrado(Cores c) {
		super(c);
	}

	@Override
	public void pintaForma(){
		this.c.setColor("quadrado");
		System.out.println("Forma: "+c.getColor());
	}
	
}


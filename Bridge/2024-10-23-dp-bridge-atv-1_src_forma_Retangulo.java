package forma;

import cores.Cores;

public class Retangulo extends CriaForma {
	
	public Retangulo(Cores c) {
		super(c);
	}

	@Override
	public void pintaForma(){
		this.c.setColor("retangulo");
		System.out.println("Forma: "+c.getColor());
	}
	
}


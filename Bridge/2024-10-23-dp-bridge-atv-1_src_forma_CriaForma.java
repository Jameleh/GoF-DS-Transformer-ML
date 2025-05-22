package forma;

import cores.Cores;

public abstract class CriaForma {
	
	protected Cores c;
	
	public CriaForma(Cores c) {
		this.c = c;
	}

	public void pintaForma() {};
}


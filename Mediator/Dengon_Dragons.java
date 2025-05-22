package dp_assignment_3;

import java.util.ArrayList;

public class Dengon_Dragons implements mediator {
	
	private ArrayList<players> p;
	
	public Dengon_Dragons() {
		
		this.p = new ArrayList<players>();
	}
	
	@Override
	public void add_member(players player) {
		System.out.println(player.getN() + " [" + player.getS() + "] walks in the Dungeons & Dragons");
		player.add_party(this);
		this.p.add(player);
	}

	@Override
	public void action(players player, Actions action) {
		for (players p : this.p)
		{
			if (!p.getN().equals(player.getN()))
			{
				p.responce(action);
			}
		}
		
	}

}

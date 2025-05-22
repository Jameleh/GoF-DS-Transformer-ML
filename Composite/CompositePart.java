package task2_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Component {							
	void nameTeamsNumAthletes();
	void nameTeamsNumGoldMedals();
	void nameAthletesNumberAthletes();
}	


class Leaf implements Component{				//for most lowest parts => disciplines
	String name;
	int athletes;
	int goldMedals;
	String[] nAthletes;
	
	public Leaf(String name, int athletes, int goldMedals, String[] nAthletes) {		//standard constructor
		super();
		this.name = name;
		this.athletes = athletes;
		this.goldMedals = goldMedals;
		this.nAthletes = nAthletes;
	}

	@Override
	public void nameTeamsNumAthletes() {
		System.out.println(" Team: " + name + ", Number of Athletes: " + athletes);
	}

	@Override
	public void nameTeamsNumGoldMedals() {
		System.out.println(" Team: " + name + ", Number of gold medals: " + goldMedals);
	}

	@Override
	public void nameAthletesNumberAthletes() {
		System.out.println(" Athletes: " + Arrays.toString(nAthletes) + ", Number of Athletes: " + athletes);
	}

}


class Composite implements Component{
	String name;
	List<Component> teams = new ArrayList<>();		//holds list of components => subordinate teams
		
	public Composite(String name) {					//standard constructor
		super();
		this.name = name;
	}

	public void addTeam(Component t) {
		teams.add(t);
	}
	
	@Override
	public void nameTeamsNumAthletes() {			//prints out ALL subordinate teams & the demanded characteristic(s)
		System.out.println(name + ":");
		for(Component t : teams) {
			t.nameTeamsNumAthletes();
		}
	}

	@Override
	public void nameTeamsNumGoldMedals() {			//prints out ALL subordinate teams & the demanded characteristic(s)
		System.out.println(name + ":");
		for(Component t : teams) {
			t.nameTeamsNumGoldMedals();
		}
	}

	@Override
	public void nameAthletesNumberAthletes() {		//prints out ALL subordinate teams & the demanded characteristic(s)
		System.out.println(name + ":");
		for(Component t : teams) {
			t.nameAthletesNumberAthletes();
		}
	}

}

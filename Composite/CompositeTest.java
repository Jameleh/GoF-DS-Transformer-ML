package task2_1;

public class CompositeTest {

	public static void main(String[] args) {
		String[][] athleteNames = { {},{},{},				//empty set of String-arrays with potential names of athletes
									{},						//each line indicates one women's team/men's team
									{},{},
									{},{}
								  };
		Composite olympicTeams = new Composite("Olympic Teams");				//initializes olympicTeams to "hold" other Composites
		
		Composite asiaTeam = new Composite("Asia Team");						//initializes asiaTEam + sub-composites
		Composite chinaTeam = new Composite("China Team");
		Composite chinaTeamW = new Composite("Women's Team");
		Composite chinaTeamM = new Composite("Mens's Team");
		
		Component teakwondo = new Leaf("Teakwondo", 5, 3, athleteNames[0]);		//initializes disciplines as leafs
		Component waterpolo = new Leaf("Waterpolo", 2, 4, athleteNames[1]);
		Component artGymnastics = new Leaf("Art Gymnastics", 7, 10, athleteNames[2]);
		Component shooting = new Leaf("Shooting", 10, 8, athleteNames[3]);
		
		olympicTeams.addTeam(asiaTeam);								//adds asiaTeam to olympicTeams
			asiaTeam.addTeam(chinaTeam);
				chinaTeam.addTeam(chinaTeamW);
					chinaTeamW.addTeam(teakwondo);					
					chinaTeamW.addTeam(waterpolo);
					chinaTeamW.addTeam(artGymnastics);
		
				chinaTeam.addTeam(chinaTeamM);
					chinaTeamM.addTeam(shooting);

//		chinaTeam.nameTeamsNumAthletes();							//testcases for china as a whole
//		chinaTeam.nameTeamsNumGoldMedals();
//		chinaTeam.nameAthletesNumberAthletes();
		
		
							
		Composite europeTeam = new Composite("Europe Team");		//see comments above
		Composite germanyTeam = new Composite("Germany Team");
		Composite germanyTeamW = new Composite("Women's Team");
		Composite germanyTeamM = new Composite("Men's Team");
		
		Component cycling = new Leaf("Cycling", 2, 5, athleteNames[4]);
		Component tennis = new Leaf("Tennis", 4, 2, athleteNames[5]);
		Component tableTennis = new Leaf("Table Tennis", 1, 0, athleteNames[6]);
		Component football = new Leaf("Football", 11, 4, athleteNames[7]);
		
		olympicTeams.addTeam(europeTeam);
			europeTeam.addTeam(germanyTeam);
				germanyTeam.addTeam(germanyTeamW);
					germanyTeamW.addTeam(cycling);
					germanyTeamW.addTeam(tennis);
				germanyTeam.addTeam(germanyTeamM);
					germanyTeamM.addTeam(tableTennis);
					germanyTeamM.addTeam(football);
				
//Demanded test cases: 
					
		germanyTeamM.nameTeamsNumAthletes(); 		//a.
		
		System.out.println("---------------------------------------");
		
		germanyTeam.nameTeamsNumGoldMedals();		//b.
		
		System.out.println("---------------------------------------");
		
		asiaTeam.nameTeamsNumGoldMedals();			//c.
				
		System.out.println("---------------------------------------");
		
		olympicTeams.nameAthletesNumberAthletes();	//d.	
	}

}

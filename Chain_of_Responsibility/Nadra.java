package chainofResponsibilityDesignPattern;

public class Nadra extends VerficationSystem 
{ 

	public Nadra(VerficationSystem processor){ 
		super(processor); 
	} 

	public void process(Number request) 
	{ 
		if (request.getNumber() > 0) 
		{ 
			System.out.println("PositiveProcessor : " + request.getNumber()); 
		} 
		else
		{ 
			super.process(request); 
		} 
	} 
} 


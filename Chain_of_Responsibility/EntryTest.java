package chainofResponsibilityDesignPattern;

public class EntryTest extends VerficationSystem 
{ 
	public EntryTest(VerficationSystem processor){ 
		super(processor); 
		
	} 

	public void process(Number request) 
	{ 
		if (request.getNumber() < 0) 
		{ 
			System.out.println("NegativeProcessor : " + request.getNumber()); 
		} 
		else
		{ 
			super.process(request); 
		} 
	} 
} 

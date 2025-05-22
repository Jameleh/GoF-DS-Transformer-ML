package chainofResponsibilityDesignPattern;

public class BISE extends VerficationSystem 
{ 
	public BISE(VerficationSystem processor){ 
		super(processor); 
	} 

	public void process(Number request) 
	{ 
		if (request.getNumber() == 0) 
		{ 
			System.out.println("ZeroProcessor : " + request.getNumber()); 
		} 
		else
		{ 
			super.process(request); 
		} 
	} 
} 

package chainofResponsibilityDesignPattern;

public abstract class VerficationSystem {
	private VerficationSystem processor; 

	public VerficationSystem(VerficationSystem processor){ 
		this.processor = processor; 
	}; 
	
	public void process(Number request){ 
		if(processor != null) 
			processor.process(request); 
	}; 
}

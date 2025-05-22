package chainofResponsibilityDesignPattern;

public class Chain {

VerficationSystem chain; 

public Chain(){ 
	buildChain(); 
} 

private void buildChain(){ 
	chain = new EntryTest(new BISE(new Nadra(null))); 
} 

public void process(Number request) { 
	chain.process(request); 
}
}

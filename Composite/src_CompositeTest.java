
public class CompositeTest {

	public static void main(String[] args) {

		Leaf hd = new Leaf(2000,"Harddrive");
		Leaf mouse = new Leaf(500,"Mouse");
		Leaf monitor = new Leaf(8000,"Monitor");
		Leaf ram = new Leaf(3000,"RAM");
		Leaf cpu = new Leaf(9000,"CPU");
      
      Composite ph = new Composite("Peripheral"); 
      Composite cabinet = new Composite("Cabinet"); 
      Composite mb = new Composite("MotherBoard"); 
      Composite comp = new Composite("Computer"); 
      
      ph.addComponent(mouse);
      ph.addComponent(monitor);
      mb.addComponent(cpu);
      mb.addComponent(ram);
      cabinet.addComponent(hd);
      cabinet.addComponent(mb);
      comp.addComponent(ph);
      comp.addComponent(cabinet);
      

mouse.showPrice();
ph.showPrice();
comp.showPrice();   
		
		

	}

}

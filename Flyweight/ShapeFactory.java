package flyweightDesign;

import java.util.HashMap;

public class ShapeFactory 
{ 
	/* HashMap stores the reference to the object 
	of specific shapes. */
	private static HashMap <String, IShapeInterface> shape = 
						new HashMap<String, IShapeInterface>(); 

	// Method to get a shape 
	public static IShapeInterface getShape(String label) 
	{ 
		IShapeInterface p = null; 

		
		if (shape.containsKey(label)) 
				p = shape.get(label); 
		else
		{ 
			/* create an object of a shape */
			switch(label) 
			{ 
			case "rc": 
				System.out.println("Rectangle Created"); 
				p = new Rectangle(); 
				break; 
			case "tr": 
				System.out.println("Triangle Created"); 
				p = new Triangle(); 
				break; 
			case "sq": 
				System.out.println("Square Created"); 
				p = new Square(); 
				break; 
			case "ci": 
				System.out.println("Circle Created"); 
				p = new Circle(); 
				break; 
			case "ov": 
				System.out.println("Oval Created"); 
				p = new Oval(); 
				break; 
			case "pa": 
				System.out.println("Parallelogram Created"); 
				p = new Parallelogram(); 
				break; 
			case "he": 
				System.out.println("Hexagon Created"); 
				p = new Hexagon(); 
				break; 
			case "sp": 
				System.out.println("Sphere Created"); 
				p = new Sphere(); 
				break; 
			
			default : 
				System.out.println("Unreachable code!"); 
			} 

			// Once created insert it into the HashMap 
			shape.put(label, p); 
		} 
		return p; 
	} 
} 



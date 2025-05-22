package CS335_Lab_week9;


public class TestIteratorPattern {

	public static void main(String[] args) {
		ShapeStorage storage = new ShapeStorage();
 		storage.addShape("Polygon");
		storage.addShape("Hexagon");
		storage.addShape("Circle");
		storage.addShape("Rectangle");
		storage.addShape("Square");
		
		ShapeIterator iterator = new ShapeIterator(storage.getShapes());
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		if(iterator.contains("Trapezium"))
		{
			System.out.println("Trapezium inside!");
		}
		else {
			System.out.println("Trapezium not inside!");
		}
		if(iterator.contains("Polygon"))
		{
			System.out.println("Polygon found!");
		}
		else {
			System.out.println("Polygon not found!");
		}
		System.out.println("Apply removing while iterating...");
		iterator = new ShapeIterator(storage.getShapes());
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			iterator.remove();
		}
		ShapeIterator iterator2 = new ShapeIterator(storage.getShapes());
		while(iterator2.hasPrev()){
			System.out.println("Prev:" +iterator2.prev());
		}	
	}

}

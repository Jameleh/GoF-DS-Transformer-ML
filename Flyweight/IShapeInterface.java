package flyweightDesign;

public interface IShapeInterface {
	public String draw(String graphicType,int x, int y, int width, int height,
			String color, boolean fill);
}
class Rectangle implements IShapeInterface{

	public String draw(String graphicType,int x, int y, int width, int height,
			String color, boolean fill) {
		
		return "This string has the following parameters: X:" + x + 
				" Y:"+y + " Width:"+ width + " Height :" + height+ " Color: "+ color+ " Fill:" + fill + " Type:" +graphicType;
	}
 
}
class Triangle implements IShapeInterface{


	public String draw(String graphicType,int x, int y, int width, int height,
			String color, boolean fill) {
		
		return "This string has the following parameters: X:" + x + 
				" Y:"+y + " Width:"+ width + " Height :" + height+ " Color: "+ color+ " Fill:" + fill + " Type:" +graphicType;
	}
}
class Square implements IShapeInterface{

	public String draw(String graphicType,int x, int y, int width, int height,
			String color, boolean fill) {
		
		return "This string has the following parameters: X:" + x + 
				" Y:"+y + " Width:"+ width + " Height :" + height+ " Color: "+ color+ " Fill:" + fill + " Type:" +graphicType;
	}
}
class Circle implements IShapeInterface{
	public String draw(String graphicType,int x, int y, int width, int height,
			String color, boolean fill) {
		
		return "This string has the following parameters: X:" + x + 
				" Y:"+y + " Width:"+ width + " Height :" + height+ " Color: "+ color+ " Fill:" + fill + " Type:" +graphicType;
	}
}
class Oval implements IShapeInterface{

	public String draw(String graphicType,int x, int y, int width, int height,
			String color, boolean fill) {
		
		return "This string has the following parameters: X:" + x + 
				" Y:"+y + " Width:"+ width + " Height :" + height+ " Color: "+ color+ " Fill:" + fill + " Type:" +graphicType;
	}
}
class Parallelogram implements IShapeInterface{
	

	public String draw(String graphicType,int x, int y, int width, int height,
			String color, boolean fill) {
		
		return "This string has the following parameters: X:" + x + 
				" Y:"+y + " Width:"+ width + " Height :" + height+ " Color: "+ color+ " Fill:" + fill + " Type:" +graphicType;
	}
}
class Hexagon implements IShapeInterface{
	

	public String draw(String graphicType,int x, int y, int width, int height,
			String color, boolean fill) {
		
		return "This string has the following parameters: X:" + x + 
				" Y:"+y + " Width:"+ width + " Height :" + height+ " Color: "+ color+ " Fill:" + fill + " Type:" +graphicType;
	}
}
class Sphere implements IShapeInterface{
	

	public String draw(String graphicType,int x, int y, int width, int height,
			String color, boolean fill) {
		
		return "This string has the following parameters: X:" + x + 
				" Y:"+y + " Width:"+ width + " Height :" + height+ " Color: "+ color+ " Fill:" + fill + " Type:" +graphicType;
	}
}
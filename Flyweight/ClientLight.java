package flyweightDesign;

import java.awt.Color;

public class ClientLight  {

	  private static final int WIDTH = 1800, HEIGHT = 1600;
	  
	  //rc=rectangle, tr=triangle, sq=square, ci=circle, ov=oval, pa=parallelogram, he=hexagon, sp=sphere
	  private static final String shapes[] = { "rc", "tr", "sq", "ci", "ov", "pa", "he", "sp"};
	  
	  private static final Color colors[] = { Color.red, Color.green, Color.blue, Color.darkGray };
	  private static final boolean fill[] = { true, false };
	  
	  
	  public static void main(String[] args) {
          ClientLight client = new ClientLight();
      }

	  public ClientLight() {    

	    for(int i = 0; i < 1000; ++i) {
	      //Your code for ShapeFactory and generating random values for different variables
	    	IShapeInterface shape = ShapeFactory.getShape(getRandomShape());
	    	
	    }    
	   }

	   private static String getRandomShape() {
		   return shapes[(int) (Math.random() * shapes.length)];
	   }
	   private int getRandomX() {
		   return (int) (Math.random() * WIDTH*0.9);
	   }
	   private int getRandomY()
	   {
		   return (int) (Math.random() * HEIGHT*0.8);
	   }
	   private int getRandomWidth()
	   {
		   return (int) (Math.random() * (WIDTH / 7));}
	   private int getRandomHeight() {

		   return (int) (Math.random() * (HEIGHT / 7));
	   }
	   private Color getRandomColor() {
		   return colors[(int) (Math.random() * colors.length)];
	   }
	   private boolean getRandomFill() {
		   return fill[(int) (Math.random() * fill.length)];
	   }
	   
       public String toString() {
    	   return "Shape"+ this.getRandomShape()+ "X: " + this.getRandomX()+"Y:"+ this.getRandomY()+"Width:"+ this.getRandomWidth()+"Height" +this.getRandomHeight()+"Color: " + this.getRandomColor()+ "Fill: " + this.getRandomFill();
       }
       

}
package CS335_Lab_week9;

import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape>{

	private Shape [] shapes;
	int pos;
	int index;
	public ShapeIterator(Shape []shapes){
		this.shapes = shapes;
		//this.index = shapes.length-1;
	}
	public boolean hasPrev() 
	{
		if(index< 0 || shapes[index] == null)
			return false;
		return true;
	}
	public Shape prev() 
	{
		return shapes[index--];
	}
	@Override
	public boolean hasNext() {
		if(pos >= shapes.length || shapes[pos] == null)
			return false;
		return true;
	}
	@Override
	public Shape next() {
		return shapes[pos++];
	}
	@Override
	public void remove() {
		if(pos <=0 )
			throw new IllegalStateException("Illegal position");
		if(shapes[pos-1] !=null){
			for (int i= pos-1; i<(shapes.length-1);i++){
				shapes[i] = shapes[i+1];
			}
			shapes[shapes.length-1] = null;
		}
	}
	public boolean contains(String shape)
	{
		for(int i =0 ; i<shapes.length;i++)
		{
			if(shapes[i]!=null)
			{
				if(shapes[i].getName().equals( shape))
				{
					return true;
				}
			}
		}
		return false;
	}
}

package comarun.main;

import java.util.ArrayList;
import java.util.List;

public class ArraysList implements Aggregate{
	
	List<Product> products=new ArrayList<>();
	
	public void add(Product product)
	{
		this.products.add(product);
	}
	@Override
	public Iterator createIterator() {
		
		return new ArraysListIterator(products);
	}

}

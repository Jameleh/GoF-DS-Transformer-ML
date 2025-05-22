package comarun.main;

import java.util.List;

public class ArraysListIterator implements Iterator{
	
	private List<Product> products;
	private int curr;
	

	public ArraysListIterator(List<Product> products) {
		super();
		this.products = products;
		this.curr = -1;
	}

	@Override
	public Boolean hasNext() {
		return curr<products.size()-1;
	}

	@Override
	public Product next() {
		if (hasNext())
		{
			return products.get(++curr);
		}
		return null;
	}

}

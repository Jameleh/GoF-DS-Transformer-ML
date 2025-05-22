package com.genpact.concreteHandlers;

import com.genpact.abstractHandler.OrderHandler;
import com.genpact.order.Order;

public class DiscountHandler extends OrderHandler{

	@Override
	public void process(Order order) {
		// TODO Auto-generated method stub
		 order.ApplyDiscount();
         System.out.println("Discount applied to order if any.");
         if (nextHandler != null) nextHandler.process(order);
		
	}
	

}

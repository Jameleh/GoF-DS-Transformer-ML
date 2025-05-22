package com.genpact.concreteHandlers;

import com.genpact.abstractHandler.OrderHandler;
import com.genpact.order.Order;

public class ShippingHandler extends OrderHandler{

	@Override
	public void process(Order order) {
		// TODO Auto-generated method stub
		{
            order.Ship();
            System.out.println("Order shipped to customer.");
        }
		
	}
	

}

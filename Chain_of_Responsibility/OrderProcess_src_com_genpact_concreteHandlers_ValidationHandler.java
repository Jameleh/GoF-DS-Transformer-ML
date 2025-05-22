package com.genpact.concreteHandlers;

import java.io.IOException;

import com.genpact.abstractHandler.OrderHandler;
import com.genpact.order.Order;

public class ValidationHandler extends OrderHandler {

	@Override
	public void process(Order order) {
		// TODO Auto-generated method stub
		try {
			if (order.isValid(order.getOrderRequest()))
			{
			    System.out.println("Order validation passed.");
			    if (nextHandler != null) nextHandler.process(order);
			}
			else
			{
			    System.out.println("Order validation failed. Halting process.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

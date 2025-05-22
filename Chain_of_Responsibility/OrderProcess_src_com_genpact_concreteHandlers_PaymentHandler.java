package com.genpact.concreteHandlers;

import com.genpact.abstractHandler.OrderHandler;
import com.genpact.order.Order;

public class PaymentHandler extends OrderHandler{

	@Override
	public void process(Order order) {
		// TODO Auto-generated method stub
		if (order.ProcessPayment())
        {
           System.out.println("Payment processed successfully.");
            if (nextHandler != null) nextHandler.process(order);
        }
        else
        {
           System.out.println("Payment processing failed. Halting process.");
        }
		
	}
	
	

}

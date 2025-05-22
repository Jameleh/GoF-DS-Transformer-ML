package com.genpact.order;

import com.genpact.concreteHandlers.DiscountHandler;
import com.genpact.concreteHandlers.PaymentHandler;
import com.genpact.concreteHandlers.ShippingHandler;
import com.genpact.concreteHandlers.ValidationHandler;
import com.genpact.model.OrderRequest;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Setup order processing chain
		ValidationHandler  validation = new ValidationHandler();
		DiscountHandler discount = new DiscountHandler();
		PaymentHandler payment = new PaymentHandler();
		ShippingHandler shipping = new ShippingHandler();

        validation.SetNext(discount);
        discount.SetNext(payment);
        payment.SetNext(shipping);

        OrderRequest orderRequest= new OrderRequest();
        orderRequest.setOrderId(12345);
        orderRequest.setEmailAddress("psoop@gmail.com");
        orderRequest.setPhoneNumber("9784979949");
        Order order = new Order(orderRequest);
        
        validation.process(order);
	}

}

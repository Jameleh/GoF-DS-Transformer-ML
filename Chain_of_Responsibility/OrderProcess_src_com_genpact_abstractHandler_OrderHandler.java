package com.genpact.abstractHandler;

import java.io.IOException;

import com.genpact.order.Order;

public abstract class OrderHandler {
	 protected OrderHandler nextHandler;

     public void SetNext(OrderHandler handler)
     {
         nextHandler = handler;
     }

     public abstract void process(Order order) ;

}

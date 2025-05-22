package com.proxyTest.object;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyObject implements InvocationHandler {

	private Object instanceObject;

	public Object bind(Object realObj) {
		this.instanceObject = realObj;
		return Proxy.newProxyInstance(instanceObject.getClass().getClassLoader(), 
				instanceObject.getClass().getInterfaces(), this);
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("Start Proxy!!");
		
		Object result = method.invoke(instanceObject, args);
		
		System.out.println("End Proxy!!");
		return result;
	}

}

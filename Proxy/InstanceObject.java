package com.proxyTest.object;

import com.proxyTest.interFace.ProxyInterface;

public class InstanceObject implements ProxyInterface {

	@Override
	public void proxyMethod() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Instance Method!!!");
		method2("proxyMethod call method2, this method will skip AOP!!");
	}
	
	@Override
	public void method2(String arg) {
		System.out.println(arg);
	}

}

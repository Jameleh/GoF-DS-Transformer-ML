package com.dev.buyfactory;

import com.dev.implserviceproxy.ImplServiceProxy;
import com.dev.implservicereal.ImplServiceReal;
import com.dev.service.MobileService;

public class BuyFactory {
	
	public static MobileService getInstance(String couponCode) {
		
		if (couponCode.equals("") || couponCode.trim().length()==0) {
			return new ImplServiceReal();
		}else if(couponCode.equalsIgnoreCase("raj20")){
			return new ImplServiceProxy(20);
		}else if(couponCode.equalsIgnoreCase("raj10")){
			return new ImplServiceProxy(10);
		}else {
			return new ImplServiceReal();
		}
	}
}

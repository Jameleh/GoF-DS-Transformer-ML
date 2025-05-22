package com.dev.implserviceproxy;

import com.dev.implservicereal.ImplServiceReal;
import com.dev.service.MobileService;

public class ImplServiceProxy implements MobileService {
	
	private MobileService mobileService;
	private double discount;
	
	public ImplServiceProxy(double discount) {
		mobileService = new ImplServiceReal();
		this.discount=discount;
	}

	@Override
	public double buy(String[] item, double[] prices) {
		double bill = 0;
		for(double price:prices) {
			bill +=price;
		}
		return bill - (bill*discount/100);
	}
}

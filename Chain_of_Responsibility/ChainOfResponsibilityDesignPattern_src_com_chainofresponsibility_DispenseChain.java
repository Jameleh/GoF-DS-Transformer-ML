package com.chainofresponsibility;

public abstract class DispenseChain {
	
	
	public abstract void setNextChain(DispenseChain next);
	
	public abstract void dispense(Currency currency);
	

}

package com.home.observer.pattern;

public class StockObserver implements Observer{

	private double ibmPrice;
	private double applPrice;
	private double googPrice;
	
	private static int obsIDTracker = 0;
	private int observerID;
	
	private Subject subject;
	
	public StockObserver(Subject subject){
		this.subject = subject;
		this.observerID = ++obsIDTracker;
		System.out.println("---New observer : " + this.observerID + "---");
		
		this.subject.register(this);
		//subject.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double applPrice, double googPrice) {
		// TODO Auto-generated method stub
		
		this.ibmPrice = ibmPrice;
		this.applPrice = applPrice;
		this.googPrice = googPrice;
		System.out.println("Inside observer.update()");
		System.out.println("Observer ID::" +this.observerID + "\n IBMPrice::" + ibmPrice + "\n ApplePrice::" +applPrice + "\nGooglePrice::" +googPrice);
	}

}

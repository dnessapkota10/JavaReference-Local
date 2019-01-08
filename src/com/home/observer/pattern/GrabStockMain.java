package com.home.observer.pattern;

public class GrabStockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockGrabberSubject subject = new StockGrabberSubject();
		//Observer observer = new StockObserver(subject);
		
		subject.setIbmPrice(100.10);
		subject.setApplPrice(200.20);
		subject.setGoogPrice(300.30);
	}

}

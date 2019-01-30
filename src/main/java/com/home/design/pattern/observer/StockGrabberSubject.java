/**
 * 
 */
package com.home.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Dinesh
 *
 */
public class StockGrabberSubject implements Subject{

	private List<Observer> observers;
	private double ibmPrice;
	private double applPrice;
	private double googPrice;
	
	public StockGrabberSubject() {		
		observers = new ArrayList<Observer>();
	}
	
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		final int index = observers.indexOf(o);
		System.out.println("Observer " + index + 1 + " deleted!");
		observers.remove(index);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer observer : observers){
			observer.update(ibmPrice,applPrice,googPrice);
		}
	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public double getApplPrice() {
		return applPrice;
	}

	public void setApplPrice(double applPrice) {
		this.applPrice = applPrice;
		notifyObserver();
	}

	public double getGoogPrice() {
		return googPrice;
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

}
